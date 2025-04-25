package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import dbConn.util.ConnectionSingletonHelper;

public class DeptController {

	// 전역변수 설정
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	static Connection conn = null;

	// Connect
	public static void connect() {

		try {
			conn = ConnectionSingletonHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동 커밋 off
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Close
	public static void close() {
		try {
		
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
