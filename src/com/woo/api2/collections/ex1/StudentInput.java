package com.woo.api2.collections.ex1;

import java.util.Scanner;

public class StudentInput {
	private Scanner sc;
	
	public StudentInput() {
		this.sc = new Scanner(System.in);
	}
	
	public StudentDAO search(StudentDAO [] studentDAOs) {
		System.out.println("학생정보검색 : ");
		String name = sc.next().toUpperCase();
		StudentDAO studentDAO = null;
		for(int i=0;i<studentDAOs.length;i++) {
			if(name.equals(studentDAOs[i].ge))
		}
		
	}
	
	
}
