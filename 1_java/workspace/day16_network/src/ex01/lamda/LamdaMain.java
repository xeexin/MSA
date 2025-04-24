package ex01.lamda;

import java.util.ArrayList;

public class LamdaMain {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(55);
		numbers.add(99);
		numbers.add(53);
		numbers.add(28);
		numbers.add(76);

		System.out.println(numbers); // [55, 99, 53, 28, 76]
		
		for(int item : numbers) {
			System.out.println(item);
		}

		System.out.println("---------------------------------------");
		 numbers.forEach((n)-> {System.out.println(n);});

	}

}
