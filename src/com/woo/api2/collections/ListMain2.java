package com.woo.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {

	public static void main(String[] args) {
		int [] arr = new int[3];
		ArrayList ar = new ArrayList();
		// 다형성
		ar.add(1); // Auto-Boxing
		ar.add(1.2);
		ar.add('a');
		ar.add(false);
		ar.add("hello");
		ar.add(new Scanner(System.in));
		
		int n1 = (Integer)ar.get(0);
		double n2 = (Double)ar.get(1);
		char n3 = (Character)ar.get(2);
		boolean n4 = (Boolean)ar.get(3);
		String n5 = (String)ar.get(4);
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		

	}

}