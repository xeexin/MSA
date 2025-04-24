//package ex01.lamda;
//
//interface Message {
//	int something(int x, int y); // return int, parameter O (매변 두개이상)
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(3, 5);
//		System.out.println("Message interface something : " + su);
//
//	}
//}
//
//public class MainEntry4 {
//	public static void main(String[] args) {
//
//		Person p = new Person();
//
//		p.greeting(new Message() {
//
//			@Override
//			public int something(int x, int y) { // 일반적인 형태
//				System.out.println("return type, parametor  안녕하세요 " + x + ", " + y);
//				System.out.println("return type 한주동안 수고 많으셨어요. " + x + ", " + y);
//				return 100;
//			}
//		});
//
//		System.out.println("===========================================================");
//
//		p.greeting((x, y) -> { // 람다 형태 *매개변수 두개 이상 괄호 생략 불가능
//			System.out.println("람다(return type, parametor) : WELCOME " + x + ", " + y);
//			System.out.println("람다(return type, parametor) : 한주 동안 수고 많으셨어요. " + x + ", " + y);
//			return x + y;
//		});
//	}
//}
