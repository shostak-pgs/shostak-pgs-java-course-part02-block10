package by.htp.part02.block10.ex5.service.impl;

import java.util.HashMap;
import java.util.Map;
import by.htp.part02.block10.ex5.bean.Bouquet;
import by.htp.part02.block10.ex5.bean.Packagee;
import by.htp.part02.block10.ex5.bean.Plant;
import by.htp.part02.block10.ex5.service.BouquetService;
import by.htp.part02.block10.ex5.service.ServiceException;
import by.htp.part02.block10.ex5.service.util.Validator;

public class BouquetServiceImpl implements BouquetService {
	Map<String, Packagee> packMap = new HashMap<>();
	{	
	packMap.put("box", Packagee.BOX);
	packMap.put("film", Packagee.FILM);
	packMap.put("cloth", Packagee.CLOTH);
	packMap.put("paper", Packagee.PAPER);
	}
	
	@Override
	public Bouquet createBouquet(Packagee pack) {
		Bouquet bouquet = new Bouquet(pack);
		return bouquet;
	}

	@Override
	public void addPlant(Plant plant) {
		addPlant(plant);		
	}
	
	@Override
	public void deletePlant(Plant plant) {
				
	}
	
	public Packagee getPackagee(String str) throws ServiceException {
		if (Validator.isPackageValid(str) == true) {
		    Packagee pack = null;
		    for(Map.Entry pair : packMap.entrySet()) {
			    if (pair.getKey() == str) {
				    pack = (Packagee) pair.getValue();
			    }
		    }   		
		    return pack;
	    } else {
			throw new ServiceException("Неверный тип упаковки!");
		}
	}

}
