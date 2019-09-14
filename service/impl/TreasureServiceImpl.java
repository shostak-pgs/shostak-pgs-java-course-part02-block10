package by.htp.part02.block10.ex4.dragon_cave.service.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.bean.TreasureList;
import by.htp.part02.block10.ex4.dragon_cave.service.TreasureService;

public class TreasureServiceImpl implements TreasureService {

	@Override
	public List<Treasure> viewTreasure(TreasureList trList) {		
		return trList.getTreasureList();
	}

	@Override
	public Treasure chooseByPrice(TreasureList trList) {
		double max = 0;
		Treasure treasure = null;
		for (Treasure tr : trList.getTreasureList()) {
			if (tr.getCoast() > max) {
				max = tr.getCoast();
				treasure = tr;
			}
		}
		return treasure;
	}

	@Override
	public Treasure chooseToTheAmount(TreasureList trList, double price) {
		Treasure treasure = null;	
		double pribl = price;
		double raz;	
			for (int i = 0; i < trList.getTreasureList().size(); i++) {
				raz = price - trList.getTreasureList().get(i).getCoast();
				if (raz > 0) {
				if (pribl > raz) {
					pribl = raz;					
					treasure = trList.getTreasureList().get(i);				
					}
				}
			}
					
		return treasure;
	}


}
