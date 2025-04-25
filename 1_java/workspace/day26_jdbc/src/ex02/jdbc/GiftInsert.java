package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver Load.. exception
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "heejin", "oracle");

		// 3. USE (DML - Insert ) -Statemnet
		// ** 자바는 자동커밋!
		Statement stmt = conn.createStatement();

		// insert into gift values(11,'사탕세트', 100, 9000);

		// 3_1. 고정값 레코드 입력
//		String sql = "INSERT INTO GIFT VALUES(12,'사탕세트2', 1002, 9002)"; // auto commit
//		int ret = stmt.executeUpdate(sql);
//		System.out.println(ret + "개의 데이터가 추가되었습니다.");

		// 3_2. 레코드 값 입력하기 _ Scanner, IO, main args
		String sql = "INSERT INTO GIFT VALUES(" + args[0] + ", '" + args[1] + "'," + args[2] + "," + args[3] + ")"; // auto commit
		System.out.println(sql);
		
		int ret = stmt.executeUpdate(sql);
		System.out.println(ret + "개 데이터 추가 성공");
		

		// 4. 자원 반환(Close)
		stmt.close();
		conn.close();
	}
}
