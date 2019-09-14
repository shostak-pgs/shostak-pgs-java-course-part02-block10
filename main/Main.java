package by.htp.part02.block10.ex4.dragon_cave.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.bean.TreasureList;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOException;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOProvider;
import by.htp.part02.block10.ex4.dragon_cave.service.ServiceProvider;
import by.htp.part02.block10.ex4.dragon_cave.service.TreasureService;

public class Main {

	public static void main(String[] args){
		
		TreasureList trList = new TreasureList(null);
		try {
			trList = new TreasureList(DAOProvider.getInstance().getTreasureDao().getListFromTxt("C://Treasure.txt"));
		} catch (DAOException e) {
		    System.out.println("DAOException");
		}
		
		ServiceProvider trProvider = ServiceProvider.getInstance();
		TreasureService trService = trProvider.getTreasureService();
		//тест1
		System.out.println(trService.chooseByPrice(trList));
		//тест2
		print(trService.viewTreasure(trList));
		//тест3
		System.out.println(trService.chooseToTheAmount(trList, 800));
	}
	
	public static void print(List<Treasure> list) {
		System.out.println(list);
	}
}
