package ex02.collection_list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

// 순서 있고 중복 허용

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		System.out.println("Length               | capacity");
		System.out.println(v.size() + "             /" + v.capacity());

		System.out.println("---------------------------------------");
		Vector<Integer> v2 = new Vector<>(3, 4); // 초기용량, 증강용량
		System.out.println("Length               | capacity");
		System.out.println(v2.size() + "  " + v2.capacity());
		v2.add(12);
		v2.add(13);
		v2.add(11);
		v2.add(65);
		v2.add(78);
		v2.add(5);
		v2.add(12);
		v2.add(12);
		v2.add(342);
		v2.add(12553);

		System.out.println("Length               | capacity");
		System.out.println(v2.size() + "  " + v2.capacity());
		System.out.println(v2);
		System.out.println(v2.size() +"");

		System.out.println("---------------------------------------");

		Iterator it = v2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------------------------");

		for(int x=0; x<v2.size(); x++) {
			System.out.println(v2.get(x));
		}
		System.out.println("---------------------------------------");

		Collections.sort(v2);
		for(int x=0; x<v2.size(); x++) {
			System.out.println(v2.get(x));
		}
		
		System.out.println("---------------------------------------");
		
		for(int x=0; x<v2.size(); x++) {
			Integer num = v2.elementAt(x); //해당 요소 객체 꺼내옴
			System.out.println(num.toString());
		}
		
		System.out.println(v2.size() + "  " + v2.capacity());
		
		
		System.out.println("---------------------------------------");
		v2.trimToSize();
		System.out.println(v2.size() + "  " + v2.capacity());


		
	}

}
