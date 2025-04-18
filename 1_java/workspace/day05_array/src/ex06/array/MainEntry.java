package ex06.array;

import java.util.Scanner;

//3차원 배열[면][행][열]

public class MainEntry {
	public static void main(String[] args) {
		int[][][] a = new int[2][3][4];

		System.out.println("*********************************");
		System.out.println(a.length); // 면의 크기
		System.out.println(a[0].length); // 행의 크기
		System.out.println(a[0][0].length); // 열의 크기
		System.out.println("*********************************");

		Scanner sc = new Scanner(System.in);

//		// 입력
//		for (int z = 0; z < a.length; z++) {
//			for (int y = 0; y < a[0].length; y++) {
//				for (int x = 0; x < a[0][0].length; x++) {
//					System.out.print("INPUT ( a[" + z + "][" + y + "][" + x + "]) : ");
//					a[z][y][x] = sc.nextInt();
//				}
//			}
//		}
		
		//난수 넣어주기
		for (int z = 0; z < a.length; z++) {
			for (int y = 0; y < a[0].length; y++) {
				for (int x = 0; x < a[0][0].length; x++) {
		
					a[z][y][x] = (int) (Math.random()*100);
				}
			}
		}

		// 출력
		for (int z = 0; z < a.length; z++) {
			for (int y = 0; y < a[0].length; y++) {
				for (int x = 0; x < a[0][0].length; x++) {
					System.out.print(a[z][y][x] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
