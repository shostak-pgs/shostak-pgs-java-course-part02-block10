package by.htp.part02.block10.ex5var.service.impl;

import java.util.HashMap;
import java.util.Map;
import by.htp.part02.block10.ex5var.bean.Candy;
import by.htp.part02.block10.ex5var.bean.Donut;
import by.htp.part02.block10.ex5var.bean.Gift;
import by.htp.part02.block10.ex5var.bean.Packagee;
import by.htp.part02.block10.ex5var.bean.Sweet;
import by.htp.part02.block10.ex5var.service.GiftService;
import by.htp.part02.block10.ex5var.service.ServiceException;
import by.htp.part02.block10.ex5var.service.util.Validator;

public class GiftServiceImpl implements GiftService {
	Map<String, Packagee> packMap = new HashMap<>();
	{	
	packMap.put("box", Packagee.BOX);
	packMap.put("film", Packagee.FILM);
	packMap.put("cloth", Packagee.CLOTH);
	packMap.put("paper", Packagee.PAPER);
	}
	
	Map<String, Sweet> sweetMap = new HashMap<String, Sweet>();
	{	
	sweetMap.put("cr", new Candy("CrazyBee", 4, "jelly"));
	sweetMap.put("cap", new Candy("Capital", 1, "chocoate"));
	sweetMap.put("al", new Candy("Alenka", 1, "chocolate"));
	sweetMap.put("asp", new Donut("Asp", 1, "strawberry"));
	sweetMap.put("desp", new Donut("Desp", 1, "banana"));
	}
		
	@Override
	public Gift createGift(Packagee pack) {
		Gift gift = new Gift(pack);
		return gift;
	}

	@Override
	public boolean addSweet(Gift gift, String str) throws ServiceException {	
		boolean truee = true;
		if (Validator.isPlantValid(str) == true) { 
			Sweet pattern = sweetMap.get(str);	
			Sweet pl;
			if (pattern.getClass().equals(Candy.class)) {
			    pl = new Candy(pattern.getName(), ((Candy) pattern).getPrice(), ((Candy) pattern).getKind());
			} else {
				pl = new Donut(pattern.getName(), ((Donut) pattern).getPrice(), ((Donut) pattern).getFilling());	
			}
		    gift.addSweet(pl);		    
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
