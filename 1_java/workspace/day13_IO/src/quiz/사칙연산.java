package quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// IO객체 이용하여 사칙연산 프로그램 작성하기

public class 사칙연산 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("숫자를 입력하세요 : ");
			int num1 = Integer.parseInt(br.readLine());

			System.out.print("숫자를 입력하세요 : ");
			int num2 = Integer.parseInt(br.readLine());

			System.out.print("연산자를 입력하세요 ('+' '-' '*' '/') : ");
			String operator = br.readLine();

			switch (operator) {
			case "+": {
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			}
			case "-": {
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			}
			case "/": {
				if (num2 == 0) {

					System.out.print("0으로 나눌 수 없습니다. 숫자를 다시 입력해주세요 : ");
					int num3 = Integer.parseInt(br.readLine());

					System.out.println(num1 + " / " + num3 + " = " + (num1 / num3));

				} else
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			}
			case "*": {
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			}
			default:
				System.out.println("올바른 연산자를 입력해주세요.");
				break;
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

	}
}
