package com.woo.api1.objects;

public class ObjectStudy {
	public static void main(String[] args) {
		// 객체 생성 공식
		Object object = new Object();
		
		
		// 멤버 사용(접근)
		// 참조변수명.변수명, 참조변수명.메서드명(){}
		int result = object.hashCode();
		System.out.println(result);
		
		String r = object.toString();
		System.out.println(r);
		System.out.println(object); // object.toString()
		
		Child child = new Child();
		Object obj = new Object();
		System.out.println(object==obj);
		boolean check = object.equals(obj);
		System.out.println(check);
		
		System.out.println(child.toString());
		System.out.println(child);
		System.out.println(child.hashCode());
		
		Object o = child; // 다형성
		
	}
}
