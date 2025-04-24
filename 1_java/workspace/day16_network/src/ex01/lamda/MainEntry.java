//package ex01.lamda;
//
//interface Message {
//	void something(); // void, parameter X
//}
//
//class Person {
//	public void greeting(Message msg) {
//		msg.something();
//	}
//}
//
//public class MainEntry {
//	public static void main(String[] args) {
//
//		Person p = new Person();
//
//		p.greeting(new Message() { // 일반적인 형태
//
//			@Override
//			public void something() {
//				System.out.println("WELCOME");
//				System.out.println("한주 동안 수고 많으셨어요.");
//			}
//		});
//
//		System.out.println("===========================================================");
//
//		p.greeting(() -> {
//			System.out.println("람다 : WELCOME");
//			System.out.println("람다 : 한주 동안 수고 많으셨어요.");
//		});
//	}
//}
