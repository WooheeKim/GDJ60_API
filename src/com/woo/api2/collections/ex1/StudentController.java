package com.woo.api2.collections.ex1;

import java.util.Scanner;

public class StudentController {
	
	private Scanner sc;
	private StudentView studentView;
	private StudentInput studentInput;
	private StudentDTO studentDAOs;
	
	public StudentController() {
		this.sc = new Scanner(System.in);
		this.studentDAO = new StudentDTO();
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
				studentDAO = studentDAO.init();
				System.out.println("학생정보가 초기화되었습니다.");
				break;
			case 2:
				studentView.view(studentDAO);
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
