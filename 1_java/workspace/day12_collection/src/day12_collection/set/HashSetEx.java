package day12_collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		Object[] objarr = { "1", new Integer(1), "2", "3", "3", "4", "4" }; // string과 integer의 값이 타입이 다름

		Set set = new HashSet();
		
		for (int x = 0; x < objarr.length; x++) {
			set.add(objarr[x]); // 중복 허용하지 않음, 타입이 다른 것은 다른 값으로 인식한다!
		}
		System.out.println(set);

	}

}
