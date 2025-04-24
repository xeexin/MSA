package ex06.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		// 응시자의 이름과 점수
		map.put("희진", 50);
		map.put("민희", 30);
		map.put("재용", new Integer(75));
		map.put("제이", 80);
		map.put("휘", 60);

		Set set = map.entrySet(); // 리턴 타입 Set
		System.out.println(set); // 배열 형태 [key=value, , ,] 순서 없음!

		Iterator it = set.iterator();
		System.out.println(it.next());

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("이름 : " + e.getKey() + " 점수 : " + e.getValue());
		}

		// key만
		set = map.keySet();
		System.out.println("참가자 명단: " + set);

		// value만
		Collection values = map.values();
		System.out.println(values);

		it = values.iterator();
		System.out.println(it.next()); // 첫번째 값이 나옴.

		int total = 0;
		while (it.hasNext()) {
			Integer num = (Integer) it.next();
			total += num.intValue();
		}

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float) total / set.size());
		System.out.println("최고점 : " + Collections.max(values));
		System.out.println("최하점 : " + Collections.min(values));

		// Set set2 = (Set) map.entrySet().iterator();

	}
}
