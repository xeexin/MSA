package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftDTO;

public class GiftController {

	// db 연결
	// select insert update delete

	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// Connection
	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋 끄겠다!

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Menu
	public static void menu() throws SQLException {
		GiftDTO dto = new GiftDTO();

		while (true) {
			System.out.println();
			ConnectionHelper.menu();

			int num = sc.nextInt();

			switch (num) {
			case 0: {
				System.out.print("Commit 하시겠습니까?(Y/N) : ");
				System.out.println("커밋을 안하면 Rollback 됩니다.");

				if (sc.next().equalsIgnoreCase("y")) {
					conn.commit(); // 예외 발생
					selectAll(dto.getClassName());
				} else {
					conn.rollback();
					selectAll(dto.getClassName());
				}
				break;
			}
			case 1: {
				selectAll(dto.getClassName());
				break;
			}
			case 2: {
				insert();
				selectAll(dto.getClassName());
				break;
			}
			case 3: {
//				update(); break;
				update(dto.getClassName());
				break;
			}
			case 4: {
//				delete(); break;
				delete(dto.getClassName());
				break;
			}
			case 5: {
				selectByGno(dto.getClassName());
				break;
			}
			case 6: {
				close();
				System.out.println("프로그램을 종료 합니다.");
				System.exit(0);
				break;
			}
			case 7: {
				conn.commit();
				System.err.println("성공적으로 완료 되었습니다.");
				break;
			}

			} // switch end
		} // while end
	} // end menu()

	// select all
	public static void selectAll(String className) throws SQLException {

		rs = stmt.executeQuery("SELECT * FROM " + className);

		ResultSetMetaData rsmd = rs.getMetaData(); // 해당 테이블에 대한 정보를 다 가져옴
		int cnt = rsmd.getColumnCount();

		while (rs.next()) {
			for (int x = 1; x <= cnt; x++) { // 각 타입별로 출력 하기

				switch (rsmd.getColumnType(x)) {

				case Types.NUMERIC:
				case Types.INTEGER: {
					System.out.println(rsmd.getColumnName(x) + " : " + rs.getInt(x) + " ");
					break;
				}
				case Types.FLOAT: {
					System.out.println(rsmd.getColumnName(x) + " : " + rs.getFloat(x) + " ");
					break;
				}
				case Types.DOUBLE: {
					System.out.println(rsmd.getColumnName(x) + " : " + rs.getDouble(x) + " ");
					break;
				}
				case Types.CHAR: {
					System.out.println(rsmd.getColumnName(x) + " : " + rs.getString(x) + " ");
					break;
				}
				case Types.DATE: {
					System.out.println(rsmd.getColumnName(x) + " : " + rs.getDate(x) + " ");
					break;
				}
				default:
					System.out.println(rsmd.getColumnName(x) + " : " + rs.getString(x) + " ");
					break;
				} // end switch
			} // end for
			System.out.println();
		} // while end
	} // end selectAll

	// insert
	public static void insert() throws SQLException {

		System.out.print("GNO : ");
		String gno = sc.next();
		System.out.print("GNAME : ");
		String gname = sc.next();
		System.out.print("G_START : ");
		String g_start = sc.next();
		System.out.print("G_END : ");
		String g_end = sc.next();

		try {
			pstmt = conn.prepareStatement("INSERT INTO GIFT VALUES( ?, ?, ?, ? )");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);

			int result = pstmt.executeUpdate(); //

			System.out.println(result + "개 데이터가 추가 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete
	public static void delete(String className) throws SQLException {
		// DELETE FROM TEST WHERE
		selectAll("gift");

		System.out.print("삭제할 GNO를 입력하세요 : ");
		int target = sc.nextInt();

		try {
			pstmt = conn.prepareStatement("delete from " + className + " where gno = ?");
			pstmt.setInt(1, target);

			int ret = pstmt.executeUpdate();
			System.out.println(ret + "개 데이터 삭제 완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// update
	public static void update(String className) throws SQLException {
		selectAll("gift");
		System.out.print("수정할 상품의 GNO를 입력하세요 : ");
		int target = sc.nextInt();

		try {
			pstmt = conn.prepareStatement("UPDATE " + className + " SET GNO = " + target
					+ ", GNAME = ?, G_START = ?, G_END = ? WHERE GNO = " + target);
			System.out.print("변경할 상품명 : ");
			String gname = sc.next();

			System.out.print("변경할 G_Start : ");
			int g_start = sc.nextInt();

			System.out.print("변경할 G_End : ");
			int g_end = sc.nextInt();

			pstmt.setString(1, gname);
			pstmt.setInt(2, g_start);
			pstmt.setInt(3, g_end);

			int ret = pstmt.executeUpdate();
			System.out.println(ret + "개의 데이터 업데이트 완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// select - where(condition)
	public static void selectByGno(String className) throws SQLException {
		selectAll(className);
		System.out.print("찾고 싶은 GNO를 입력하세요 : ");
		int targetGno = sc.nextInt();

		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from " + className + " where gno = " + targetGno);

		System.out.println("GNO\tGNAME\tG_START\tG_END\t");
		while (rs.next()) {
			int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_start = rs.getInt("g_start");
			int g_end = rs.getInt("g_end");

			System.out.println(gno + "\t" + gname + "\t" + g_start + "\t" + g_end);
		}

	}

}
