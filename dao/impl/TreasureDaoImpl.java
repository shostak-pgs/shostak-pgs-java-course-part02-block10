package by.htp.part02.block10.ex4.dragon_cave.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Cave;
import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOException;
import by.htp.part02.block10.ex4.dragon_cave.dao.TreasureDao;

public class TreasureDaoImpl implements TreasureDao{

	@Override
	public List<Treasure> getTreasure() throws DAOException {
		final String SOURSE = "C:\\treasure.txt.txt";		
		List<Treasure> trList = new ArrayList<>();			
		try(BufferedReader readerr = new BufferedReader(new FileReader(SOURSE))) {			
			while(readerr.ready()) {
			    String[] string = getParams(readerr.readLine());			
			    trList.add(new Treasure(string[0], Double.parseDouble(string[1])));
			}
		} catch (Exception e) {			
			throw new DAOException(e);
		}		
		return trList;
	}
	
	private String[] getParams(String str) {
		String[] arr = new String[2];
		arr = str.split(" ");
		return arr;
	}
}
