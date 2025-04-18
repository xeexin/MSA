package ex07.argumentVariable;

//가변길이...
public class MainEntry {

	public static void plus(int... x) {
//		int[] a = new int[30]; //고정길이 배열

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
	}

	public static void plus(String... str) {
		int sum = 0;
		for (int x = 0; x < str.length; x++) {
			System.out.print(str[x] + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		plus(1, 2);
		plus(1, 2, 3, 4, 5);
		plus(1);
		plus(1, 2, 3, 4, 5, 6, 7);

		plus("kbs", "mbc");
		plus("aa", "bb", "cc");
	}

//	private static void plus(int i, int j, int k, int l, int m, int n, int o) {
//		
//	}
//
//	private static void plus(int i) {
//		
//	}
//
//	private static void plus(int i, int j, int k, int l, int m) {
//		
//	}
//
//	private static void plus(int i, int j) {
//		
//	}
}
