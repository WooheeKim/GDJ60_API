package com.woo.api2.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		// 1000원 로또 구매 1-45 번호 6개를 랜덤으로 추출
		
		// 1. 배열
//		int [] nums = new int[6];
//		
//		for(int i=0;i<nums.length;i++) {
//			
//			 nums[i] = random.nextInt(45)+1;
//			 for(int j=0;j<i;j++) {
//				 if(nums[i]==nums[j]) {
//					 i--;
//					 break;
//				 }
//			 }
//		}
//		
//		for(int i=0;i<nums.length;i++) {
//			
//			 System.out.println(nums[i]);
//		}
		
		// 2. ArrayList
		int [] nums = new int[6];
		ArrayList<Integer> ar = new ArrayList<>();
		
		while(ar.size()<6) {
			
			int n = random.nextInt(45)+1;
			boolean check = true;
			
			for(int i=0;i<ar.size();i++) {
				if(n == ar.get(i)) {
					check = false;
					break;
				}
			}
			
			if(check) {
				ar.add(n);
			}
			
		}
		
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		// 3. Set
//		HashSet<Integer> hs = new HashSet<>();
//		
//		while(hs.size()<6) {
//			hs.add(random.nextInt(45)+1);
//		}
//		
//		System.out.println(hs);
		
		// 구글링 [배열]
//		int [] lotto = new int[6]; // 정수 배열 생성
//		
//		for(int i=0;i<lotto.length;i++) {
//			lotto[i] = (int)(Math.random()*45)+1; // 정수 생성
//			
//			for(int j=0;j<i;j++) {
//				if(lotto[j]==lotto[i]) {
//					i--;  // 여기서 i를 감소시키는 것은 중복된 숫자가 발생했을 시
//				}		  // 마지막에 추가된 중복을 배열에서 제거함으로 기존 추가된 다른 값에는 영향 없음
//			}
//			
//		}
//		Arrays.sort(lotto); // 오름차순으로 정렬
//		
//		System.out.println(Arrays.toString(lotto)); // System.out.println(lotto)시 참조값(주소값) 출력
		
	}
		

}
