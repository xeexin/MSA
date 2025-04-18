package ex08.utilPakage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // system이 갖고 있는 날짜 얻어옴
//		System.out.println(c); //너무 복잡해서 골라서 뽑아와야지
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "월 "); // 월은 0부터 센다 따라서 +1해줘야함
		System.out.println(c.get(Calendar.DATE) + "일");

		System.out.println("-------------------------");
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.printf("%d시 %d분 %d초\n", h, m, s);

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();

		c2.set(2018, 12, 20, 0, 0);
		if (c1.after(c2)) {
			System.out.println("현재 시간은 2018년도 12월 20일 이후 입니다.");
		} else if (c1.before(c2)) {
			System.out.println("현재 시간은 2018년도 12월 20일 이전 입니다.");
		} else if (c1.equals(c2)) {
			System.out.println("같은 날짜");
		}

	}

}
