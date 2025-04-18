package Quiz;

public class Ex02Quiz {
	public static void main(String[] args) {
		int su = 12345;
		
		//시 : 분 : 초 로 나타내기
		// 한시간은 60분 
		// 60분은 3600초
		
		int hour = su / 3600;
		int min = (su % 3600) / 60;
		int sec = (su % 60);
		
		System.out.println(hour + "시 " + min +"분 " + sec +"초");
	}

}
