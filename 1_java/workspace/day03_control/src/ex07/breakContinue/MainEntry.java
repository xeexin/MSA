package ex07.breakContinue;

public class MainEntry {
	public static void main(String[] args) {
		for (int x = 0; x < 101; x++) {
			if (x % 2 == 1)
				continue;
			
			System.out.print(x + "\t");
		}

	}

}

//package ex07.breakContinue;
//
//public class MainEntry {
//	public static void main(String[] args) {
//
//		System.out.println("------BREAK------");
//		for (int i = 1; i < 10; i++) {
//			if (i == 7)
//				break;
//			System.out.println("HELLO " + i);
//
//		}
//
//		System.out.println("\n-----CONTINUE-----");
//		for (int x = 0; x < 10; x++) {
//			if (x == 7)
//				continue; //시작점으로 돌린다. for--> 증감식으로, while/do-while--->조건식으로 이동
//			System.out.println("HELLO " + x);
//		}
//
//	}
//
//}
