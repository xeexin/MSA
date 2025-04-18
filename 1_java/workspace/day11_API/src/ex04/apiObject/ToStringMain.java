package ex04.apiObject;

class Rectangle {
	int x, y;

	public void disp() { // 출력 함수 따로 만들었음.
		System.out.println(x + " " + y);
	}

	
	@Override
	public String toString() {
		return "Rectangle [x=" + x + ", y=" + y + "]";
	}

//	public String toString() {
//		return x + ", " + y;
//	}
	
	
}

public class ToStringMain {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println(r); // toString 호출
		r.disp();
	}

}
