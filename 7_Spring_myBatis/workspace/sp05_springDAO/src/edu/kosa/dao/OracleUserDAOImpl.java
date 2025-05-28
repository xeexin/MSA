package edu.kosa.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleUserDAOImpl extends UserDAO {

	@Override
	public Connection getConn() throws Exception {
		// 1. Driver load
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String uid = "heejin";
		String pwd = "oracle";

		Connection conn = DriverManager.getConnection(url, uid, pwd);
		return conn;
	}

}
