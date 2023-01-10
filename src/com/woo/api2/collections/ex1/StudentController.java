package com.woo.api2.collections.ex1;

import java.util.Scanner;

public class StudentController {

	private Scanner sc;
	private StudentView studentView;
	private StudentDAO [] studentDAOs;
	
	public StudentController() {
		this.sc = new Scanner(System.in);
		studentView = new StudentView();
	}
	
	public void start() {
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생정보초기화");
			System.out.println("2. 학생정보전체조회");
			System.out.println("3. 학생정보검색조회");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 학생정보삭제");
			System.out.println("6. 종	료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			default:
				check =! check;
					
			}
		}
	}
}
