package by.htp.part02.block10.ex5.service.impl;

import java.util.HashMap;
import java.util.Map;
import by.htp.part02.block10.ex5.bean.Bouquet;
import by.htp.part02.block10.ex5.bean.Flower;
import by.htp.part02.block10.ex5.bean.OrnamentalPlant;
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
	
	Map<String, Plant> plantMap = new HashMap<String, Plant>();
	{	
	plantMap.put("rose", new Flower("rose", 4, "red"));
	plantMap.put("tulip", new Flower("tulip", 1, "yellow"));
	plantMap.put("tulip", new Flower("clove", 1, "red"));
	plantMap.put("asp", new OrnamentalPlant("aspidistra", 1, "small"));
	plantMap.put("berg", new OrnamentalPlant("bergras", 1, "big"));
	}
		
	@Override
	public Bouquet createBouquet(Packagee pack) {
		Bouquet bouquet = new Bouquet(pack);
		return bouquet;
	}

	@Override
	public boolean addPlant(Bouquet bouquet, String str) throws ServiceException {	
		boolean truee = true;
		if (Validator.isPlantValid(str) == true) { 
			Plant pattern = plantMap.get(str);	
			Plant pl;
			if (pattern.getClass().equals(Flower.class)) {
			    pl = new Flower(pattern.getName(), ((Flower) pattern).getPrice(), ((Flower) pattern).getColor());
			} else {
				pl = new OrnamentalPlant(pattern.getName(), ((OrnamentalPlant) pattern).getPrice(), ((OrnamentalPlant) pattern).getSize());	
			}
		    bouquet.addPlant(pl);		    
	    } else {
	        truee = false;			
		}
		return truee;
	}	
	
	public Packagee getPackagee(String str) throws ServiceException {
		if (Validator.isPackageValid(str) == true) {
		    Packagee pack = null;
		    Packagee packagee;
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
