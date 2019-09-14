package by.htp.part02.block10.ex4.dragon_cave.bean;

import java.util.List;

public class TreasureList {
    private List<Treasure> treasureList;
    
    public TreasureList(List<Treasure> treasureList) {  
    	this.treasureList = treasureList;
    }

	public List<Treasure> getTreasureList() {
		return treasureList;
	}

	public void setTreasureList(List<Treasure> treasureList) {
		this.treasureList = treasureList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((treasureList == null) ? 0 : treasureList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return false;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TreasureList other = (TreasureList) obj;
		if (this.treasureList == null) {
			if (other.treasureList != null) {
				return false;
			}
		} else if (!this.treasureList.equals(other.treasureList)) {
			return false;
		} return true;	
		
	}

	@Override
	public String toString() {
		String str = "";
		for (Treasure treasure: treasureList) {
			str = str + treasure + " ";
		}
		return "Treasure [" + str + " ]";
	}	
}
