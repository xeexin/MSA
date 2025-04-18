
package quiz;

import java.util.Scanner;

public class 학점 {
	public static void main(String[] args) {

		System.out.print("점수 입력(0~100) : ");

		int score = new Scanner(System.in).nextInt();
		char grade = ' ';

		/*
		 * switch (score / 10) { case 10: case 9: { grade = 'A'; break; } case 8: {
		 * grade = 'B'; break; } case 7: { grade = 'C'; break; } case 6: { grade = 'D';
		 * break; } case 5: case 4: case 3: case 2: case 1: case 0: { grade = 'F';
		 * break; }
		 * 
		 * default: System.out.println("점수는 0~100점 사이 입니다."); System.exit(0); }
		 */

		//개선된 SWITCH 케이스
		
		grade = switch (score / 10) {// ex) grade = 'A'
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};

		System.out.println(score + "점 ======> " + grade + "학점");

	}
}

/*
 * package quiz;
 * 
 * import java.util.Scanner;
 * 
 * public class 학점 { public static void main(String[] args) {
 * 
 * System.out.print("점수 입력 : ");
 * 
 * int score = new Scanner(System.in).nextInt(); char grade = ' ';
 * 
 * // 1. if 문
 * 
 * if (score >= 90) grade = 'A'; else if (score >= 80) grade = 'B'; else if
 * (score >= 70) grade = 'C'; else if (score >= 60) grade = 'D'; else grade =
 * 'F';
 * 
 * System.out.println(score + "점 ======> " + grade + "학점"); } } //
 */