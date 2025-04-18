package ex02.datatype;

/*
 * public class DataType2 {
 * 
 * // 모든 자료형은 자신의 범위(크기)를 안 벗어난다. public static void main(String[] args) { 
 * short sh = 32767; // -32768~32767 
 * int num = 5000; // -21e8~21e8;
 * 
 * System.out.println(sh + " " + num);
 * 
 * num = -32769; // 범위 밖 num = 32770; // 돌다가 자기가 가지고 있는 범위 내에서 숫자를 가짐
 * 
 * sh = (short) num; // 명시적 형변환 System.out.println(sh + " " + num);
 * 
 * }
 * 
 * }
 */

public class DataType2 {

	public static void main(String[] args) {
		short sh = 3; // -32768 ~ 32767
		int num = 500000; // -21e8~21e8

		// 작은 자료형이 큰자료형에 들어갈 때 자동 형변환됨 ( 묵지적 형변환)
		num = sh;// int(4) = short(2)
		
		System.out.println(sh + " , " + num);
		
		sh =(short) num; // short(2) = int(4) -> 큰 자료형이 작은 자료형에 들어가려고 함 (명시적으로 형변환 필요)
	}
}
