package ex02.collection_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>(10);
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(13));
		list.add(new Integer(17));

		ArrayList list2 = new ArrayList<>(list.subList(1, 4)); // 1~3번 인덱스 추출
		print(list, list2);
		list2.add(33);

		Collections.sort(list);
		Collections.sort(list2);
		print(list, list2);
		System.out.println("list.containsAll(list2) : " + list.containsAll(list2)); // list2에 포함된

		for (int x = list2.size() - 1; x >= 0; x--) {
			if (list.contains(list2.get(x))) {
				list2.remove(x);
			}
		}
		print(list, list2);
	}

	public static void print(ArrayList list, ArrayList list2) {
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
