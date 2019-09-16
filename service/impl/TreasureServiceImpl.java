package by.htp.part02.block10.ex4.dragon_cave.service.impl;

import java.util.ArrayList;

import java.util.List;
import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOException;
import by.htp.part02.block10.ex4.dragon_cave.bean.Cave;
import by.htp.part02.block10.ex4.dragon_cave.service.TreasureService;
import by.htp.part02.block10.ex4.dragon_cave.service.impl.TreasureServiceImpl;
import by.htp.part02.block10.ex4.dragon_cave.service.ServiceException;
import by.htp.part02.block10.ex4.dragon_cave.dao.DAOProvider;
import by.htp.part02.block10.ex4.dragon_cave.dao.TreasureDao;
import by.htp.part02.block10.ex4.dragon_cave.service.util.Validator;

public class TreasureServiceImpl implements TreasureService {
	
	private Cave getCave() throws ServiceException {
		Cave cave;
	if (!Validator.isCredentialValid("Command")) {
		throw new ServiceException("!!!!! !!!! !!!!!");
	}
	
	DAOProvider provider = DAOProvider.getInstance();
	TreasureDao treasureDao = provider.getTreasureDao();	

	try {
		cave = new Cave(treasureDao.getTreasure());
	} catch (DAOException e) {
		throw new ServiceException(e);
	}
	return cave;
   }

	@Override
	public List<Treasure> getTreasure() throws ServiceException{	
		Cave trList = getCave();
		return trList.getTreasureList();
	}

	@Override
	public Treasure chooseByPrice() throws ServiceException{
		Cave trList = getCave();
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
	public Treasure chooseToTheAmount(double price) throws ServiceException{
		Cave trList = getCave();
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
