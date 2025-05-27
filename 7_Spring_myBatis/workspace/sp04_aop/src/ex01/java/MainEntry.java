package ex01.java;

public class MainEntry {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.plus(1, 5));
		System.out.println(c.plus(11, 25));
		
		System.out.println("-----------------------------------");
		
		System.out.println(c.plus(3, 5));
		System.out.println(c.mul(2, 5));
		
	}
}
