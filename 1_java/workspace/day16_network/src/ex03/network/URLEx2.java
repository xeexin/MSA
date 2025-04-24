package ex03.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("https://www.google.com/search?q=capybara&oq=capybara&gs_lcrp=EgZjaHJvbWUqDQgAEAAY4wIYsQMYgAQyDQgAEAAY4wIYsQMYgAQyCggBEC4YsQMYgAQyBwgCEAAYgAQyBwgDEC4YgAQyCggEEAAYiwMYgAQyEAgFEC4YiwMYmQMYqAMYgAQyCggGEAAYiwMYgAQyCggHEAAYiwMYgAQyCggIEAAYiwMYgAQyCggJEAAYiwMYgATSAQg0Mjg5ajFqN6gCCLACAQ&sourceid=chrome&ie=UTF-8");
		
		
//		https://www.google.com
//			/search?
//					q=capybara //속성 = 값 & 속성= 값2 & 속성 = 값3...
//					&oq=capybara
//					&gs_lcrp=EgZjaHJvbWUqDQgAEAAY4wIYsQMYgAQyDQgAEAAY4wIYsQMYgAQyCggBEC4YsQMYgAQyBwgCEAAYgAQyBwgDEC4YgAQyCggEEAAYiwMYgAQyEAgFEC4YiwMYmQMYqAMYgAQyCggGEAAYiwMYgAQyCggHEAAYiwMYgAQyCggIEAAYiwMYgAQyCggJEAAYiwMYgATSAQg0Mjg5ajFqN6gCCLACAQ
//					&sourceid=chrome
//					&ie=UTF-8
		
		//URL이 갖고 있는 함수들 사용
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("호스트와 포트번호 : " + url.getAuthority());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("포트번호 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("질문 : " + url.getQuery());
		System.out.println("파일명 : " + url.getFile());
		System.out.println("참조 : " + url.getRef());

	
	}
}
