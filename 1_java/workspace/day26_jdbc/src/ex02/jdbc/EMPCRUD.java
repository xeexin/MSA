package ex02.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class EMPCRUD {
	
	//	static {   - 공통
	//		연결메소드
	//	}
	static Scanner sc = new Scanner(System.in);
	static Connection conn;
	static PreparedStatement pstmt;
	static Statement stmt;
	static StringBuilder sb; 

	public static Connection connection() throws ClassNotFoundException, SQLException {
		System.out.println("로딩중....");
		Class.forName("oracle.jdbc.OracleDriver"); // exception
		String url = "jdbc:oracle:thin:@192.168.230.178:1521:xe";
		String uid = "kingsmile";
		String pwd = "oracle";
		conn = DriverManager.getConnection(url, uid, pwd);// exception
		return conn;
	}
	
	// selectAll() 
	static void selectAll() throws SQLException {
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMP"); // ctrl + shift + x = 전부 대문자 만들기
		// 반환값이 있는 경우는 대부분 select 부분이다.
		System.out.println("사번\t성명\t직업\t관리자번호\t입사일\t급여\t성과금\t부서");

		while (rs.next()) {
			int empNo = rs.getInt(1); // rs.getxxx(인덱스번호); // rs.getxxx("필드명");
			String eName = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			Date hireDate = rs.getDate(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);

			System.out.println(empNo + "\t" + eName + "\t" + job + "\t" + mgr + "\t" + hireDate + "\t" + sal + "\t"
					+ comm + "\t" + deptno);
		}
	}
	
	// selectByNo() 
	static void selectByEmpNo(int n) throws SQLException {
        sb = new StringBuilder();
        String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, n);

        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            for (int i = 1; i <= 8; i++)
                sb.append(rs.getString(i) + " ");
            sb.append("\n");
        } // while end
        System.out.println(sb);
    }

    static void selectByNoBtween(int startno, int endno) throws SQLException {
        sb = new StringBuilder();
        String sql = "SELECT * FROM EMP WHERE DEPTNO BETWEEN ? AND ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, startno);
        pstmt.setInt(2, endno);
        
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
			int empNo = rs.getInt(1); // rs.getxxx(인덱스번호); // rs.getxxx("필드명");
			String eName = rs.getString(2);
			String job = rs.getString(3);
			int mgr = rs.getInt(4);
			Date hireDate = rs.getDate(5);
			int sal = rs.getInt(6);
			int comm = rs.getInt(7);
			int deptno = rs.getInt(8);

			System.out.println(empNo + "\t" + eName + "\t" + job + "\t" + mgr + "\t" + hireDate + "\t" + sal + "\t"
					+ comm + "\t" + deptno);
		}
//        while (rs.next()) {
//            for (int i = 1; i <= 8; i++)
//                sb.append(rs.getString(i) + " ");
//            sb.append("\n");
//        } // while end
//        System.out.println(sb);
    }
	
	// insert  
    public static void insert() throws Exception {
	      System.out.println("사원번호,사원이름,직급,MGR,입사일,월급,커미션,부서번호순으로 입력 :");
	      String sql = "INSERT INTO EMP VALUES(?,?,?,?,?,?,?,?)";
	      pstmt = conn.prepareStatement(sql);
	      pstmt.setInt(1, sc.nextInt());
	      pstmt.setString(2, sc.next());
	      pstmt.setString(3, sc.next());
	      pstmt.setInt(4, sc.nextInt());
	      pstmt.setString(5, sc.next());
	      pstmt.setInt(6, sc.nextInt());
	      pstmt.setInt(7, sc.nextInt());
	      pstmt.setInt(8, sc.nextInt());
	      pstmt.executeUpdate();
	      System.out.println("입력완료");
	   }
	
	// update 
    static void update() throws ClassNotFoundException, SQLException {
        System.out.print("수정할 사원번호 입력: ");
        String empno = sc.next();

        System.out.print("수정할 칼럼명 입력(job, sal, deptno): ");
        String cName = sc.next();

        System.out.print("수정할 값 입력: ");
        String value = sc.next();
        if (conn == null) {      connection();       }
        try {
            pstmt = conn.prepareStatement("UPDATE EMP SET "+cName.toUpperCase()+"=? WHERE EMPNO=?");
            if (cName.equals("job")) {
            	pstmt.setString(1, value.toUpperCase());
            } else {
            	pstmt.setInt(1, Integer.parseInt(value));
            }
            pstmt.setInt(2, Integer.parseInt(empno));
            System.out.println(pstmt.executeUpdate()+"개행이 수정되었습니다.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        exit();
    }

	// delete 
    public static void delete() throws SQLException, ClassNotFoundException, NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("삭제하실 사원 번호를 입력하세요.");
		String sql = "DELETE EMP WHERE EMPNO=?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, Integer.parseInt(br.readLine()));
		int result = pstmt.executeUpdate();

		System.out.println(result + "개 데이터 삭제 성공");
	}
	
	// exit() - 종료 close()
    static void exit() throws SQLException {
		  if(pstmt != null)   pstmt.close();
	      if(stmt != null)   stmt.close();
	      if(conn != null)   conn.close();
	      System.out.println("Employee 프로그램을 종료합니다. ");
	}

	// menu()-6
	static void menu() throws Exception {
		conn = connection();
		while (true) {
			System.out.println("1: 사번으로 검색 출력  \n2: 테이블 전체 출력  "
										+ "\n3: 사원추가(레코드) 삽입  \n4: 사원(레코드) 업데이트  \n5: 사원퇴사(레코드) 삭제"
										+ "\n6: 특정범위 부서검색하기 \n7: 종료 ");
			int num = sc.nextInt();

			switch (num) {
				case 1:	selectAll();
						System.out.print("검색 원하는 사번 입력하세요. ");
						selectByEmpNo(sc.nextInt());		break;
				case 2:	selectAll();		break;
				case 3:	insert();	selectAll();		break;
				case 4:	update(); selectAll();		break;
				case 5: selectAll(); delete();	selectAll();		break;
				case 6 : selectAll();
					System.out.println("원하는 부서번호(10~40) 범위 지정해서 찾습니다. 부서 범위는? ");
					selectByNoBtween(sc.nextInt(), sc.nextInt());	break;
				case 7 :	exit();		System.exit(0);
				
			}
			System.out.println();
		}
	}
}
