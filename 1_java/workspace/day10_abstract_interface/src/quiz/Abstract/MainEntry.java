package quiz.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 1.
		new Subway().start("혜화");
		new Subway().stop("일산");

		System.out.println("----------------------------------------");
		// 2.
		Trans t = new Bus();
		t.start("광화문");
		t.stop("성균관대 입구");

		System.out.println("----------------------------------------");

		// 3.
		Trans[] ts = new Trans[1];
		ts[0] = new Bicycle();

		ts[0].start("한국소프트웨어산업협회");
		ts[0].stop("버거킹 혜화점");
	}

}
