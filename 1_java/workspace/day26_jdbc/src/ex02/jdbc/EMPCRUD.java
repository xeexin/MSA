package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EMPCRUD {

	static Scanner sc = new Scanner(System.in);
	static Connection conn;
	static PreparedStatement pstmt;
	static Statement stmt;
	static ResultSet rs;
	
	
	static void selectByDeptno(){
		
		String sql = "SELECT * FROM EMP WHERE DEPTNO = ?";

		System.out.print("검색하고 싶은 부서 번호를 입력하세요 : ");

		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());

		rs = pstmt.executeQuery();

		System.out.println("사원번호\t이름\t직무\t매니저번호\t고용일\t\t월급\t커미션\t부서번호\t");
		while (rs.next()) {
			int emptno = rs.getInt("EMPNO");
			String ename = rs.getString("ENAME");
			String job = rs.getString("JOB");
			int mgr = rs.getInt("MGR");
			Date hiredate = rs.getDate("HIREDATE");
			double sal = rs.getDouble("SAL");
			double comm = rs.getDouble("COMM");
			int deptno = rs.getInt("DEPTNO");

			System.out.println(emptno + "\t" + ename + "\t" + job + "\t" + mgr + "\t" + hiredate + "\t" + sal + "\t"
					+ comm + "\t" + deptno);
	}
		
		
	
	public static void delete() throws SQLException, ClassNotFoundException, NumberFormatException, IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("삭제하실 사원 번호를 입력하세요.");
        String sql = "delete emp where empno=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, Integer.parseInt(br.readLine()));
        int result = pstmt.executeUpdate();

        System.out.println(result + "개 데이터 삭제 성공");
    }
	
	

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// 1. Driver Load
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "heejin", "oracle");

		// --------------------------------------
		// 3. USE

		// selectAll

		// selectByDeptno
		

			// insert (pstmt)

			// update (pstmt) (empno)

			// delete

			// 4. 자원 반환
			rs.close();
			pstmt.close();
			conn.close();
		
	}

}
