package ex07.stringbuffer;

public class StringBufferMethod {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb); // 주소가 아니라 데이터 값이 나옴. String Wrapper는 데이터 값이 나옴. 주소가 안나옴!

		sb.append(" is pencil"); // 문자열 추가
		System.out.println(sb);

//		System.out.println(sb.reverse());// 역으로 출력

		System.out.println("-------------------");
		sb.insert(7, " my"); // 중간에 문자열 삽입 (어느인덱스에, 얘좀 넣어줘)
		System.out.println(sb);

		sb.replace(8, 10, "your"); // 문자열 교체(어느인덱스부터, 어느인덱스까지, 얘를 넣어줘)
		System.out.println(sb);
		System.out.println(sb.capacity()); // 길이로 16(기본용량) 초과함

		
		System.out.println(sb.indexOf("your")); //해당 문자열이 들어있는 위치 값 출력
		System.out.println(sb.indexOf("s"));  // indexOf는 앞에 만나는 문자열 찍어버림
		System.out.println(sb.lastIndexOf("s")); // 마지막에 만난 문자열 찍음

		sb.delete(0, 5);// 삭제
		System.out.println(sb);

		sb.setLength(5); // 길이가 조절되면서 기본문자 줄이거나 늘려짐.
		System.out.println(sb);
		System.out.println(sb.capacity()); // 뒤에 있는게 줄여지진 않음. capacity가 그대로임을 확인

		sb.setLength(20);
		System.out.println(sb); // 길이를 늘렸다고 이전의 값이 살아나진 않음...

	}

}
