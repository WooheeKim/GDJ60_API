package com.woo.api4.network.ex.clients;

import java.util.ArrayList;
import java.util.Scanner;

public class ClientController {
	
	private Scanner scanner;
	private ClientDAO clientDAO;
	private ClientView clientView;
	private ArrayList<ClientDTO> ar;
	
	
	public ClientController() {
		this.scanner = new Scanner(System.in);
		clientDAO = new ClientDAO();
		clientView = new ClientView();
	}
	
	public void start() {
		boolean check = true;
		
		while(check) {
			System.out.println("1. 전체학생정보출력");
			System.out.println("2. 학생정보검색출력");
			System.out.println("3. 학생정보추가");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 종료");
			int select = scanner.nextInt();
			
			switch(select) {
			case 0:
				ar = clientDAO.init();
				break;
			case 1:				
				clientView.view(ar);
				break;
			case 2:
				ClientDTO clientDTO = clientDAO.findByName(ar);
				if(clientDTO != null) {
					clientView.view(clientDTO);
				} else {
					clientView.view("찾는 학생이 없습니다.");
				}
				break;
			case 3:
				clientDAO.addStudent(ar);
				break;
			case 4:
				select = clientDAO.removeStudent(ar);
				if(select==1) {
					clientView.view("삭제 성공");
				} else {
					clientView.view("삭제 실패");
				}
				break;
			default:
				check =! check;
	
			}
			

			
		}
	}
	
}
