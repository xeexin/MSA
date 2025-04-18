package ex05.inheritance;
//접근지정자 private > default > protected > public 

class Point2 {
	protected int x, y;

}

class Circle2 extends Point2 {
	int r; 

	public void disp() {
		System.out.println(x + "," + y + ", " + r);
	}
}

public class MainEntry {

	public static void main(String[] args) {
		Circle2 c = new Circle2();
		
	}

}
