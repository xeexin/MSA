package ex01.lamda;

@FunctionalInterface
interface Message {
	void something(int x, int y); // return X, parameter O (매변 두개이상)
//	int good(int x);
}

interface Talk {
	void something(String x, String y);
}

class Person {
	// 오버로드

	public void greeting(Message msg) {
		msg.something(3, 5);
	}

	public void greeting(Talk talk) {
		talk.something("hello", "MSA 2th");
	}
}

public class MainEntry5 {
	public static void main(String[] args) {

		Person p = new Person();

		char ch = 'k';

		// p.greeting((x, y) -> { // 에러 , 타입을 정확히 써줘야함!

		p.greeting((String x, String y) -> { // 람다 형태 *매개변수 두개 이상 괄호 생략 불가능
			System.out.println("람다(return type, parametor) : WELCOME " + x + ", " + y);
			System.out.println(x + ", " + y);
//			ch = 'p'; // 값 변경 불가능
			System.out.println(ch); // 출력은 가능
			
			num = 500; // static은 값 변경 가능
			System.out.println(num);
		});
	}

	static int num = 30;
}
