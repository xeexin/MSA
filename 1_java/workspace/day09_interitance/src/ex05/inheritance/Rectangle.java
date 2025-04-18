package ex05.inheritance;

public class Rectangle extends Point {
	private int x1, y1;

	public Rectangle(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}

	// output
	public void disp() {
		super.disp(); //부모의 인스턴스 접근 가능
		System.out.println(x + ", " + y + ", " + x1 + ", " + y1);
	}
}
