package ex04.apiObject;

class Circle {
	int x = 5, y = 5;
}

public class EqualsMain {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		if (c1 == c2)
			System.out.println("SAME");
		else
			System.out.println("NOT SAME");

		int x = 3, y = 3; // 클래스가 달라서 같은 이름 선언 가능
		System.out.println("기본자료형 비교");
		if (x == y) // == -> 스택영역 데이터 비교
			System.out.println("SAME");
		else
			System.out.println("NOT SAME");

		System.out.println("참조자료형 비교");
		String str1 = new String("Korea");
		String str2 = new String("korea");
		if (str1 == str2) // == -> 스택영역 데이터 비교
			System.out.println("SAME");
		else
			System.out.println("NOT SAME");

		System.out.println("** Equals() method 비교**");
	
		if (str1.equals(str2)) { //equals -> 아스키코드 더한 값 끼리 비교함(따라서 대소문자 구분)
			System.out.println("SAME");
		} else {
			System.out.println("NOT SAME");
		}
		System.out.println("---------------");
		if (str1.equalsIgnoreCase(str2)) { //equals -> 아스키코드 더한 값 끼리 비교함
			System.out.println("SAME");
		} else {
			System.out.println("NOT SAME");
		}

	}

}
