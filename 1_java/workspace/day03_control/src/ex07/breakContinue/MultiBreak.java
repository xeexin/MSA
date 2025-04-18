package ex07.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		boolean flag = true;

		first: {
			second: {
				third: {
					int k = 100;
					System.out.println("BEFORE THE BREAK"); // 1
					if (flag)
						break second; // 여러개 블록 시 break 뒤에 식별자 (식별자 위치까지 탈출)
					System.out.println("THIS WON'T EXECUTE"); // 2

				} // end third

				System.out.println("MSA 2기 홧팅!!");// 3

			} // end second
			System.out.println("THIS IS AFTER SECOND BREAK");

		} // end first
		System.out.println("12345");

		
		
		
		/*
		  식별자 1: { 
		  	식별자 2:{ 
		  		break 식별자1;
		  		 } 
		  	}
		 */

	}
}
