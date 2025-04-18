package ex02.circle;

public class MainEntry {
	public static void main(String[] args) {
		Circle circle= new Circle(1,2,3);
		circle.disp();
		
		Circle circle2= new Circle();
		circle2.disp();
		
		Circle circle3= new Circle(10);
		circle3.disp();
		
		Circle circle4= new Circle(20,20);
		circle4.disp();
		
	}

}
