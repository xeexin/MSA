package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver Load.. exception
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("[Driver Load Success]");
		
		//2. Connection & Open
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //driver:@IP:portNumber:SID(or 전역데이터베이스명)
		String uid = "heejin";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		System.out.println("[Connection Success]");
		
		//3. USE (DML 명령어)
		
		
		//4. 자원 반환(Close)
		
	}
	// ** SQL, Tag는 자바에서 문자열 취급한다.
	
}
