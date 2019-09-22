package by.htp.part02.block10.ex5.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.htp.part02.block10.ex5.service.ServiceException;
import by.htp.part02.block10.ex5.bean.Bouquet;
import by.htp.part02.block10.ex5.bean.Flower;
import by.htp.part02.block10.ex5.bean.OrnamentalPlant;
import by.htp.part02.block10.ex5.bean.Packagee;
import by.htp.part02.block10.ex5.bean.Plant;
import by.htp.part02.block10.ex5.service.BouquetService;
import by.htp.part02.block10.ex5.service.ServiceProvider;

public class Main {

	public static void main(String[] args) {
		BouquetService service = ServiceProvider.getInstance().getBouquetService();
		Bouquet bq = new Bouquet();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Здраствуйте. Выберите тип упаковки(film, cloth, paper, box. Для выхода нажмите E");
		    String pack = reader.readLine();
		    if (!pack.contentEquals("e") ) {		
		        Packagee packagee = service.getPackagee(pack);
			    bq = service.createBouquet(packagee);
			    while(true) {
				    System.out.println("Выбери цветок (rose, tulip, clove, asp, berg. Для выхода нажмите E)");
				    String plant = reader.readLine();
				    if (!plant.equals("e") ) {					
					    if (service.addPlant(bq, plant) == false) {
					    	System.out.println("Неверный ввод. Попробуй еще раз");
					    }
			    	} else { 
					    System.out.println("Цена букета: " + bq.getPrice());
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
