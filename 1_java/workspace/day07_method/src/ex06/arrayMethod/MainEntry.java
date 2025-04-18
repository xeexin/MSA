package ex06.arrayMethod;

public class MainEntry {
	public static void main(String[] args) {
		// 배열 타입의 메소드 처리
		int x = 3, y = 5;
		int ret = methodEx(x, y);
		System.out.println(ret);
		line();

		int[] arrRet = methodex2(); // { 1, 2, 3, 4, 5, 6, 7, 8 };

		// for문
//		for (int i = 0; i < arrRet.length; i++) {
//			System.out.print(arrRet[i] + " ");

		// for each문
		for (int item : arrRet) {
			System.out.print(item + " ");
		}
		System.out.println();

		int rett = sum(arrRet);
		System.out.println(rett);

		// 1차워 배열 함수 호출 결과 값 누적된 합 출력하기
		// ---2차원 배열 함수 만들기
		int[][] retArr = methodEx3();
		int sum = 0;
		for (int yy = 0; yy < retArr.length; yy++) {
			for (int i = 0; i < retArr[0].length; i++) {
				sum += retArr[yy][i];
			}
		}

		for (int[] item : retArr) {
			System.out.print(item + "\t"); // 데이터 들어 있는 주소(16진수) 출력됨
			System.out.println(item.hashCode());// 16진수를 10진수로 바꿔 줌
			System.out.println("--------------------");
		}
		
		System.out.println("***** ForEach 구문으로 2차원 배열 데이터 출력하기 *****");
		for(int[] item: retArr) { // =주소 값을 하나씩 불러 와
			for(int arrItem : item) { // 주소에 있는 값을 하나씩 불러 와
				System.out.print(arrItem + "\t");
			}
			System.out.println();
			
		}

		System.out.println();
		System.out.println("sum = " + sum);

	}

	public static int[][] methodEx3() {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		return arr;

	}

	public static int sum(int[] arrRet) {
		int cntSum = 0;
		for (int i = 0; i < arrRet.length; i++) {
			cntSum += arrRet[i];
		}

		return cntSum;

	}

	public static int[] methodex2() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		return arr;
	}

	public static int methodEx(int x, int y) {
		return x + y;
	}

	public static void line() {
		System.out.println("-------------------------------");
	}

}
