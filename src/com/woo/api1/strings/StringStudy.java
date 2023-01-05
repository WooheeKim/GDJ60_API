package com.woo.api1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = "abc";
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println(str==str2); // 주소
		
		boolean check = str.equals(str2); // 문자열 같은지 안같은지 할 때는 equals 쓰기
		System.out.println(check);
		
		char ch =  str2.charAt(0);
		System.out.println("Char : "+ch);
		Scanner sc = new Scanner(System.in);
//		sc.next().charAt(0);
		
		int num = str2.indexOf('c');
		System.out.println(num);
		
		
		
	}

}
