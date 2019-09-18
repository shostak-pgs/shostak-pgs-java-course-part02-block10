package by.htp.part02.block10.ex4.dragon_cave.bean;

/*
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
 *  дракона. Реализовать возможность: 
 *  - просмотра сокровищ, 
 *  - выбора самого дорогого по стоимости сокровища и 
 *  - выбора сокровищ на заданную сумму.
 */
public class Treasure {
    private String name;
    private double coast;
    
    public Treasure( String name, double coast) {
    	this.coast = coast;
    	this.name = name;
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCoast() {
		return coast;
	}
	public void setCoast(double coast) {
		this.coast = coast;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(coast);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Treasure other = (Treasure) obj;
		if (Double.doubleToLongBits(coast) != Double.doubleToLongBits(other.coast)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Treasure [name=" + name + ", coast=" + coast + "]";
	}   
    
}
