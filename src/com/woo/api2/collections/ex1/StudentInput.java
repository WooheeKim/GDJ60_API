package com.woo.api2.collections.ex1;

import java.util.Scanner;

public class StudentInput {
	private Scanner sc;
	
	public StudentInput() {
		this.sc = new Scanner(System.in);
	}
	
	// Search
	public StudentDTO search(StudentDTO [] studentDAOs) {
		System.out.println("학생정보검색 : ");
		String name = sc.next().toUpperCase();
		StudentDTO studentDAO = null;
		for(int i=0;i<studentDAOs.length;i++) {
			if(name.equals(studentDAOs[i].getName().toUpperCase())) {
				studentDAO = studentDAOs[i];
				break;
			}
		}
		return studentDAO;
	}
	
	// Add
	public StudentDTO [] add(StudentDTO [] studentDAOs) {
		StudentDTO studentDAO = new StudentDTO();
		System.out.println("학생 이름 : ");
		studentDAO.setName(sc.next());
		System.out.println("학생 번호 : ");
		studentDAO.setNum(sc.nextInt());
		System.out.println("국어 점수 : ");
		studentDAO.setKor(sc.nextInt());
		System.out.println("영어 점수 : ");
		studentDAO.setEng(sc.nextInt());
		System.out.println("수학 점수 : ");
		studentDAO.setMath(sc.nextInt());
		System.out.println("총합 점수 : ");
		studentDAO.setTotal(sc.nextInt());
		StudentDTO [] newInfo = new StudentDTO[studentDAOs.length+1];
		
		for(int i=0;i<studentDAOs.length;i++) {
			newInfo[i] = studentDAOs[i];
		}
		
		newInfo[studentDAOs.length] = studentDAO;
		
		return newInfo;
	}
	
	// Remove
	public StudentDTO [] remove(StudentDTO [] studentDAOs) {
		StudentDTO [] newInfo = new StudentDTO[studentDAOs.length-1];
		System.out.println("학생정보삭제");
		String name = sc.next().toUpperCase();
		int idx=0;
		for(int i=0;i<studentDAOs.length;i++) {
			if(name.equals(studentDAOs[i].getName().toUpperCase())) {
				continue;
			}
			newInfo[idx] = studentDAOs[i];
			idx++;
		}
		return newInfo;
	}
	
	
}
