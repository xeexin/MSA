package edu.kosa.dao.di;

import java.sql.Connection;
import java.sql.DriverManager;

// Oracle DB Connection
public class ConnectionMakerImpl implements ConnectionMaker {

	@Override
	public Connection makeConn() throws Exception {
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
