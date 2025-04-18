package ex05.inheritance;

public class Point {
	int x, y;

	// constructor method

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		x = y = 10;
	}

	public Point(int x) {
		this(x, 9);
	}

	// getter setter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// output
	public void disp() {
		System.out.print(x + ", " + y);
	}

}
