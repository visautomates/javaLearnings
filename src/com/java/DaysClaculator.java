package com.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DaysClaculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner date = new Scanner(System.in);
		System.out.println("Enter the first date format in dd MM yyyy format");
		String startDate = date.next();
		System.out.println("Enter the first date format in dd MM yyyy format");
		String endDate = date.next();
		CalculateNumberofDays(startDate, endDate);
	}

	public static void CalculateNumberofDays(String startDate, String endDate) {

		SimpleDateFormat myFormat = new SimpleDateFormat("ddMMyyyy");

		try {
			Date date1 = myFormat.parse(startDate);
			Date date2 = myFormat.parse(endDate);
			long diff = date2.getTime() - date1.getTime();
			System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
