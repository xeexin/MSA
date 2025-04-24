package ex03.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.sw.or.kr/site/sw/main.do");

		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;
		while ((inputLine = br.readLine()) != null) { // 끝이 아니면 계속 돌아라
			System.out.println(inputLine);
		}
		
		br.close();
	}

}
