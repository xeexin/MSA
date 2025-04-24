package quiz3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VideoMain {

	static VideoManager videoManager = new VideoManager();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			System.out.print("1:비디오 추가, 2: 비디오 삭제, 3:비디오 수정, 4:비디오 리스트 출력, 5:종료 : ");
			int num = Integer.parseInt(br.readLine());

			switch (num) {
			case 1: {
				videoManager.addVideo();
				System.out.println("비디오 추가 완료");
				break;
			}
			case 2: {

				videoManager.deleteVideo();
				System.out.println("비디오 삭제 완료");
				break;
			}
			case 3: {

				videoManager.setVideo();
				System.out.println("비디오 수정 완료");
				break;
			}
			case 4: {

				videoManager.showVideo();
				break;
			}
			case 5: {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			default:
				System.out.println("올바른 번호를 입력하세요.");
			}

		}

	}

}
