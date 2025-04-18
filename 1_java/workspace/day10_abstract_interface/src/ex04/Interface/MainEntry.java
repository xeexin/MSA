package ex04.Interface;

interface A { // 인터페이스 - abstract method, final field만 갖을 수 있다.
	int x = 90;
	final int y = 777;
	char ch = 'A';

	public void show();

	public abstract void disp(); // abstract 생략 가능 왜냐 무조건 추상메서드만 가지니까!

	public void view();

} // A end

interface B {
	void view();

} // B END

interface C {
	String name = "heejin";

	public void draw();

} // C END

interface D extends B {
	void dView();
} // D END

//////////////////

class Rect implements D {

	@Override
	public void view() { // b interface

	}

	@Override
	public void dView() { // d interface

	}

	public int plus(int x, int y) {
		return x + y;
	}

} // RECT END



class Shape {

} // SHAPE END

class Circle implements C {

	@Override
	public void draw() {
		// name = "yuna"; // 값 변경 금지임 왜냐 인터페이스니까.
		System.out.println(name + "님 입니다.");
	}

} // Circle END

class Multi extends Shape implements B, C, A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("SHOW METHOD CALL ~");

	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("disp METHOD CALL ~");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw METHOD CALL ~");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub
		System.out.println("view METHOD CALL ~");
	}

}

public class MainEntry {
	public static void main(String[] args) {

		// A a = new A(); -> 인터페이스는 객체 생성 불가니까.
		Multi m = new Multi();
		m.disp();
		m.draw();
		m.view();
		m.show();

		B b = new Multi(); // B가 가지는 함수만 가능하다.
		b.view();

	}

}
