package com.woo.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력"); //ex) 991223-1234567
		String jumin = sc.next();
		JuminCheck check = new JuminCheck();
		JuminCheck2 check2 = new JuminCheck2();
		
//		check.check1(jumin);
//		check.check2(jumin);
		
		check2.check(jumin);
		

	}

}
