//package ex01.lamda;
//
//interface Message {
//	int something(); // return int, parameter X
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("Message interface something : " + su);
//
//	}
//}
//
//public class MainEntry2 {
//	public static void main(String[] args) {
//
//		Person p = new Person();
//
//		p.greeting(new Message() {
//
//			@Override
//			public int something() { // 일반적인 형태
//				System.out.println("return type 안녕하세요");
//				System.out.println("return type 한주동안 수고 많으셨어요.");
//				return 100;
//			}
//		});
//
//		System.out.println("===========================================================");
//
//		p.greeting(() -> { // 람다 형태
//			System.out.println("람다 : WELCOME");
//			System.out.println("람다 : 한주 동안 수고 많으셨어요.");
//			return 200;
//		});
//	}
//}
