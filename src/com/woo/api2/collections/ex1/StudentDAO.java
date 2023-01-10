package com.woo.api2.collections.ex1;

import java.util.StringTokenizer;

import com.woo.api1.strings.ex3.WeatherDTO;

public class StudentDAO {
	
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
	}
	
	public StudentDAO [] init() {
		StringTokenizer str = new StringTokenizer(this.data,",");
		StudentDAO [] students = new StudentDAO[str.countTokens()/4];
		int i = 0;
		while(str.hasMoreTokens()) {
			StudentDAO studentDAO = new StudentDAO();
			
			students[i] = studentDAO;
			i++;
		}
		return students;
	}
	
}
