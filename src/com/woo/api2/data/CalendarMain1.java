package com.woo.api2.data;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		// GregorianCalendar
		Calendar ca = new GregorianCalendar();
		// 현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONTH, 11);
		
		// 년도
		int year = ca.get(Calendar.YEAR);
		System.out.println("Year : "+year);
		// 월(달)은 0부터 시작
		int month = ca.get(Calendar.MONTH);
		System.out.println("Month : "+(month+1));
		// 일(날)
		int date = ca.get(Calendar.DATE);
		System.out.println("Date : "+date);
		// 요일(일월화수목금토) 0부터 시작x 1부터 시작 
		int day = ca.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day : "+day);
		// 시
		int hour = ca.get(Calendar.HOUR);
		System.out.println("Hour : "+hour);
		// 분
		int min = ca.get(Calendar.MINUTE);
		System.out.println("Minute : "+min);
		// 초
		int sec = ca.get(Calendar.SECOND);
		System.out.println("Second : "+sec);
		
		
	}

}
