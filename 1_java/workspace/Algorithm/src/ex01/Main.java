package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n= Integer.parseInt(br.readLine());
		int m= Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[] brr = new int[m];
		int[] ret = new int[n*m];
		int sum=0;
		
		for(int x=0; x<n; x++) {
			arr[x]=Integer.parseInt(br.readLine());
		}
		
		for(int x=0; x<m; x++) {
			brr[x]=Integer.parseInt(br.readLine());
		}
		
		//구현
		for(int y=0; y<n; y++) {
			for(int x=0; x<m; x++) {
				if()
			}
		}
		
		
		

	}
}
