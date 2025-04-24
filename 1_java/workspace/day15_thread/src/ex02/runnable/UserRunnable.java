package ex02.runnable;

public class UserRunnable implements Runnable {

	String name;

	public UserRunnable(String name) {
		this.name = name;

	}

	@Override
	public void run() {
		for (int x = 1; x < 11; x++) {

			if (x == 3) {
				try {
					Thread.sleep(1000); // 예외 발생 처리해줘야함
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // 1초 동안 중지
				System.out.println(name);
			}

			System.out.println(x);
		}

	}

}
