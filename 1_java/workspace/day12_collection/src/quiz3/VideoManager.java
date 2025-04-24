package quiz3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VideoManager {

	HashMap<Integer, VideoClass> map = new HashMap<Integer, VideoClass>();
	int no = 1;

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void addVideo() throws NumberFormatException, IOException {
		System.out.print("비디오 번호를 입력하세요 : ");
		int videoNum = Integer.parseInt(br.readLine());

		System.out.print("비디오 제목을 입력하세요 : ");
		String videoName = br.readLine();

		System.out.print("비디오 장르를 입력하세요 : ");
		String videoGenre = br.readLine();

		System.out.print("대여여부를 입력하세요 : ");
		boolean rent = Boolean.parseBoolean(br.readLine());

		if (rent == true) {
			System.out.print("대여자 이름을 입력하세요 : ");
			String rentName = br.readLine();

			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			String rentDateStr = sdf.format(new Date()); // 현재 날짜를 형식에 맞게 문자열로 변환

			map.put(no++, new VideoClass(videoNum, videoName, videoGenre, rent, rentName, rentDateStr));

		} else {
			map.put(no++, new VideoClass(videoNum, videoName, videoGenre, rent));
		}

	}

	public void deleteVideo() throws NumberFormatException, IOException {
		System.out.print("삭제할 비디오 번호를 입력하세요 : ");
		showVideo();
		int num = Integer.parseInt(br.readLine());

		map.remove(num);

	}

	public void setVideo() throws NumberFormatException, IOException {
		System.out.print("수정할 비디오 번호를 입력하세요 : ");
		showVideo();
		int num = Integer.parseInt(br.readLine());
		
		System.out.print("수정할 비디오 시리얼 넘버를 입력하세요 : ");
		int videoNum = Integer.parseInt(br.readLine());
		map.get(num).setVideoNum(videoNum);

		System.out.print("수정할 비디오 제목을 입력하세요 : ");
		String videoName = br.readLine();
		map.get(num).setTitle(videoName);

		System.out.print("수정할 비디오 장르를 입력하세요 : ");
		String videoGenre = br.readLine();
		map.get(num).setGenre(videoGenre);


		System.out.print("대여여부를 수정하세요 : ");
		boolean rent = Boolean.parseBoolean(br.readLine());

		if (rent == true) {
			System.out.print("대여자 이름을 입력하세요 : ");
			String rentName = br.readLine();
			map.get(num).setRentCustomer(rentName);

			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			String rentDateStr = sdf.format(new Date());
			
		}
		

	}

	public void showVideo() {
		if (map.isEmpty()) {
			System.out.println("등록된 비디오가 없습니다.");
			return;
		}

		Set<Map.Entry<Integer, VideoClass>> entrySet = map.entrySet();
		for (Map.Entry<Integer, VideoClass> entry : entrySet) {
			System.out.println("[" + entry.getKey() + "] " + entry.getValue().toString());
		}
	}

}
