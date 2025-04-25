

package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// [gno로 상품 업데이트 하기 (pstmt)]
		
		Scanner sc = new Scanner(System.in);

		// 1. Driver Load.. exception
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. Connection & Open
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "heejin", "oracle");

		// 3. USE (DML - Insert ) -- PreparedStatement(변수처리)
		System.out.println("변경 할 상품번호/상품명/최저가/최고가");
		String sql = "UPDATE GIFT SET GNO=16, GNAME=?, G_START=?, G_END=?  WHERE GNO=?"; // gno, gname, g_s, g_e

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(4, sc.nextInt());
//		pstmt.setInt(1, sc.nextInt()); // 첫번째 물음표에 20을 넣는다.
		pstmt.setString(1, sc.next()); // 두번째 물음표에 " " 넣는다.
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());

		int ret = pstmt.executeUpdate(); // 반환값이 없는 경우(Insert, Update, Delete)

		System.out.println(ret + "개 데이터 추가 완료!");

		// 4. 자원 반환(Close)
		pstmt.close();
		conn.close();

	}
}
