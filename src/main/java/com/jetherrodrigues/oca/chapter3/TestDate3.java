package com.jetherrodrigues.oca.chapter3;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * 
 * @author jether
 *
 */
public class TestDate3 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period period = Period.ofDays(1).ofYears(2); //the value returned is just of the ".ofYears(2)"
		date = date.minus(period);
		
		System.out.println(date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
	}

}
