package ex02.oop;

class Circle {
	// x,y 위치에 반지름 r
	private int y, x, r;

	// getter()

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public int getR() {
		return r;
	}

	// setter()
	public void setY(int yy) {
		y = yy;
	}

	public void setX(int xx) {
		x = xx;
	}

	public void setR(int rr) {
		r = rr;
	}

	public void setAll(int yy, int xx, int rr) {
		y = yy;
		x = xx;
		r = rr;
	}

	// display
	public void display() {
		System.out.printf("( %d, %d )위치에 넓이 %.1f인원이 존재합니다.", y, x, (r * r * Math.PI));

	}
}

public class CircleMain {

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setAll(3, 5, 7);

		System.out.println("y 좌표 : " + circle.getY());
		System.out.println("x 좌표 : " + circle.getX());
		System.out.println("반지름 : " + circle.getR());

		circle.display();
	}

}
