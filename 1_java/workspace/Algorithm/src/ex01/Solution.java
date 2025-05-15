package ex01;

class Solution {
	public int solution(String s) {
		// baabaa
		// bbaa
		// aa
		// "" -> 0 else -> 1;

		int answer = 1;
		String str = "";
		while (true) {
			for (int x = 0; x < s.length() - 1; x++) {
				if (s.indexOf(x) == s.indexOf(x + 1))
					continue;
				else
					str += s.indexOf(x);

				System.out.println(str);
				s = str;
			}
		}
	}

}

