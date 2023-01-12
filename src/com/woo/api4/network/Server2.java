package com.woo.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	public static void main(String[] args) {
		// 클라이언트 접속 대기
		// 1. 점심메뉴중 하나를 랜덤하게 골라서 전송
		// 2. 저녁메뉴중 하나를 랜덤하게 골라서 전송
		// 3. 종료
		
		Scanner scanner = new Scanner(System.in);
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중..");
			sc = ss.accept();
			System.out.println("Client와 연결 성공 !");
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String msg = br.readLine();
//			System.out.println("Client : "+msg);
			
			Calendar ca = Calendar.getInstance();
			Random random = new Random(ca.getTimeInMillis());
			// 1. 점심 메뉴
			if(msg.equals("1")){
			String [] lunch = {"라면", "햄버거", "짜장면", "짬뽕", "굶기"};
			int idx = random.nextInt(100)%5;
			
			String menu = lunch[idx];
			
			System.out.println(menu);
			// 2. 저녁 메뉴
			} else if(msg=="2") {
				String [] dinner = {"삼겹살", "치킨", "피자", "족발", "쫄면"};
				int idx = random.nextInt(100)%5;
				
				String menu = dinner[idx];
				
				System.out.println(menu);
			} else {
				System.out.println("시스템을 종료합니다.");
			}
			
			
			
			
			System.out.println("클라이언트로 보낼 메세지 입력 : ");
			msg = scanner.nextLine();
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(msg+"\r\n");
			bw.flush();
			
			if(msg.equals(3)) {
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
				ss.close();
			} catch (Exception e) {

			}
		}

	}

}
