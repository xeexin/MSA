package ex01.thread;

public class MainEntry {

	public static void main(String[] args) {
//		Thread t1 = new Thread("t1");
		UserThread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");

		t1.setPriority(Thread.MIN_PRIORITY); // 1
		t2.setPriority(Thread.NORM_PRIORITY); // 5
		t3.setPriority(Thread.MAX_PRIORITY); // 10

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getState());

//		System.out.println(t1);
		t1.start(); // run()메서드 유도됨
		t2.start(); // run()메서드 유도됨
		t3.start(); // run()메서드 유도됨

	}

}
