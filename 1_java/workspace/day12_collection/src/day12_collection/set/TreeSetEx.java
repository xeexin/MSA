package day12_collection.set;

import java.util.TreeSet;

/**
 * 중복 허용 안됨
 * 단, 자동정렬 해준다.
 */
public class TreeSetEx {
	public static void main(String[] args) {
		

		TreeSet set = new TreeSet<>();

		int[] score = { 100, 85, 95, 37, 28, 100, 85, 98, 37,50 };

		for (int x = 0; x < score.length; x++) {
//			set.add(score[x]);
			set.add(new Integer(score[x]));
		}

		System.out.println(set);
		
		System.out.println("----------------------------------------------");
		System.out.println("50보다 작은 값 : " +  set.headSet(50)); // 50 보다 작은 값!
		System.out.println("50보다 큰 값 : " +  set.tailSet(50)); // 이때 50 포함 되게 됨

	}
}
