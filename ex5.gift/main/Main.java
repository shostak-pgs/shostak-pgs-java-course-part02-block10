package by.htp.part02.block10.ex5var.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import by.htp.part02.block10.ex5var.bean.Candy;
import by.htp.part02.block10.ex5var.bean.Donut;
import by.htp.part02.block10.ex5var.bean.Gift;
import by.htp.part02.block10.ex5var.bean.Packagee;
import by.htp.part02.block10.ex5var.service.GiftService;
import by.htp.part02.block10.ex5var.service.ServiceException;
import by.htp.part02.block10.ex5var.service.ServiceProvider;

public class Main {

	public static void main(String[] args) {
		GiftService service = ServiceProvider.getInstance().getGiftService();
		Gift bq = new Gift();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Здраствуйте. Выберите тип упаковки(film, cloth, paper, box). Для выхода нажмите E");
		    String pack = reader.readLine();
		    if (!pack.contentEquals("e") ) {		
		        Packagee packagee = service.getPackagee(pack);
			    bq = service.createGift(packagee);
			    while(true) {			    	
				    System.out.println("Выбери сладость (cr, cap, al, asp, desp). Для выхода нажмите E)");
				    String sweet = reader.readLine();
				    if (!sweet.equals("e") ) {					
					    if (service.addSweet(bq, sweet) == false) {
					    	System.out.println("Неверный ввод. Попробуй еще раз");
					    }
			    	} else { 
					    System.out.println("Цена подарка: " + bq.getPrice());
					    break;
				    }
			    }
		    } else {
				  System.out.println("Отказ от покупки");				  
			}		
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Ошибка чтения");
		} catch (ServiceException e) {
			e.printStackTrace();
		System.out.println(e);		
	    }	
	}
}
