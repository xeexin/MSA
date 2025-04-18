package ex02.randomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {

		Random rand = new Random(); // 객체 생성, 메모리에 할당, 생성자 함수 자동호출

		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());

		int num = rand.nextInt();
		System.out.println(num);

		System.out.println("-------------------------------");
		// rand.nextInt(n) ; // 0~n-1 값 추출함
		System.out.println(rand.nextInt(5)); // 0~4까지 
		System.out.println(rand.nextInt(4)+1); // 1~4까지 
	}

}
