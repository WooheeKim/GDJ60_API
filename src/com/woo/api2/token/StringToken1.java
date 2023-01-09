package com.woo.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,도쿄";
		
//		String [] n = nations.split(",");
//		
//		for(int i=0;i<n.length;i++) {
//			NationDTO nationDTO = new NationDTO();
//			nationDTO.setName(n[i]);
//			nationDTO.setCity(n[++i]);
//		} // 하나하나를 쪼갤 때는 split이 편함
		
		StringTokenizer str = new StringTokenizer(nations,",");
		
		while(str.hasMoreTokens()) {
			NationDTO nationDTO = new NationDTO();
			
			String t1 = str.nextToken();
			nationDTO.setName(t1);
			
			String t2 = str.nextToken();
			nationDTO.setCity(t2);
			
			System.out.println(t1);
			System.out.println(t2);
			
		}
		
		
		

	}

}
