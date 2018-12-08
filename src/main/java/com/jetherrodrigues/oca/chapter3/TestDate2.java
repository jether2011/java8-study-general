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
public class TestDate2 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period period = Period.of(1, 2, 3); //year, month, days 
		date = date.minus(period);
		
		System.out.println(date.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
	}

}
