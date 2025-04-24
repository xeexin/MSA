package ex06.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//HashMap<String, HashMap> 구조 
public class HashMapEx2 {
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {

		addPhoneNo("친구", "조민희", "010-1111-1111");
		addPhoneNo("친구", "유훈종", "010-2222-2222");
		addPhoneNo("친구", "이태원", "010-3333-3333");
		addPhoneNo("회사", "이재용", "010-4444-4444");
		addPhoneNo("회사", "이유상", "010-5555-5555");
		addPhoneNo("회사", "조이든", "010-6666-6666");
		addPhoneNo("세탁", "010-7777-7777");

		printList();

	} // main end

	// 그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) // 그룹명이 없다면, 추가해줘
		{
			phoneBook.put(groupName, new HashMap());
		}
	}

	// 그룹에 전화번호를 추가하는 메서드
	public static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);

		HashMap group = (HashMap) phoneBook.get(groupName);
		group.put(tel, name); // 전화번호가 같을 순 없으니까 key로 넣기

	}

	public static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);

	}

	public static void printList() {

		Set set = phoneBook.entrySet();
		// System.out.println(set); // [key=value]

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();

			Set subSet = ((HashMap) e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();

			System.out.println("*" + e.getKey() + "[" + subSet.size() + "]");

			while (subIt.hasNext()) {
				Map.Entry subE = (Map.Entry) subIt.next();
				String telNo = (String) subE.getKey();
				String name = (String) subE.getValue();
				System.out.println(name + " " + telNo);
			} // in while end
			System.out.println();

		} // while end

	}

}
