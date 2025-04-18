package quiz;

import java.util.Scanner;

public class year {
	// 윤년 (2월 29일) 4년에 한번
	// 평년 (2월 28일)
	// 연도를 입력 받고

//	if(year %4 ==0) {
//		if(year %100 != 0) || if(year %400 ==0) {
//			"윤년"
//		}
//	}

	public static void main(String[] args) {

		int year;
		String msg = "";
		boolean flag = false;

		System.out.print("연도를 입력하세요 : ");
		year = new Scanner(System.in).nextInt();

//		if (year % 4 == 0) {
//			if (year % 100 != 0) {
//				System.out.println("윤년");
//			} else if (year % 400 == 0) {
//				System.out.println("윤년");
//			} else {
//				System.out.println("평년");
//			}
//		} else {
//			System.out.println("평년");
//		}

		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			flag = true;
		}

		msg = (flag == true) ? "윤년" : "평년";
		System.out.println(msg);

	}
}
