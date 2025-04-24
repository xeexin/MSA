package ex01.thread;

public class UserThread extends Thread {
	String name;

	public UserThread(String name) {
		this.name = name;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
//		System.out.println("RUN() call~~" + name);

		for (int x = 1; x < 11; x++) {
			
			if(x==3) {
				try {
					sleep(1000);  // 예외 발생 처리해줘야함
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // 1초 동안 중지
			}
			
			System.out.println(name);
			System.out.println(x);
		}
		
		
	}
}
