package ex04.array;

public class QuizEx1 {
	public static void main(String[] args) {
		// 기상청에 입사했다. 특정 달(30일 기준)에 강수량의 평균을 구하여라
		//평균은 소수점 이하 두자리까지

		double arr[] = new double[] { 1.2, 0, 10.0, 0.5 };
		double sum = 0.0;

		for (int x = 0; x < arr.length; x++) {
			sum += arr[x];
		}
		
		double ret=sum/30;
		System.out.printf("평균 강수량은 %.2f 입니다.", ret);

	}
}

//package ex04.array;
//
//public class QuizEx1 {
//	public static void main(String[] args) {
//		// 배열 여러개 데이터 중에서 7의 개수를 찾기
//		int[] a = new int[] { 7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 }; // 선언과 동시에 초기화
//		int seek = 7, count = 0, sum = 0;
//
//		int cnt = 0;
//		for (int x = 0; x < a.length; x++) {
//			sum += a[x];
//		}
//
//		System.out.println(sum);
//	}
//}

//package ex04.array;
//
//public class QuizEx1 {
//	public static void main(String[] args) {
//		// 배열 여러개 데이터 중에서 7의 개수를 찾기
//		int[] a = new int[] { 7, 3, 7, 8, 1, 9, 7, 100, 12, 7, 33, 7 }; // 선언과 동시에 초기화
//
//		int cnt = 0;
//		for (int x = 0; x < a.length; x++) {
//			if (a[x] == 7)
//				cnt++;
//		}
//
//		System.out.println("7의 개수는 " + cnt + "개!");
//	}
//}
