package ex06.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx3 {
	public static void main(String[] args) {
		String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

		HashMap map = new HashMap();

		for (int x = 0; x < data.length; x++) {
			if (map.containsKey(data[x])) {
				Integer value = (Integer) map.get(data[x]);
				map.put(data[x], new Integer(value.intValue() + 1));
			} else {
				map.put(data[x], new Integer(1));
			}
		} // end for

		Iterator it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = ((Integer) entry.getValue()).intValue();
			System.out.println(entry.getKey() + " : " + _printBar('■', value) + " " + value);
		}
	}//main end

	public static String _printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int x=0; x<bar.length; x++) {
			bar[x] = ch;
		}
		return new String(bar);
		
	}

}
