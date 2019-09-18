package by.htp.part02.block10.ex3.calendar;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить
 *  информацию о выходных и праздничных днях.
 */
public class Calendar {
    private List<Month> monthList;   

	public Calendar (List<Month> monthList) {
    	this.monthList = monthList;
    }    
	
	public Calendar() {
		monthList = new ArrayList<>();
	}

	public List<Month> getMonthList() {
		return monthList;
	}

	public void setMonthList(List<Month> monthList) {
		this.monthList = monthList;
	}
	
	public void addMonth(Month month) {
		monthList.add(month);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((monthList == null) ? 0 : monthList.hashCode());
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
		Calendar other = (Calendar) obj;
		if (monthList == null) {
			if (other.monthList != null) {
				return false;
			}
		} else if (!monthList.equals(other.monthList)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Month [weekList=" + monthList + "]";
	}
	
    
	class Month {
		private List<Week> weekList;
		private String name;
		
		public Month (String name, List<Week> list) {
			this.weekList = list;
			this.name = name;
		}

		public Month() {
			weekList = new ArrayList<>();
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		
		public List<Week> getWeekList() {
			return weekList;
		}

		public void setWeekList(List<Week> weekList) {
			this.weekList = weekList;
		}
		
		public void addWeek(Week week) {
			weekList.add(week);
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((weekList == null) ? 0 : weekList.hashCode());
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
			Month other = (Month) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
				return false;
			}
			if (weekList == null) {
				if (other.weekList != null) {
					return false;
				}
			} else if (!weekList.equals(other.weekList)) {
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
			return "Month [weekList=" + weekList + "name = " + name + "]";
		}	

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}
		
		class Week {			
			private List<Day> dayList;		

			public Week(List<Day> list) {
				this.dayList = list;
			}
			
			public Week() {	
				dayList = new ArrayList<>();
			}
			
			public List<Day> getDayList() {
				return dayList;
			}

			public void setDayList(List<Day> dayList) {
				this.dayList = dayList;
			}
			
			public void addDay(Day day) {
				dayList.add(day);
			}
	
			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + getEnclosingInstance().hashCode();
				result = prime * result + ((dayList == null) ? 0 : dayList.hashCode());
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
				Week other = (Week) obj;
				if (!getEnclosingInstance().equals(other.getEnclosingInstance())) {
					return false;
				}
				if (dayList == null) {
					if (other.dayList != null) {
						return false;
					}
				} else if (!dayList.equals(other.dayList)) {
					return false;
				}
				return true;
			}
			
			@Override
			public String toString() {
				return "Week [dayList=" + dayList + "]";
			}			
                			
			private Month getEnclosingInstance() {
				return Month.this;
			}	
			

			class Day {				
				private DayOfWeek dayOfWeek;				
				private int date;
				private boolean weekend = false;;
				private boolean holiday = false;;
				
				Day(DayOfWeek dayOfWeek, int date) {
					this.dayOfWeek = dayOfWeek;
					this.date = date;
				}
				
				Day(DayOfWeek dayOfWeek, int date, boolean weekend, boolean holiday) {
					this.dayOfWeek = dayOfWeek;
					this.date = date;
					this.weekend = weekend;
					this.holiday = holiday;
				}
				public DayOfWeek getDayOfWeek() {
					return dayOfWeek;
				}

				public void setDayOfWeek(DayOfWeek dayOfWeek) {
					this.dayOfWeek = dayOfWeek;
				}

				public int getDate() {
					return date;
				}

				public void setDate(int date) {
					this.date = date;
				}

				public boolean isWeekend() {
					return weekend;
				}

				public void setWeekend(boolean weekend) {
					this.weekend = weekend;
				}

				public boolean isHoliday() {
					return holiday;
				}

				public void setHoliday(boolean holiday) {
					this.holiday = holiday;
				}

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + getEnclosingInstance().hashCode();
					result = prime * result + date;
					result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
					result = prime * result + (holiday ? 1231 : 1237);
					result = prime * result + (weekend ? 1231 : 1237);
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
					Day other = (Day) obj;
					if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
						return false;
					if (date != other.date)
						return false;
					if (dayOfWeek != other.dayOfWeek)
						return false;
					if (holiday != other.holiday)
						return false;
					if (weekend != other.weekend)
						return false;
					return true;
				}
				
				@Override
				public String toString() {
					return "Day [dayOfWeek=" + dayOfWeek + ", date=" + date + ", weekend=" + weekend + ", holiday="
							+ holiday + "]";
				}

				private Week getEnclosingInstance() {
					return Week.this;
				}				
				
			}	
			
		}
		
	}
}
