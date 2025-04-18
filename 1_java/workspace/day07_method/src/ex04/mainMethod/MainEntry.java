package ex04.mainMethod;

public class MainEntry {
	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("Using Error!! ");
			return;
		}

//		System.out.println(args[0] + args[1]); // 
//		System.out.println(args[1]);
//		System.out.println(args[2]);

		String s1 = args[0]; // 1
		String s2 = args[1]; // 2
		int num1 = Integer.parseInt(s1); // .to_int
		int num2 = Integer.parseInt(s2);

		System.out.println(num1 + num2);

		System.out.println("plus = " + (Integer.parseInt(args[0]) +( Integer.parseInt(args[1]))));
	}

}
