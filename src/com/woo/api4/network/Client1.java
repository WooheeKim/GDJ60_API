package com.woo.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		try {
			// 객체 생성시 서버 접속 시도
			sc = new Socket("127.0.0.1", 8282);  // 127.0.0.1 (자기 자신 IP주소) or localhost
			System.out.println("Server 접속 성공");
			
			
			// 0,1
			os = sc.getOutputStream();
			// char
			ow = new OutputStreamWriter(os);
			// Stream
			bw = new BufferedWriter(ow);
			
			System.out.println("서버로 보낼 메세지 입력 : ");
			String msg = scanner.next();
			
			bw.write(msg+"\r\n");
			bw.flush();
			
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String msg1 = br.readLine();
			System.out.println("Client : "+msg1);
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
