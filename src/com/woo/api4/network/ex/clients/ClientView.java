package com.woo.api4.network.ex.clients;

import java.util.ArrayList;

public class ClientView {
	
	public void view(String msg) {
		System.out.println(msg);
	}
	
	public void view(ArrayList<ClientDTO> ar) {
		for(ClientDTO clientDTO:ar) {
			this.view(clientDTO);
		}
	}
	
	public void view(ClientDTO clientDTO) {
		
		System.out.println("Name : "+clientDTO.getName());
		System.out.println("Num : "+clientDTO.getNum());
		System.out.println("Kor : "+clientDTO.getKor());
		System.out.println("Eng : "+clientDTO.getEng());
		System.out.println("Math : "+clientDTO.getMath());
		System.out.println("Total : "+clientDTO.getTotal());
		System.out.println("Avg : "+clientDTO.getAvg());
		
	}
	
}