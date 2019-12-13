package com.tcs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d =  LocalDate.now(); //immmutable
		d = LocalDate.of(1992, Month.FEBRUARY, 8);
		System.out.println(d);
		LocalTime t = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t);
	}

}
