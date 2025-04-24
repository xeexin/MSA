package quiz;

import java.util.function.BiFunction;

//사칙연산 함수 plus(int x, int y) minus(int x, int y) lamda 형태로 구현해서 출력하기

public class 사칙연산_람다 {

	public static void main(String[] args) {

		int a = 3;
		int b = 5;

		BiFunction<Integer, Integer, Integer> plus = (x, y) -> x + y;
		BiFunction<Integer, Integer, Integer> minus = (x, y) -> x - y;
		
		int retplus = plus.apply(a, b);
		System.out.println("a + b = "+ retplus);
		
		
		int retminus = minus.apply(a, b);
		System.out.println("a - b = "+ retminus);

	}

}
