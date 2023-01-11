package com.woo.api2.data;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		// 95 09 14
		birth.set(1995, 8, 14);
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
		
		// 현재시간을 밀리세컨즈로 변환
		long n = now.getTimeInMillis();
		long s = birth.getTimeInMillis();
		
		n = n-s;
		
		n = n/(1000*60*60*24);
		n = n/365;
		
		
		System.out.println("n : "+n);
		System.out.println("s : "+s);
		
		System.out.println(now.getTime());
		System.out.println(sample.getTime());
		System.out.println(birth.getTime());
		
	}

}
