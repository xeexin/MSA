package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.setChannel(5);
		tv1.setColor("purple");
		
		TV tv2 = new TV("red");
		tv2.setChannel(33);
		
		TV tv3 = new TV(7);
		tv3.setColor("yellow");
		
		TV tv4 = new TV("blue", 11);

		tv1.display();
		System.out.println("------------------");
		tv2.display();
		System.out.println("------------------");
		tv3.display();
		System.out.println("------------------");
		tv4.display();
	}

}
