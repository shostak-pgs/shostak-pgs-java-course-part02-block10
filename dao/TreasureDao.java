package by.htp.part02.block10.ex4.dragon_cave.dao;

import java.util.List;

import by.htp.part02.block10.ex4.dragon_cave.bean.Treasure;

public interface TreasureDao {
    List<Treasure> getListFromTxt(String str) throws DAOException;
}
