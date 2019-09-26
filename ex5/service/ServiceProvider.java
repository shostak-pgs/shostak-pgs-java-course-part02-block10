package by.htp.part02.block10.ex5.service;

import by.htp.part02.block10.ex5.service.BouquetService;
import by.htp.part02.block10.ex5.service.impl.BouquetServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private ServiceProvider() {}
	
	private BouquetService bouquetService = new BouquetServiceImpl();
	
	public BouquetService getBouquetService() {
		return bouquetService;
	}

}
