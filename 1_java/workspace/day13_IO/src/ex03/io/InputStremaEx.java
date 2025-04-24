package ex03.io;

public class InputStremaEx {
	public static void main(String[] args) {
		System.out.print("input = ");

		try {
			int su;
			while ((su = System.in.read()) != -1) { // 더 이상 입력 받을게 없을 때 까지
				if (su == 10 || su == 13 || su == 32) { // 스페이스바, 텝키, 엔터키의 아스키코드
					continue;
				}
				if (su == 113 || su == 81) // 소문자 q, 대문자 Q
					break;
				char ch = (char) su;
				System.out.print(ch + " ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
