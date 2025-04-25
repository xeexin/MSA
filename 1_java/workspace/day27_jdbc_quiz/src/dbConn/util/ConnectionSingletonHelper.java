package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingletonHelper {

	private static Connection conn;

	// Default Constructor
	public ConnectionSingletonHelper() {
	}

	// Connection
	public static Connection getConnection(String dsn) {

		if (conn != null)
			return conn;

		try {
			if (dsn.equals("mysql")) {

				// 1. Driver Load.. exception
				Class.forName("com.mysql.jdbc.Driver");

				// 2. Connection & Open
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosaDB", "heejin", "mysql");

			}

			if (dsn.equals("oracle")) {
				// 1. Driver Load.. exception
				Class.forName("oracle.jdbc.OracleDriver");

				// 2. Connection & Open
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "heejin", "oracle");

				System.out.println("Oracle Connection Success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}

	// CLOSE
	public static void close() throws SQLException {

		if (conn != null) {
			try {
				conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
