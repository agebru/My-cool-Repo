package com.corejava;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;




public class DateApiDemo {

	public static void main(String[] args) {
		LocalDate from =LocalDate.of(1987, Month.MAY, 21);
		LocalDate to=LocalDate.of(2018, Month.JULY, 29);
		
		
		
		
		//final Duration duration=Duration.between(from, to);
		
		
		long days=	Duration.between(from.atStartOfDay(), to.atStartOfDay()).toDays();
		System.out.println("Abebe's Age:"+days/365);
		
		


		

		
		
		Duration duration=Duration.between(from.atStartOfDay(), to.atStartOfDay());
		long numDays=duration.toDays();
		System.out.println(" Age: "+numDays/365);
		
		Period period=Period.between(from, to);
			int years=period.getYears();
			int months=period.getMonths();
			int dayss=period.getDays();
			System.out.println("Total Months:"+period.toTotalMonths());
			System.out.println("Age ==> "+years+" years  "+months+" months "+dayss+" days");
			
			// subtracting years, months,days
			period.minusMonths(2);
			System.out.println("New Age ==> "+years+" years  "+period.getMonths()+" months "+dayss+" days");
	
	}

}
