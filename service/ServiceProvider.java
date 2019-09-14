package by.htp.part02.block10.ex4.dragon_cave.service;

import by.htp.part02.block10.ex4.dragon_cave.service.impl.TreasureServiceImpl;

public class ServiceProvider {
    private static final ServiceProvider instance = new ServiceProvider();
    
    private ServiceProvider(){    	
    };
    
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private TreasureService treasureService = new TreasureServiceImpl();
   
	public TreasureService getTreasureService() {
    	return treasureService;
    }
    
}
