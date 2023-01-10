package com.woo.api2.collections.ex1;

public class StudentView {
	
	public void view(StudentDAO [] datas) {
		for(int i=0; i<datas.length;i++) {
			this.view(datas[i]);
		}
	}
	
	public void view(StudentDAO studentDAO) {
		System.out.println("----------------");
		System.out.println("학생 이름 : "+studentDAO);
		System.out.println("학생 번호 : "+studentDAO);
		System.out.println("국어 점수 : "+studentDAO);
		System.out.println("영어 점수 : "+studentDAO);
		System.out.println("수학 점수 : "+studentDAO);
		System.out.println("총합 점수 : "+studentDAO);
		System.out.println("평균 점수 : "+studentDAO);
	}
	
}
