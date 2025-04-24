package ex06.map;

import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("zz", 1000);
		tm.put("bb", 1000);
		tm.put("aa", 1000);
		tm.put("hh", 1000);
		tm.put("rr", 1000);
		tm.put("kk", 1000);
		
		System.out.println("name : "+ tm.get("aa"));
		System.out.println(tm); // { key=value, , , }  key 값으로 정렬되어서 나옴! -> 자동정렬
	}

}
