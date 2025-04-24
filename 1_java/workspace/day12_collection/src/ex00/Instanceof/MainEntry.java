package ex00.Instanceof;

class A {
	int a;

}

class B extends A {
	int b;
}

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
//		B aa = new A();  -> 자식 객체로 부모를 생성할 수 없다!
		
		B b = new B();
		A bb = new B(); // -> 자손의 것을 접근 할 수 없음! 
		
		System.out.println("a instance of A : " + (a instanceof A)); 
		System.out.println("b instance of A : " + (b instanceof A)); 
		System.out.println("b instance of B : " + (a instanceof B)); 
		System.out.println("b instance of B : " + (b instanceof B)); 
	
	}

}
