package ex05.Synchronized;

public class SimpleThread {

	static void threadMessage(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s : %s \n\n", threadName, message);
	}

	static class MessageLoop implements Runnable { // Inner class

		@Override
		public void run() {
			String[] importantInfo = { "aa aa", "bb b", "cc c", "dd d" };

			try {
				for (int i = 0; i < importantInfo.length; i++) {
					Thread.sleep(4000); // 4초
					threadMessage("I wasn't done!!");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	} // end MessageLoop class -inner

	public static void main(String[] args) throws InterruptedException {
		long parience = 1000 * 60 * 60;

		if (args.length > 0) {
			try {
				parience = Long.parseLong(args[0]) * 1000;
				System.out.println(parience);

			} catch (Exception e) {
				System.out.println("argument integer input");
				System.exit(1);
			}
		} //end if
		
		threadMessage("Start MessageLoop thread test");
		long startTiem = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start(); // run()
		
		
		while(t.isAlive()) {
			threadMessage("Still wating....");
			t.join(1000);
			
			
			if(((System.currentTimeMillis() - startTiem) > parience) && t.isAlive()){
				threadMessage("Tried of wating...");
				t.interrupt();
				t.join();
			}// if end
		}//end while
		
		threadMessage("Finally...!");

	}

}
