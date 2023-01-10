package com.woo.api2.util;

import java.util.Arrays;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		// 1000원 로또 구매 1-45 번호 6개를 랜덤으로 추출
//		int num = random.nextInt(1,46);
//		
//		System.out.println(num);
		 
		int [] lotto = new int[6]; // 정수 배열 생성
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1; // 정수 생성
			
			for(int j=0;j<i;j++) {
				if(lotto[j]==lotto[i]) {
					i--;  // 여기서 i를 감소시키는 것은 중복된 숫자가 발생했을 시
				}		  // 마지막에 추가된 중복을 배열에서 제거함으로 기존 추가된 다른 값에는 영향 없음
			}
			
		}
		Arrays.sort(lotto); // 오름차순으로 정렬
		
		System.out.println(Arrays.toString(lotto)); // System.out.println(lotto)시 참조값(주소값) 출력
		
	}
		

}
