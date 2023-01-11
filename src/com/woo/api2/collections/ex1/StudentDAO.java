package com.woo.api2.collections.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StudentDAO {
	
	private StringBuffer sb;
	private Scanner sc;
	
	public StudentDAO() {
		this.sc = new Scanner(System.in);
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	// 학생정보백업
	// 현재시간을 파일명으로 해서 파일작성
	public void backupStudent(ArrayList<StudentDTO> ar) {
		File file = new File("C:\\fileTest", "student.txt");
		System.out.println(file.exists());
		
		
		try {
			FileWriter fw = new FileWriter(file);
			fw.write();
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
//		this.sb = new StringBuffer();
//		
//		StringBuffer name = sb;
//		try (FileWriter fw = new FileWriter(file)) {
//			fw.write(name+"\r\n");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}
	
	
	// 학생정보삭제
	public int removeStudent(ArrayList<StudentDTO> ar) {
		// 삭제확인용 변수
		// 0이면 삭제 실패, 1이면 삭제 성공
		int result = 0;
		
		System.out.println("삭제할 이름을 입력하세요 : ");
		String name = sc.next();
		// ar.remove(인덱스번호)
		// ar.remove(Objcet)
//		for(int i=0;i<ar.size();i++) {
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				result=1;
//				break;
//			}
//		}
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				ar.remove(studentDTO);
				result=1;
				break;
			}
		}
		return result;
		
	}
	
	
	// 학생정보추가
	public void addStudent(ArrayList<StudentDTO> ar) {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력하세요 : ");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력하세요 : ");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 점수를 입력하세요 : ");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 점수를 입력하세요 : ");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 점수를 입력하세요 : ");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		ar.add(studentDTO);
		
		
	}
	
	// 학생정보검색
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.println("검색할 이름 입력 : ");
		String name = sc.next();
		
		StudentDTO st = null;
		
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				st = studentDTO;
				break;
			}
		}		
		return st;
	}
	
	
	// 학생정보초기화
	public ArrayList<StudentDTO> init() {
		String data = this.sb.toString();
		data = data.replace(" ", "-");
		data = data.replace(",", "");
		
		System.out.println(data);
		StringTokenizer st = new StringTokenizer(data, "-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			ar.add(studentDTO);
			
		}
		
		return ar;
	}
	
}
