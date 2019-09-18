package by.htp.part02.block10.ex2;

import java.util.List;
import by.htp.part02.block10.ex2.Payment.Product;

public class PaymentLogic {

	public int takeTotalPrice(Payment pay) {
		int price = 0;

		for (Product p : pay.getProducts()) {
			price = price + p.getPrice();
		}
		return price;
	}

}