package com.woo.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ClientDAO {
	
	private StringBuffer sb;
	private Scanner scanner;
	
	public ClientDAO() {
		this.scanner = new Scanner(System.in);
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99");
	}
	
	///
	public ArrayList<ClientDTO> init() {
		File file = new File("C:\\fileTest");
		
		String [] names = file.list();
		long max = 0;
		for(String name:names) {
			name = name.substring(0, name.lastIndexOf("."));
			long date = Long.parseLong(name);
			
			if(date > max) {
				max = date;
			}
		}
		file = new File(file, max+".txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<ClientDTO> ar = new ArrayList<>();
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = null;
			while((data=br.readLine()) != null) {
				data = data.replace(" ","-");
				data = data.replace(",", "");
				StringTokenizer st = new StringTokenizer(data, "-");
				
				ClientDTO clientDTO = new ClientDTO();
				clientDTO.setName(st.nextToken());
				clientDTO.setNum(Integer.parseInt(st.nextToken()));
				clientDTO.setKor(Integer.parseInt(st.nextToken()));
				clientDTO.setEng(Integer.parseInt(st.nextToken()));
				clientDTO.setMath(Integer.parseInt(st.nextToken()));
				clientDTO.setTotal(clientDTO.getKor()+clientDTO.getEng()+clientDTO.getMath());
				clientDTO.setAvg(clientDTO.getTotal()/3.0);
				ar.add(clientDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {
				
			}
			
		}
		return ar;
	}
	
	// 1. 전체학생정보출력
	
	// 2. 학생정보검색출력
	public ClientDTO findByName(ArrayList<ClientDTO> ar) {
		System.out.println("검색할 학생 입력 :");
		String name = scanner.next();
		
		ClientDTO cd = null;
		
		for(ClientDTO clientDTO:ar) {
			if(name.equals(clientDTO.getName())) {
				cd = clientDTO;
				break;
			}
		}
		return cd;
	}
	// 3. 학생정보추가
	public void addStudent(ArrayList<ClientDTO> ar) {
		ClientDTO clientDTO = new ClientDTO();
		System.out.println("학생을 입력하세요 : ");
		clientDTO.setName(scanner.next());
		System.out.println("번호를 입력하세요 : ");
		clientDTO.setNum(scanner.nextInt());
		System.out.println("국어를 입력하세요 : ");
		clientDTO.setKor(scanner.nextInt());
		System.out.println("영어를 입력하세요 : ");
		clientDTO.setEng(scanner.nextInt());
		System.out.println("수학을 입력하세요 : ");
		clientDTO.setMath(scanner.nextInt());
		clientDTO.setTotal(clientDTO.getKor()+clientDTO.getEng()+clientDTO.getMath());
		clientDTO.setAvg(clientDTO.getTotal()/3.0);
		ar.add(clientDTO);
		
	}
	// 4. 학생정보삭제
	public int removeStudent(ArrayList<ClientDTO> ar) {
		int result = 0;
		
		System.out.println("삭제할 학생을 입력하세요 : ");
		String name = scanner.next();
		
		for(ClientDTO clientDTO:ar) {
			if(name.equals(clientDTO.getName())) {
				ar.remove(clientDTO);
				result = 1;
				break;
			}
		}
		return result;
	}
	
}
