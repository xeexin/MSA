package ex02.collection_list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

// 중복허용, 순서 있음
public class VectorEx2 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();

		// Vector에 타입 제한 안하기
		Vector v = new Vector(3, 5); // 초기 용량, 증가용량 5

		v.addElement("자바"); // string
		v.addElement(new Double(10.2)); // Double
		v.addElement(date); // 객체(object)

		System.out.println("--------------------3개 객체 추가---------------------");
		System.out.println("size : " + v.size() + " , capacity : " + v.capacity());

		for (i = 0; i < 10; i++) { // 객체 10개 추가
			v.addElement(new Integer(i));
		}
		System.out.println("--------------------10개 객체 추가---------------------");
		System.out.println("size : " + v.size() + " , capacity : " + v.capacity());

		System.out.println("-------------------Vector 내용 출력---------------------");
		Enumeration enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}

		System.out.println("-------------------객체 내용 포함 확인---------------------");
		if (v.contains("자바"))
			System.out.println("자바 문자열 포함되어 있음");
		else
			System.out.println("자바 미포함");

		System.out.println("10.2 객체 위치 ? : " + v.indexOf(10.2));
		System.out.println("입력 시간 : " + date);
		System.out.println(v.get(v.indexOf(date))); // = System.out.println(v.get(2));

		// date object delete
		v.removeElementAt(v.indexOf(date));
		System.out.println("****************************");
		System.out.println("size : " + v.size() + " , capacity : " + v.capacity());
		System.out.println(v);

		for (i = 0; i < v.size(); i++) {
			// v.removeElementAt(i); //요소가 지워지면, 하나씩 앞으로 땡겨짐!
			// = v.remove(i); //인덱스 번호 지움
			// v.remove(10.2); //해당 요소 이름으로 지우게 됨
		}
		
//		v.removeAllElements(); //모두 지우기		
		
		System.out.println("****************************");
		System.out.println("size : " + v.size() + " , capacity : " + v.capacity());
		System.out.println(v);
		
		System.out.println("-------------------객체 내용 바꾸기---------------------");
		v.setElementAt("java", 2); //3번째 위치에 java문자열 추가하겠다.
		enu=v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}
		
		
		v.trimToSize();
		System.out.println("\n****************************");
		System.out.println("size : " + v.size() + " , capacity : " + v.capacity());
		System.out.println(v);

		
		System.out.println("------------------------------------------");
		v.setSize(2); //강제로 크기 2로 축소한다.
		enu=v.elements();
		while (enu.hasMoreElements()) {
			System.out.print(enu.nextElement() + "\t");
		}
	}

}
