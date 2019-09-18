package by.htp.part02.block10.ex4.dragon_cave.main;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.service.ServiceException;
import by.htp.part02.block10.ex4.dragon_cave.bean.Cave;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOException;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOProvider;
import by.htp.part02.block10.ex4.dragon_cave.service.ServiceProvider;
import by.htp.part02.block10.ex4.dragon_cave.service.TreasureService;

public class Main {

	public static void main(String[] args){		

		TreasureService trService = ServiceProvider.getInstance().getTreasureService();
		
		try {
		//тест1
		System.out.println(trService.chooseByPrice());
		//тест2
		print(trService.getTreasure());
		//тест3
		System.out.println(trService.chooseToTheAmount(300));
		} catch (ServiceException e){
			System.out.println("Error!");
		}
	}
	
	public static void print(List<Treasure> list) {
		System.out.println(list);
	}
}
