package ex02.datatype;

public class DataType {
	public static void main(String[] args) {
		String str = "A"; // 쌍따옴표"" -> 문자열 (2byte)
		char ch = 'A';// 홑따옴표 '' -> 문자 (1byte)
		char ch2 = 67; // 아스키코드 값(='C')
		char ch3 = 'b';

		System.out.println(str);

		System.out.println(ch);
		System.out.println((int) ch); // ASCII 65

		System.out.println((char) ch2);
		System.out.println(ch2);

		System.out.println(ch2 + ch3);
		
		String nickName = "happy";
		
		System.out.println("nickname : "+ nickName);
		
		System.out.println("\n\n-----------------------");
		for(int i=65; i<=90; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println("\n\n[boolean type] ");
		boolean flag = true;
//		int b= flag; // error c++과 다름! 트루는 트루, 폴스는 폴스임! (1,0)으로 변환 안됨
		System.out.println(flag);

	}

}
