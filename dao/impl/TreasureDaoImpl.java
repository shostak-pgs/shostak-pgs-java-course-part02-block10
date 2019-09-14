package by.htp.part02.block10.ex4.dragon_cave.dao.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOException;
import by.htp.part02.block10.ex4.dragon_cave.dao.TreasureDao;

public class TreasureDaoImpl implements TreasureDao{

	@Override
	public List<Treasure> getListFromTxt(String str) throws DAOException {
		final String SOURSE = "C:\\1.txt.txt";
		List<Treasure> trList = new ArrayList<>();	
		try(BufferedReader readerr = new BufferedReader(new FileReader(SOURSE))) {			
			while(readerr.ready()) {
			String string = readerr.readLine();
			trList.add(new Treasure(string.split(" ")[0].toString(), Double.parseDouble(string.split(" ")[1])));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new DAOException();
		}		
		return trList;
	}
}
