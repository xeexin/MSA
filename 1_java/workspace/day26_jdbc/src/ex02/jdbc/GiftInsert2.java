package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver Load.. exception
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "heejin", "oracle");

		// 3. USE (DML - Insert ) -- PreparedStatement(변수처리)
		String sql = "INSERT INTO GIFT VALUES(?,?,?,?)"; // gno, gname, g_s, g_e
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 20); // 첫번째 물음표에 20을 넣는다.
		pstmt.setString(2, "과자종합세트"); // 두번째 물음표에 " " 넣는다.
		pstmt.setInt(3, 3000);
		pstmt.setInt(4, 9999);
		
		int ret = pstmt.executeUpdate(); // 반환값이 없는 경우(Insert, Update, Delete)
		
		System.out.println(ret + "개 데이터 추가 완료!");
		
		// 4. 자원 반환(Close)
		pstmt.close();
		conn.close();
	}
}
