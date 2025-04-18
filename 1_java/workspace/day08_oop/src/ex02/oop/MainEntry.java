package ex02.oop;

// 클래스 분리 안햇을 경우, public(클래스에 붙는)은 하나만 사용가능 그리고 public 있는 클래스에 main 사용 가능

class Point // extends Object
{
	int x, y; // 멤버 변수 - 접근 지정자 : private < (default) < protected < private 

	// 멤버 함수
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int xx) {
		x = xx;
	}

	public void setY(int yy) {
		y = yy;
	}

	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}

	public void display() {
		System.out.println(x + " , " + y);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); // 객체 생성, 메모리 할당, 생성자 함수 자동 호출

		pt.setX(55);
		pt.setY(200);

//		System.out.println(pt.getX() + " , " + pt.getY());
		pt.display();

		pt.setData(1, 2);
		pt.display();

		System.out.println("----------------------------------");
		System.out.println(pt); // -> 주소값 나옴
		System.out.println(pt.toString()); // -> 주소값 나옴
	}
}
