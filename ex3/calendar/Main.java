package by.htp.part02.block10.ex3.calendar;

import java.util.ArrayList;

import by.htp.part02.block10.ex3.calendar.Calendar.Month;
import by.htp.part02.block10.ex3.calendar.Calendar.Month.Week;
import by.htp.part02.block10.ex3.calendar.Calendar.Month.Week.Day;

public class Main {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		Calendar.Month month9 = calendar.new Month("September", new ArrayList<>()); 
		
		Week week1 = CalendarLogic.createWeek(month9, DayOfWeek.SUNDAY, 1, 1);
		week1.getDayList().get(0).setHoliday(true);
		Week week2 = CalendarLogic.createWeek(month9, DayOfWeek.MONDEY, 2, 7);
		Week week3 = CalendarLogic.createWeek(month9, DayOfWeek.MONDEY, 9, 7);
		Week week4 = CalendarLogic.createWeek(month9, DayOfWeek.MONDEY, 16, 7);
		Week week5 = CalendarLogic.createWeek(month9, DayOfWeek.MONDEY, 23, 7);
		Week week6 = CalendarLogic.createWeek(month9, DayOfWeek.MONDEY, 30, 1);
		
		month9.addWeek(week1);
		month9.addWeek(week2);
		month9.addWeek(week3);
		month9.addWeek(week4);
		month9.addWeek(week5);
		month9.addWeek(week6);
	
		calendar.addMonth(month9);
				
		print(calendar);
	}
	
	public static void print(Calendar calendar) {
		for (Month m : calendar.getMonthList()) {
			for (Week w : m.getWeekList()) {
				for (Day d : w.getDayList()) {
					System.out.printf("%s, %d, %s, выходной %s, праздничный %s %n", m.getName(), d.getDate(), d.getDayOfWeek(), d.isWeekend(), d.isHoliday() );
				}
			}
		}
	}

}
