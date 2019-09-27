package by.htp.part02.block10.ex5var.bean;

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
  Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок).
   Составляющими целого подарка являются сладости и упаковка.
 */

public class Gift {

	private Packagee pack;
	private List<Sweet> sweetList;
	private double price = 0;
	
	public Gift(Packagee pack) {
		this.setPack(pack);
		setSweetList(new ArrayList<>());
	}
	
	public Gift() {		
	}
	
	public Gift(Packagee pack, List<Sweet> sweetList) {
		this.setPack(pack);
		this.setSweetList(sweetList);
	}
	
	public void addSweet(Sweet sweet) {
		sweetList.add(sweet);
	}

	public Packagee getPack() {
		return pack;
	}	
	
	public void setPack(Packagee pack) {
		this.pack = pack;
	}

	public List<Sweet> getSweetList() {
		return sweetList;
	}

	public void setSweetList(List<Sweet> sweetList) {
		this.sweetList = sweetList;
	}
	
	public double getPrice() {
		double price = 0;
		for(Sweet pl : sweetList) {
			if (pl.getClass() == Candy.class) {
			price = price + ((Candy) pl).getPrice();
			} else if (pl.getClass() == Donut.class) {
				price = price + ((Donut) pl).getPrice();
			}
		}
		return price;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
		result = prime * result + ((sweetList == null) ? 0 : sweetList.hashCode());
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
		Gift other = (Gift) obj;
		if (pack != other.pack) {
			return false;
		}
		if (sweetList == null) {
			if (other.sweetList != null) {
				return false;
			}
		} else if (!sweetList.equals(other.sweetList)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Gift [pack=" + pack + ", sweetList=" + sweetList + "]";
	}

}
