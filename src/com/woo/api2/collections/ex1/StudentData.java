package com.woo.api2.collections.ex1;

import java.util.StringTokenizer;

public class StudentData {
	
	private String data;
	
	public StudentData() {
		this.data="IU,1,90,60,70,Winter,2,86,84,75"
				+ "Suji,3,89,74,87,Choa,4,71,25,99";
	}
	public StudentDTO [] init() {
		StringTokenizer str = new StringTokenizer(this.data,",");
		StudentDTO [] students = new StudentDTO[str.countTokens()/5];
		int i=0;
		while(str.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(str.nextToken());
			studentDTO.setNum(Integer.parseInt(str.nextToken()));
			studentDTO.setKor(Integer.parseInt(str.nextToken()));
			studentDTO.setEng(Integer.parseInt(str.nextToken()));
			studentDTO.setMath(Integer.parseInt(str.nextToken()));
			students[i] = studentDTO;
			i++;
		}
		return students;
	}
	
}
