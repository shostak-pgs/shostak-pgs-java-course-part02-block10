package by.htp.part02.block10.ex5.service;

import by.htp.part02.block10.ex5.bean.Bouquet;
import by.htp.part02.block10.ex5.bean.Packagee;
import by.htp.part02.block10.ex5.bean.Plant;

public interface BouquetService {

	public Bouquet createBouquet(Packagee pack);
	public void addPlant(Plant plant);
	public void deletePlant(Plant plant);
	public Packagee getPackagee(String str) throws ServiceException;
}
