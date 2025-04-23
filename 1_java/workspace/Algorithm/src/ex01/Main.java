package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		
		
		TreeMap<String, String> arr = new TreeMap<String, String>();
		
		for(int x=0; x<n; x++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String status = st.nextToken();
			
			arr.put(name, status); // key 값 중복 시 마지막 값으로 update
		}
		
		// 역순 출력 (Z ~ A)
				for (String name : arr.descendingKeySet()) {
					if (arr.get(name).equals("enter")) {
						System.out.println(name);
					}
				}

	}
}
