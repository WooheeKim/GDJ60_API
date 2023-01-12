package com.woo.api2.collections.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		// 학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		// 1. 학생정보초기화
		// 2. 학생정보전체조회
		// 3. 학생정보검색조회(이름으로 검색)
		// 4. 학생정보추가
		// 5. 학생정보삭제(이름으로 검색)
		// 6. 학생정보백업
		// 7. 프로그램 종료
		
//		StudentDAO dao = new StudentDAO();
//		ArrayList<StudentDTO> ar = dao.init();
//		
//		dao.addStudent(ar);
//		
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i).getName());
//		}
		
		// 향상된 for
//		for(StudentDTO studentDTO:ar) {
//			
//		}
//		int [] nums = new int [3];
//		
//		for(int n:nums) {
//			
//		}
		
//		File file = new File("C:\\fileTest", "a.txt");
//		
//		try {
//			FileWriter fw = new FileWriter(file);
//			fw.write("test\r\n");
//			fw.flush();
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		new StudentController().start();
	}

}
