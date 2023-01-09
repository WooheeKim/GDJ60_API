package com.woo.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	private Scanner sc;
	
	public WeatherInput() {
		this.sc = new Scanner(System.in);
	}
	
	// search
	// 배열을 받고, 키보드로부터 검색할 도시명(대소문자무관)을 입력 받음
	// 찾은 DTO 리턴, 없으면 null
	public WeatherDTO search(WeatherDTO [] weatherDTOs) {
		System.out.println("검색 할 도시명 입력");
		String name = sc.next().toUpperCase();
		WeatherDTO weatherDTO = null;
		for(int i=0;i<weatherDTOs.length;i++) {
			if(name.equals(weatherDTOs[i].getCity().toUpperCase())) {
				weatherDTO = weatherDTOs[i];
				break;
			}
		}
		return weatherDTO;
	}
	
	// add
	// 배열을 받고, 키보드로부터 정보들을 입력 받음
	// 배열에 추가하고 배열을 리턴
	public WeatherDTO [] add(WeatherDTO [] weatherDTOs) {
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력하세요");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weatherDTO.setGion(sc.next());
		System.out.println("날씨를 입력하세요");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지 입력하세요");
		weatherDTO.setMise(sc.next());
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length+1];
		
		for(int i=0; i<weatherDTOs.length;i++) {
			newInfo[i] = weatherDTOs[i];
		}
		
		newInfo[weatherDTOs.length] = weatherDTO;
		
		return newInfo;
	}
	
	// remove
	// 배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	// 배열에서 삭제하고 배열을 리턴
	public WeatherDTO [] remove(WeatherDTO [] weatherDTOs) {
		WeatherDTO [] newInfo = new WeatherDTO[weatherDTOs.length-1];
		System.out.println("삭제할 도시 이름 입력");
		String name = sc.next().toUpperCase();
		int idx=0;
		for(int i=0;i<weatherDTOs.length;i++) {
			if(name.equals(weatherDTOs[i].getCity().toUpperCase())) {
				continue;
			}
			newInfo[idx] = weatherDTOs[i];
			idx++;
		}
		return newInfo;
	}
	
	
}
