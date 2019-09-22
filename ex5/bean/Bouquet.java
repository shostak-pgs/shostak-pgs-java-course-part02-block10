package by.htp.part02.block10.ex5.bean;

import java.util.ArrayList;
import java.util.List;
/*
 * Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих
  шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
   Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные 
   композиции (объект, представляющий собой цветочную композицию).
   Составляющими цветочной композиции являются цветы и упаковка.
 */

public class Bouquet {

	private Packagee pack;
	private List<Plant> plantList;
	private double price = 0;
	
	public Bouquet(Packagee pack) {
		this.setPack(pack);
		setPlantList(new ArrayList<>());
	}
	
	public Bouquet() {
		
	}
	
	public Bouquet(Packagee pack, List<Plant> plantList) {
		this.setPack(pack);
		this.setPlantList(plantList);
	}
	
	public void addPlant(Plant plant) {
		plantList.add(plant);
	}

	public Packagee getPack() {
		return pack;
	}	
	
	public void setPack(Packagee pack) {
		this.pack = pack;
	}

	public List<Plant> getPlantList() {
		return plantList;
	}

	public void setPlantList(List<Plant> plantList) {
		this.plantList = plantList;
	}
	
	public double getPrice() {
		double price = 0;
		for(Plant pl : plantList) {
			if (pl.getClass() == Flower.class) {
			price = price + ((Flower) pl).getPrice();
			} else if (pl.getClass() == OrnamentalPlant.class) {
				price = price + ((OrnamentalPlant) pl).getPrice();
			}
		}
		return price;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
		result = prime * result + ((plantList == null) ? 0 : plantList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Bouquet other = (Bouquet) obj;
		if (pack != other.pack) {
			return false;
		}
		if (plantList == null) {
			if (other.plantList != null) {
				return false;
			}
		} else if (!plantList.equals(other.plantList)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Bouquet [pack=" + pack + ", plantList=" + plantList + "]";
	}

}
