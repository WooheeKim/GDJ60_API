package com.woo.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// 순서가 유지되고, 값의 중복 허용, 배열기반
		int [] arr = new int [3];
		ArrayList ar = new ArrayList();
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		// add 새로운 데이터 추가
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("================");
		
		ar.add(1, 8); // add( , ) : 뒤로 끼워놓고 뒤에 값들은 뒤로 밀림
		ar.remove(0); // remove : 삭제
		ar.set(2, 9); // set : 수정
//		ar.clear(); // clear : 전체 삭제
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		

	}

}
