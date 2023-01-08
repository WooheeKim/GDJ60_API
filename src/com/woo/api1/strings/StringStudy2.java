package com.woo.api1.strings;

public class StringStudy2 {

	public static void main(String[] args) {
		
		String email = "k@im@dn@gml0@naver.com";
		
		int idx = email.lastIndexOf('@');
		System.out.println(idx);
		
		System.out.println(email.length());
		
		for(int i=0;i<email.length();i++) {
			System.out.println(email.charAt(i));
		}
		
//		String str = "";
//		String str2 = null; // 에러
//		System.out.println("Str : "+str.length());
		
		System.out.println("Before Email : "+email);
		email = email.replace('@', '_');
		System.out.println("After Email : "+email);
		
		
		
	}

}
