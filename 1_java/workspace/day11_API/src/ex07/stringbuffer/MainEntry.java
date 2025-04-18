package ex07.stringbuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.hashCode()); // 10진수 형태의 주소 위치

		System.out.println("length()              :                     capacity() ");
		System.out.println(sb.length() + "                       /      " + sb.capacity());

		int len = sb.length();
		int size = sb.capacity();
		System.out.println(len + "         /        " + size);
		
		System.out.println("----------------------------");

		sb.append("msa-th2");
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "         /        " + size);
		
		System.out.println(sb.hashCode()); // 10진수 형태의 주소 위치
		System.out.println("----------------------------");

		sb.append("happyvirus"); // 용량 넘침
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "         /        " + size);
		
		System.out.println("----------------------------");

		//sb.append("1234 567890 한글ㅇㅇㄹㅇㄴㄹ"); // 용량 넘침
		sb.append("1234 567890"); // 용량 넘침
		len = sb.length();
		size = sb.capacity();
		System.out.println(len + "         /        " + size);
		System.out.println(sb.hashCode()); // 10진수 형태의 주소 위치  ->  같은 주소를 공유함. 메모리 낭비 없음
		
		sb.trimToSize()	; //용량 크기 조절함(줄여줌) 메모리 낭비 줄임
		size = sb.capacity();
		System.out.println(len + "         /        " + size);



	}

}
