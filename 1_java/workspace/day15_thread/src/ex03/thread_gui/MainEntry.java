package ex03.thread_gui;

public class MainEntry {
	public static void main(String[] args) throws InterruptedException {
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY); // 10
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 1
//		Thread.currentThread().setPriority(Thread.NORM_PRIORITY); // 5
		Thread.State state = Thread.currentThread().getState();
		int priority = Thread.currentThread().getPriority();
		

		if(id==1) {
			Thread.sleep(2000);
			Thread.currentThread();
		}
		
		System.out.println("현재 스레드 ID : " + id);
		System.out.println("현재 스레드 Name : " + name);
		System.out.println("현재 스레드 State : " + state);
		System.out.println("현재 스레드 Priority : " + priority);

	}

}

