package day12_collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		hs.add("키보드");
		hs.add("키보드");

		System.out.println("요소 개수 : " + hs.size()); // 중복 허용하지 않기 때문에 4가 나온다!
		System.out.println(hs); // 출력 지 맘대로 나옴 -> 순서 없음!

		System.out.println("--------------------------------");

		HashSet<Integer> hs2 = new HashSet<>(); // jdk 5.x 이상 <> 선언 시 객체 생성할 때 생략 가능
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
		// hs2.add("hello"); -> 절대 안됨

		// HashSet<int> hs3 = new HashSet<>(); -> wrapper 클래스만 가능!!!!
		System.out.println(hs2);

		System.out.println("--------------------------------");

		HashSet hs3 = new HashSet<>(); // 타입 제한 안하는 거 가능 -> 아무거나 넣을 수 있음
		hs3.add(12.34);
		hs3.add("string");
		hs3.add(300);
		System.out.println(hs3);

		System.out.println("--------------------------------");

		Iterator it = hs3.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------------------");

		it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
