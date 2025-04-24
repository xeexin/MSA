//package ex01.lamda;
//
//interface Message {
//	int something(int x); // return int, parameter O
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(30);
//		System.out.println("Message interface something : " + su);
//
//	}
//}
//
//public class MainEntry3 {
//	public static void main(String[] args) {
//
//		Person p = new Person();
//
//		p.greeting(new Message() {
//
//			@Override
//			public int something(int x) { // 일반적인 형태
//				System.out.println("return type, parametor  안녕하세요 " + x);
//				System.out.println("return type 한주동안 수고 많으셨어요. " + x);
//				return 100;
//			}
//		});
//
//		System.out.println("===========================================================");
//
//		p.greeting(x -> { // 람다 형태
//			System.out.println("람다(return type, parametor) : WELCOME " + x);
//			System.out.println("람다(return type, parametor) : 한주 동안 수고 많으셨어요. " + x);
//			return 20;
//		});
//	}
//}
