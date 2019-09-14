package by.htp.part02.block10.ex4.dragon_cave.service;

import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.bean.TreasureList;

public interface TreasureService {  
    public Treasure chooseByPrice(TreasureList list);
    public Treasure chooseToTheAmount(TreasureList trList, double price);
	List<Treasure> viewTreasure(TreasureList trList);
	
}
