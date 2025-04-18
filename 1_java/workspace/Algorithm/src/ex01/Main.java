package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); //3241 -> 4321
		
		char[] ret = str.toCharArray(); // 문자열 어레이로 바꿈
		
		Arrays.sort(ret); // 오름차순 정렬
		
		// 내림차순 출력
		for(int x=ret.length-1; x>=0; x--) {
			System.out.print(ret[x]);
		}
		
		System.out.println("TEST!!!");
	}
}
