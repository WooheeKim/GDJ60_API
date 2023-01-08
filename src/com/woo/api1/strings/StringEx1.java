package com.woo.api1.objects;

public class StringEx1 {

	public static void main(String[] args) {
		
		String phone = "010-1234-5678";
		int num = phone.indexOf('-', 0);
		System.out.println(num);
		
		boolean check = true;
		int idx = 0;
		
		while(check) {
			idx = phone.indexOf('-', idx);
			if(idx != -1) {
				System.out.println("IDX : "+idx);
				idx++;
			} else {
				break;
			}
		}
	}
}
