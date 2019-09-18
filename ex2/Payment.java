package by.htp.part02.block10.ex2;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из 
 * нескольких товаров.
 */
public class Payment {	
	List<Product> products;

	public Payment(List<Product> products) {
		super();
		this.products = products;
	}

	public Payment() {
        products = new ArrayList<>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void add(String name, int price) {
		products.add(new Product(name, price));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		Payment other = (Payment) obj;
		if (products == null) {
			if (other.products != null) {
				return false;
			}
		} else if (!products.equals(other.products)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Payment [products=" + products + "]";
	}


	class Product {
		String name;
		int price;

		Product(String name, int price) {
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + price;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (price != other.price)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

	}

}
