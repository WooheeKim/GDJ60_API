package com.woo.api3.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		// 1. java.io.File 클래스
		//	  HDD에 파일과 폴더의 정보를 담으려고 하는 클래스
		File file = new File("C:\\");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.exists());
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		String [] files = file.list();
		for(String name:files) {
			System.out.println(name);
			File f = new File("C:\\", name); // 절대경로
			System.out.println(f.isDirectory());
		}
		
		File[] fs = file.listFiles();
		
	}

}
