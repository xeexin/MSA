package ex02.runnable;

import ex01.thread.UserThread;

public class MainEntry {
	public static void main(String[] args) {

		new Thread(new UserThread("u1")).start();
		new Thread(new UserThread("u2")).start();
		new Thread(new UserThread("u3")).start();
	}

}
