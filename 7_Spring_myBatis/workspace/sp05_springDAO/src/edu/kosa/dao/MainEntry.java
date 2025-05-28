package edu.kosa.dao;

import edu.kosa.model.UserVO;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		UserDAO dao = new OracleUserDAOImpl();
		UserVO vo = new UserVO();

		dao.insert(vo);
		dao.selectAll();
	}
}
