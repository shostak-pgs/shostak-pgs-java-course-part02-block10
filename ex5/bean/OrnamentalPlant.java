package by.htp.part02.block10.ex5.bean;

public class OrnamentalPlant extends Plant {	
	private double price;

	public OrnamentalPlant(String name, double price) {
		super(name);
		this.setPrice(price);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		OrnamentalPlant other = (OrnamentalPlant) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "OrnamentalPlant [name = " + getName() + " price=" + price + "]";
	}


}
