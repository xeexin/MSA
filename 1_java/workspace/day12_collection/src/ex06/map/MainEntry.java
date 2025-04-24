package ex06.map;

import java.util.HashMap;
import java.util.Scanner;

//MAP : key/value 한쌍으로 처리 (set + list)
public class MainEntry {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		// id pw
		map.put("kosa", "1234");
		map.put("sbs", "1111");
		map.put("mbc", "3474");
		map.put("kosa", "9091");

		// 키 값은 고유해야함! 중복일 경우 마지막 거 덮어씀
//		System.out.println(map);
//		System.out.println("요소 개수 : " + map.size()); //key 중복 허용 X, value 중복 O, 
//		map.put("id", "pwd");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ID와 PW를 입력해주세요. ");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("pw : ");
			String pw = sc.nextLine().trim();

			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}else {
				if(!(map.get(id)).equals(pw)){
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");	
				}
				else {
					System.out.println("ID와 PW가 일치합니다. 반갑습니다.");
					break;
				}
			}
		} // end while

	}
}
