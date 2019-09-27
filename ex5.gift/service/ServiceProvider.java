package by.htp.part02.block10.ex5var.service;

import by.htp.part02.block10.ex5var.service.impl.GiftServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private ServiceProvider() {}
	
	private GiftService giftService = new GiftServiceImpl();
	
	public GiftService getGiftService() {
		return giftService;
	}

}
