package ex02.textPackage.copy;

import java.util.TreeSet;

public class ComparatorMain {
	public static void main(String[] args) {
		TreeSet set1 = new TreeSet(); // 오름차순 정렬
		TreeSet set2 = new TreeSet(new UserDesending()); //=사용자가 만든 내림차순 클래스 객체 전달

		int[] score = { 99, 69, 59, 100, 84, 43, 98, 89, 66 };

		for (int x = 0; x < score.length; x++) {
			set2.add(score[x]);
		}

		System.out.println(set2);
	}

}
