package by.htp.part02.block10.ex3.calendar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import by.htp.part02.block10.ex3.calendar.DayOfWeek;
import by.htp.part02.block10.ex3.calendar.Calendar;
import by.htp.part02.block10.ex3.calendar.Calendar.Month;
import by.htp.part02.block10.ex3.calendar.Calendar.Month.Week;
import by.htp.part02.block10.ex3.calendar.Calendar.Month.Week.Day;

public class CalendarLogic {

	public static Week createWeek(Month month, DayOfWeek first, int date, int length) {
		Week week = month.new Week();	
		int firstDay = 0;
		HashMap<Integer, DayOfWeek> map = new HashMap<>();
		
		map.put(0, DayOfWeek.MONDEY);								
		map.put(1, DayOfWeek.TUESDAY);
		map.put(2, DayOfWeek.WEDNESDAY);
		map.put(3, DayOfWeek.THURSDAY);
		map.put(4, DayOfWeek.FRIDAY);
		map.put(5, DayOfWeek.SATURDAY);
		map.put(6, DayOfWeek.SUNDAY);
		
		for (Map.Entry<Integer, DayOfWeek> pair : map.entrySet()) {
			if(pair.getValue().equals(first)) {
				firstDay = pair.getKey();				
				break;
			}
		}
		
		for (int i = 0; i < length; i++) {	
			if (firstDay == 5 || firstDay == 6) {
				Day d = week.new Day(map.get(firstDay), date, true, false);
				week.addDay(d);
			} else {
			Day d = week.new Day(map.get(firstDay), date);
			week.addDay(d);
			}
			firstDay++;
			date++;
			if (firstDay == 7) {
				firstDay -= 7; 
			}
		}

		return week;	
	}
}
