package by.htp.part02.block10.ex5.service;

import by.htp.part02.block10.ex5.bean.Bouquet;
import by.htp.part02.block10.ex5.bean.Packagee;
import by.htp.part02.block10.ex5.bean.Plant;

public interface BouquetService {

	public Bouquet createBouquet(Packagee pack);
	public boolean addPlant(Bouquet bouquet, String str) throws ServiceException;
	public Packagee getPackagee(String str) throws ServiceException;
}
