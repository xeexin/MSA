package ex01.instance_static;

class A {
	int x, y;

	// static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + " , " + yy);
	}
}

public class StaticClass {
	public static void main(String[] args) {
		A a = new A(); // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출
		a.setData(20, 33); // object.methodName();

		// static method임으로 ClassName.methodName();
		A.setData(100, 500);
	}

}
