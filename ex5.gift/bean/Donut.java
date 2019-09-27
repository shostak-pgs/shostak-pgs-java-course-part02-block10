package by.htp.part02.block10.ex5var.bean;

public class Donut extends Sweet {	
	private double price;
	private String filling;

	public Donut(String name, double price, String filling) {
		super(name);
		this.setPrice(price);
		this.filling = filling;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getFilling() {
		return filling;
	}

	public void setFilling(String filling) {
		this.filling = filling;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((filling == null) ? 0 : filling.hashCode());
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
		Donut other = (Donut) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (filling == null) {
			if (other.filling != null) {
				return false;
			}
		} else if (!filling.equals(other.filling)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Donut [name = " + getName() + " price =" + price  + " filling =" + filling +"]";
	}

}
