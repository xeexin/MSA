package ex04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("input = ");
//		String str1 = br.readLine(); // 예외 처리하기, 여러개의 데이터 입력 받기
		int str1 = Integer.parseInt(br.readLine()); // 예외 처리하기, 여러개의 데이터 입력 받기 

		System.out.println("input = ");
		int str2 = Integer.parseInt(br.readLine()); // 예외 처리하기, 여러개의 데이터 입력 받기

		System.out.println(str1 + str2); //문자열 결함이 됨

	}
}

//package ex04.io;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//
//public class MainEntry {
//	public static void main(String[] args) throws IOException {
//
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
//
//		// BufferedReaer br = new BufferedReader(new InputStreamReader(System.in));
//
//		System.out.println("character input = ");
//		String str = br.readLine(); // 예외 처리하기, 여러개의 데이터 입력 받기
//
//		System.out.println(str);
//
//	}
//}
