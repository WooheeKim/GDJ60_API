package com.woo.api4.network.ex.servers;

public class ServerMain {

	public static void main(String[] args) {
		// 프로그램 시작, Test
		try {
			new StudentController().start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
