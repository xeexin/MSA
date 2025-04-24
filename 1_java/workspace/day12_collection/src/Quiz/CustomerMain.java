package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// ArrayList or Vector 이용해서 고객 추가 (add, remove, 고객리스트 출력 for,get,iter,while)
		// 정보 수정(set), 프로그램 종료 메뉴 구성해서 출력하는 프로그램

		ArrayList<Customer> arr = new ArrayList<Customer>();

		while (true) {
			System.out.print("번호를 입력하세요.(1번 멤버추가, 2번 멤버 삭제, 3번 멤버 출력, 4번 멤버 수정, 0번 종료 : ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			switch (num) {
			case 1: { // 멤버 추가
				Customer customer = addMember();
				arr.add(customer);
				System.out.println("추가되었습니다.");

				break;

			}
			case 2: { // 멤버 삭제

				System.out.print("삭제할 고객 이름을 입력하세요 : ");
				String name = sc.next();
				deleteMember(arr, name);
				System.out.println("삭제되었습니다.");
				break;

			}
			case 3: { // 고객리스트 출력
				System.out.println(arr);
				break;

			}
			case 4: { // 고객 정보(이름, 주소, 번호) 수정

				System.out.print("수정할 고객의 이름을 입력하세요 : ");
				String name = sc.next();
				modifyMember(arr, name);

				System.out.println("고객 정보가 수정되었습니다. ");
				break;

			}
			case 0: { // 프로그램 종료

				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);

			}
			default:
				System.out.println("올바른 번호를 입력해 주세요");
				break;

			}
		}
	}

	static void modifyMember(ArrayList<Customer> arr, String name) {
		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x).getName().equals(name)) {
				System.out.print("변경할 이름을 입력하세요 : ");
				String newName = sc.next();
				System.out.print("변경할 주소을 입력하세요 : ");
				String newAddress = sc.next();
				System.out.print("변경할 휴대폰 번호를 입력하세요 : ");
				String newPhone = sc.next();

				new Customer(newName, newAddress, newPhone);
			}
		}
	}

	static Customer addMember() {
		Scanner sc = new Scanner(System.in);

		System.out.print("\n고객 이름를 입력하세요 : ");
		String name = sc.next();
		System.out.print("\n고객 주소를 입력하세요 : ");
		String address = sc.next();
		System.out.print("\n고객 전화번호를 입력하세요 : ");
		String phone = sc.next();

		return new Customer(name, address, phone);
	}

	static void deleteMember(ArrayList<Customer> arr, String name) {
		// 이름으로 멤버 찾아서 멤버 삭제하기
		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x).getName().equals(name)) {
				arr.remove(x);
				break;
			}
		}

	}

}
