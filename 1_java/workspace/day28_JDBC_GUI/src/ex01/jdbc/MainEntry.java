package ex01.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) {
		Connection conn = ConnectionHelper.getConnection("oracle");
		Statement stmt = null;
		ResultSet rs = null;

		try {
			stmt = conn.createStatement();
			// SQL 구문, HTML TAG는 자바/ jsp/ servelt에서 문자열 취급한다.

			String sql = "CREATE TABLE KOSADB (NAME VARCHAR2(20), AGE NUMBER)";
			StringBuffer sb = new StringBuffer();
			
			sb.append("CREATE TABLE KOSADB (NAME VARCHAR2(20), AGE NUMBER)");
			
			System.out.println(sb.toString());
			stmt.executeUpdate(sb.toString()); // 반환값 없으므로 executeUpdate 필요!

			sql = "INSERT INTO KOSADB VALUES('HEEJIN',27)";
			int result = stmt.executeUpdate(sql);

			sql = "select * from kosadb";
			rs = stmt.executeQuery(sql); // 반환값 있으니까!

			System.out.println(result + "개 추가!");

			while (rs.next()) {
				System.out.println("name : " + rs.getString("name"));
				System.out.println("age : " + rs.getInt(2));
			}

			
//			sql = "drop table kosadb";
//			result = stmt.executeUpdate(sql);
//			System.out.println("Drop table Success : " + result);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(conn);
		}
	}

}
