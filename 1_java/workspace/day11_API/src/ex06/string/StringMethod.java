package ex06.string;

public class StringMethod {
	public static void main(String[] args) {
		String s1 = "happydoyeon";
		String s2 = "SEOUL";

		System.out.println(s1);
		System.out.println(s2.replace("EO", "korea")); // SkoreaUL
		System.out.println(s2);// SEOUL

//		s2 = s2.replace("EO", "korea"); //SkoreaUL
//		System.out.println(s2); //SkoreaUL

		System.out.println("--------------");
		s1 = s1 + s2;
//		s1= s1.concat(s2);

		System.out.println(s1);
		System.out.println("--------------------");
		String s3 = new String("     ab       cd      ");
		System.out.println(s3);
		System.out.println(s3.length());
		s3 = s3.trim(); // 공백 제거 (단 중간 공백은 못 없앰) (앞 뒤 공백만 줄임)
		System.out.println(s3.length());
		
		System.out.println("--------------------");
		String s4 = new String("ab ckldljeljrla;jfl jflkejflef  68468414");
		String[] s5 = s4.split(" "); //공백을 기준으로 끊어가지고 오겠다
		for(int x=0; x<s5.length;x++) {
			System.out.println(s5[x]);
		}
		
		System.out.println("--------------------");
		String s6 = new String("ab/csefef/2321454/ef3eed/df");
		String[] s7 = s6.split("/", 0);
		for(int x=0; x<s7.length;x++) {
			System.out.println(s7[x]);
		}
		
		System.out.println("--------------------");
		String s8="abcdefghijklmnopqrstuvwxyz";
		char ch = s8.charAt(8);
		System.out.println(ch);
		
		s8 = s8.substring(5,7); // 5번부터 7번인덱스 전까지
		System.out.println(s8);
		
		
		System.out.println("--------------------");
		System.out.println("소문자로 출력 toLowerCase() : " + s2.toLowerCase());
		System.out.println("대문자로 출력 toUpperCase() : " + s1.toUpperCase());
	
		
		System.out.println("--------------------");
		char[] ch2 = s1.toCharArray(); // 문자형태로 배열을 꺼내 옴, 낱개로 하나씩 저장함
		for(int x=0; x<ch2.length; x++) {
			System.out.println(ch2[x]);
		}
		
	}
}
