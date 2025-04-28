package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
  DB 연결 정보 반복적인 코딩을 해결하기 위해
  다른 클래스에서 아래 코드 구현을 하지 않도록 설계
  
  Class.forName("");
  Connection conn = DriverManager.getConnection("","","");
  이런식으로 사용
  
  ConnectionHelper.getConnection("mysql") or ("oracle") or .... 
  dsn(data source name)
 */

public class ConnectionHelper {

	// method(접근지정자 : public static) : 연결에 대한 것은 바로 불러서 사용하기 위해서
	public static Connection getConnection(String dsn) {

		Connection conn = null;

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

	public static Connection getConnection(String dsn, String userId, String pwd) {

		Connection conn = null;

		try {
			if (dsn.equals("mysql")) {

				// 1. Driver Load.. exception
				Class.forName("com.mysql.jdbc.Driver");

				// 2. Connection & Open
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kosaDB", userId, pwd);

			}

			if (dsn.equals("oracle")) {
				// 1. Driver Load.. exception
				Class.forName("oracle.jdbc.OracleDriver");

				// 2. Connection & Open
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", userId, pwd);

				System.out.println("Oracle Connection2 Success");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}

	public static void menu() {
		System.out.println("\n=-=-=-=-=-=-=JDBC QUERY-=-=-=-=-=-=-=-==-");
		System.out.println("\t 0. rollback");
		System.out.println("\t 1. 전체보기");
		System.out.println("\t 2. 레코드 삽입(추가)");
		System.out.println("\t 3. 레코드 수정");
		System.out.println("\t 4. 레코드 삭제");
		System.out.println("\t 5. 조건에 의한 검색(ex. gno)");
		System.out.println("\t 6. 프로그램 종료");
		System.out.println("\t 7. commit");
		System.out.println("\t >> 원하는 메뉴 선택하세요. ");

	}

}
