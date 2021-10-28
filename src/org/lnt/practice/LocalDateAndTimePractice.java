
package org.lnt.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class LocalDateAndTimePractice {
	public static void main(String[] args) {
		LocalDate date= LocalDate.now();
		System.out.println(date);
		LocalDate minusDays = date.minusDays(2);
		System.out.println(minusDays);
		LocalDateTime atStartOfDay = minusDays.atStartOfDay();
		System.out.println(atStartOfDay);
		Temporal adjustInto = date.adjustInto(atStartOfDay);
		System.out.println(adjustInto);
		LocalDateTime atStartOfDay2 = date.atStartOfDay();
		System.out.println(atStartOfDay2);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println(previousMonthSameDay);
		DayOfWeek dayOfWeek = previousMonthSameDay.getDayOfWeek();
		System.out.println(dayOfWeek);
		DayOfWeek dayOfWeek2 = date.getDayOfWeek();
		System.out.println(dayOfWeek2);
		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalTime parse = LocalTime.parse("08:57");
		System.out.println(parse);
		LocalTime of = LocalTime.of(23,30);
		System.out.println(of);
	}
	
	
	

}
