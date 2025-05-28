package edu.kosa.dao.di;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import edu.kosa.model.UserVO;

// Controller 역할
public class UserDAO {

	@Autowired
	private ConnectionMaker connectionMaker; // has-a

	// insert, select, update, delete
	public void insert(UserVO vo) throws Exception {
		Connection conn = connectionMaker.makeConn(); // DB Connect

		String sql = "INSERT INTO USERS(ID,NAME,PASSWORD) VALUES(?,?,?)";
//		String sql = "INSERT INTO USERS(ID,NAME,PASSWORD) VALUES( " + " 'heejin' " + ",'희진' " + ",'123' " + ")";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getName());
		pstmt.setString(3, vo.getPassword());
		int ret = pstmt.executeUpdate();
		System.out.println(ret + "개 입력 성공!");

		pstmt.close();
		conn.close();
	}

	// selectAll
	public void selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = connectionMaker.makeConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM USERS");

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				String password = rs.getString("password");
				System.out.println(id + "\t" + name + "\t" + password);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// selectById...

	// updateById...

	// deleteById
	public void deleteById(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(new InputStreamReader(System.in));

		try {
			conn = connectionMaker.makeConn();

			pstmt = conn.prepareStatement("DELETE FROM USERS WHERE ID=?");

			pstmt.setString(1, id);
			int ret = pstmt.executeUpdate();
			System.out.println(ret + "개 삭제 성공!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// menu
	public void menu() {
		System.out.println("선택하세요 : \n1.Insert ");
		System.out.println("2. SelectAll \n3.SelectById \n4.Update \n5.Delete");
	}

}
