package ex05.inheritance;

public class Circle extends Point {
	private int r;

	public Circle(int r) {
		super(20, 11);
		this.r = r;
	}

	public Circle(int x, int y) {
		this(5);
		this.x = x;
		this.y = y;

	}

	// output
	public void disp() {
		super.disp();
		System.out.println(", " + r);
	}

}
