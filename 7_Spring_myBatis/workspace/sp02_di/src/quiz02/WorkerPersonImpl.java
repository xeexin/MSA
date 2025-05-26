package quiz02;

import java.io.InputStreamReader;
import java.util.Scanner;

public class WorkerPersonImpl implements Person {
	private String name, position, department;
	Scanner sc = new Scanner(new InputStreamReader(System.in));

	@Override
	public void input() {
		System.out.print("이름 입력 : ");
		name = sc.next();

		System.out.print("직급 입력 : ");
		position = sc.next();

		System.out.print("부서 입력 : ");
		department = sc.next();

	}

	@Override
	public void output() {
		System.out.println("이름 : " + name + ", 직급 : " + position + ", 부서 : " + department);

	}

}
