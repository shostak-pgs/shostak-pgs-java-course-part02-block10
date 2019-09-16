package by.htp.part02.block10.ex4.dragon_cave.service;

import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.bean.Cave;

public interface TreasureService {  
    public Treasure chooseByPrice() throws ServiceException;
    public Treasure chooseToTheAmount(double price) throws ServiceException;
	List<Treasure> getTreasure() throws ServiceException;
	
}
