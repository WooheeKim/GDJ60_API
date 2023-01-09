package com.woo.api1.strings.ex3;

import java.util.Scanner;

public class WeatherController {
	
//	start
//	1. 날씨정보초기화
//	   초기화가 완료 되었습니다.
//	2. 전국날씨정보
//	3. 지역날씨검색
//	   도시정보가 없습니다.
//	4. 지역날씨추가
//	
//	5. 지역날씨삭제
//	
//	6. 종	료
	
	private Scanner sc;
	private WeatherData weatherData;
	private WeatherView weatherView;
	private WeatherInput weatherInput;
	private WeatherDTO [] weatherDTOs;
	
	public WeatherController() {
		this.sc = new Scanner(System.in);
		this.weatherData = new WeatherData();
		weatherView = new WeatherView();
		weatherInput = new WeatherInput();
	}
	
	public void start() {
//		Scanner sc = new Scanner(System.in);
//		WeatherData weatherData=new WeatherData();
//		WeatherView weatherView=new WeatherView();
//		WeatherInput weatherInput = new WeatherInput();
//		WeatherDTO [] weatherDTOs=null;
		boolean check = true;
		
		while(check) {
			System.out.println("1. 날씨정보초기화");
			System.out.println("2. 전국날씨정보");
			System.out.println("3. 지역날씨검색");
			System.out.println("4. 지역날씨추가");
			System.out.println("5. 지역날씨삭제");
			System.out.println("6. 종    료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				weatherDTOs = weatherData.init();
				System.out.println("초기화가 완료 되었습니다.");
				break;
			case 2:
				weatherView.view(weatherDTOs);
				break;
			case 3:
				WeatherDTO weatherDTO = weatherInput.search(weatherDTOs);
				if(weatherDTO != null) {
					weatherView.view(weatherDTO);
				}
				break;
			case 4:
				this.weatherDTOs = weatherInput.add(this.weatherDTOs);
				break;
			case 5:
				this.weatherDTOs = weatherInput.remove(weatherDTOs);
				break;
			default:
				check =! check;
			}
		}
	}
	
	
}
