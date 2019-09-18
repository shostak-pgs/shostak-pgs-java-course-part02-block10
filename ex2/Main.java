package by.htp.part02.block10.ex2;

import java.util.ArrayList;
import java.util.List;

import by.htp.part02.block10.ex2.Payment.Product;

public class Main {

	public static void main(String[] args) {

		Payment pay = new Payment();
		List<Product> products = new ArrayList<>();

		products.add(pay.new Product("Butter", 2));
		products.add(pay.new Product("Bread", 10));
		products.add(pay.new Product("Sweets", 4));
		products.add(pay.new Product("Coca-cola", 1));
		products.add(pay.new Product("Cofe", 4));
		products.add(pay.new Product("Tea", 2));

		pay.setProducts(products);

		PaymentLogic pl = new PaymentLogic();

		System.out.println(pl.takeTotalPrice(pay));

	}

}
