package by.htp.part02.block10.ex5.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import by.htp.part02.block10.ex5.service.ServiceException;
import by.htp.part02.block10.ex5.bean.OrnamentalPlant;
import by.htp.part02.block10.ex5.bean.Packagee;
import by.htp.part02.block10.ex5.service.BouquetService;
import by.htp.part02.block10.ex5.service.ServiceProvider;

public class Main {

	public static void main(String[] args) {
		BouquetService service = ServiceProvider.getInstance().getBouquetService();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Здраствуйте. Выберите тип упаковки(film, cloth, paper, box)");
		String pack = reader.readLine();
		Packagee packagee = service.getPackagee(pack);
			service.createBouquet(packagee);
		} catch (IOException e) {
			System.out.println("Ошибка чтения");
		} catch (ServiceException e) {
		System.out.println(e);
	}
		
	}
	/*
	 * ROSE("rose", 4, "red"),
	TULIP("tulip", 1, "yellow"),
	CLOVE("clove", 2, "red");
	 */

}
