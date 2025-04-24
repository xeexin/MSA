package ex01.generic;

public class MainEntry {
	public static void main(String[] args) {
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = { "a", "b", "apple", "banana" };
		t1.set(str);
		t1.print();

		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = { 1, 2, 3, 4, 5, 14, 15 };
		t2.set(num);
		t2.print();

		GenericEx<Double> t3 = new GenericEx<Double>();
		Double[] d = { 1.2, 2.3, 3.4, 4.5 };
		t3.set(d);
		t3.print();

	}
}
