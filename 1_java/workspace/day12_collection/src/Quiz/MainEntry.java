package Quiz;

import java.util.TreeSet;

//hashSet을 이용하여 로또 프로그램을 만들어 보자!

public class MainEntry {
	public static void main(String[] args) {

		TreeSet<Integer> hs = new TreeSet<Integer>();

		while (hs.size() < 5) {
			hs.add((int) (Math.random() * 46));
		}

		System.out.println(hs.headSet(46));

	}
	
	
}
