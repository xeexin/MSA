package view;

import java.sql.SQLException;

import controller.GiftController;
import dbConn.util.ConnectionHelper;

public class MainEntry {
	public static void main(String[] args) throws SQLException {
		
//		ConnectionHelper.getConnection("oracle");
//		ConnectionHelper.getConnection("oracle","heejin","oracle");
		
		GiftController.connect();
		GiftController.menu();
		
	}

}
