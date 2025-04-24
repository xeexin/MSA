package ex06.innerClass;

class OuterClass { // 외부 클래스
	static int no;
	String msg = "hello ~~! ";

	public void outerMethod() {
		System.out.println("Outer Method Call !");
	}

	class InnerClass { // 내부 클래스
		int su = 99;

		public void show() {
			System.out.println(su); // 내부 (자신의 것) 사용 가능
			System.out.println(msg); // 외부 클래스 멤버 사용 가능
		}

		public void disp() {
			outerMethod(); // 외부 클래스 메소드 호출
		}

	} // InnerClass end

} // outerClass end

public class MainEntry {
	public static void main(String[] args) {
		// 1. 외부 클래스 객체 생성
		OuterClass oc = new OuterClass();

		// 2. 이너 클래스 객체 생성
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.disp();
		ic.show();

		System.out.println("----------------------------------------");
		// 3. 이너 클래스 한번에 호출
		OuterClass.InnerClass innerClass = new OuterClass().new InnerClass();
	}

}
