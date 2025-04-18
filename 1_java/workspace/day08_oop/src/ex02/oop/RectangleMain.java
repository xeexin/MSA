package ex02.oop;

import java.util.Scanner;

public class RectangleMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);

		// 값 입력받기
		System.out.print("x1 좌표 입력 : ");
		rectangle.setX1(sc.nextInt());
		System.out.print("x2 좌표 입력 : ");
		rectangle.setX2(sc.nextInt());
		System.out.print("Y1 좌표 입력 : ");
		rectangle.setY1(sc.nextInt());
		System.out.print("Y2 좌표 입력 : ");
		rectangle.setY2(sc.nextInt());

		// 좌표 위치 찍기
		rectangle.display();

		
	}

}
