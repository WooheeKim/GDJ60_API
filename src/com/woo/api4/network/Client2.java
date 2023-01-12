package com.woo.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		// 1. 서버 접속시도
		// 2. 1.점심, 2.저녁 3.종료
		// 3. 사용자가 1,2,3 고르기
		// 1번 : 서버에서 점심메뉴중 하나를 보내줌, 출력
		// 2번 : 서버에서 저녁메뉴중 하나를 보내줌, 출력
		// 3번 : 종료
		
		Scanner scanner = new Scanner(System.in);
		Socket sc = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			sc = new Socket("localhost", 8282);
			System.out.println("Server 접속 성공");
			
			while(true) {
				
				os = sc.getOutputStream();
				
				ow = new OutputStreamWriter(os);
				
				bw = new BufferedWriter(ow);
				
				System.out.println("서버로 보낼 메세지 입력");
				String msg = scanner.next();
				
				bw.write(msg+"\r\n");
				bw.flush();
				
				int num;
				switch(num) {
				case 1:
					System.out.println("점심을 고르셨습니다.");
					break;
				case 2:
					System.out.println("저녁을 고르셨습니다.");
					break;
				default:
					System.out.println("시스템을 종료합니다.");
				}
				
				
				int num = 0;
				if(num==1) {
					System.out.println(num);
					
				}
				
				
				
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				msg = br.readLine();
				System.out.println("Server : "+msg);
				
				
				
				
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
			} catch (Exception e) {

			}
		}
		
	}

}
