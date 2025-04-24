package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// 1. Driver Load.. exception
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "heejin", "oracle");

		// 3. USE (DML - Select )
		Statement stmt = conn.createStatement();

		// 반환값이 있는 경우 : executeQuery() -select
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); // ctrl + shift + x -> 대문자로 변경

		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gno = rs.getInt(1); // *테이블의 번호(1번부터 시작)
			String gname = rs.getString("gname"); // *권장사항:필드명
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}

		// 4. 자원 반환(Close)
		rs.close();
		stmt.close();
		conn.close();
	}
}
