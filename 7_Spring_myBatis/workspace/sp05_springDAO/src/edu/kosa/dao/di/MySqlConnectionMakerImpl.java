package edu.kosa.dao.di;

import java.sql.Connection;
import java.sql.DriverManager;

// MySql DB Connection
public class MySqlConnectionMakerImpl implements ConnectionMaker {

	@Override
	public Connection makeConn() throws Exception {
		// 1. Driver load
		Class.forName("com.mysql.jdbc.Driver");

		// 2. Connection & Open
		String url = "jdbc:mysql://localhost:3306:DBName";
		String uid = "heejin";
		String pwd = "mysql";

		Connection conn = DriverManager.getConnection(url, uid, pwd);
		return conn;
	}

}
