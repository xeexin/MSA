package ex01.instance_static;

class B {
	int x, y;

	public void setDate(int xx, int yy) {
		System.out.println("xx : " + x + " , yy : " + yy);
	}
} // B class ENd

public class InstanceClass {
	public static void main(String[] args) {
		B b = new B(); // 객체생성, 메로리에 할당, 생성자 함수 자동 호출
		b.setDate(11, 12);

	}

}

