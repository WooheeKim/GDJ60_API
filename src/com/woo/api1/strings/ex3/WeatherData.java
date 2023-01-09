package com.woo.api1.strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
	
	private String data;
	
	public WeatherData() {
		this.data="SEOUL,12,맑음,60,Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,junju,32,흐림,5";
	}
	public WeatherDTO [] init() {
		StringTokenizer str = new StringTokenizer(this.data,",");
		WeatherDTO [] wethers = new WeatherDTO[str.countTokens()/4];
		int i = 0;
		while(str.hasMoreTokens()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(str.nextToken());
			weatherDTO.setGion(Integer.parseInt(str.nextToken()));
			weatherDTO.setStatus(str.nextToken());
			weatherDTO.setMise(Integer.parseInt(str.nextToken()));
			wethers[i] = weatherDTO;
			i++;
		}
		return wethers;
	}
	
	
	//init
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
//	public WeatherDTO [] init() {
//		String [] datas = this.data.split(",");
//		WeatherDTO [] wethers = new WeatherDTO[datas.length/4];
//		// int idx=0;
//		for(int i=0;i<datas.length;i++) {
//			WeatherDTO weatherDTO = new WeatherDTO();
//			weatherDTO.setCity(datas[i]);
//			weatherDTO.setGion(datas[++i]);
//			weatherDTO.setStatus(datas[++i]);
//			weatherDTO.setMise(datas[++i]);
//			wethers[i/4] = weatherDTO;
//			// wethers[idx] = weatherDTO;
//			// idx++;
//		}
//		return wethers;
//	}
	
}
