package by.htp.part02.block10.ex4.dragon_cave.dao;

import by.htp.part02.block10.ex4.dragon_cave.dao.impl.TreasureDaoImpl;

public class DAOProvider {

private static final DAOProvider instance = new DAOProvider();
	
	public static DAOProvider getInstance() {
		return instance;
	}	
	
	private DAOProvider() {}	
	
	private TreasureDao treasureDao = new TreasureDaoImpl();

	public TreasureDao getTreasureDao() {
		return treasureDao;
	}	
	
}
