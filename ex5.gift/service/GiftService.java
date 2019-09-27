package by.htp.part02.block10.ex5var.service;

import by.htp.part02.block10.ex5var.bean.Packagee;
import by.htp.part02.block10.ex5var.bean.Gift;

public interface GiftService {

	public Gift createGift(Packagee pack);
	public boolean addSweet(Gift gift, String str) throws ServiceException;
	public Packagee getPackagee(String str) throws ServiceException;
}
