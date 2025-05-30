package com.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component // memberDAOImpl bean 설정됨
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public MemberVO selectMemberById(String id) throws Exception { // 특정 ID로 검색
		String sql = "SELECT * FROM USERMEMBER WHERE ID = ?";

		try {
			return this.jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<MemberVO>(MemberVO.class), id);
		} catch (Exception e) {

//			return new EmptyResultDataAccessException(); // 예외 발생 시 null 리턴
//			System.out.println(e.getMessage());

			e.printStackTrace();
			return null;
		}
	}

	@Override
	public List memberById(String id) throws Exception { // select
		String sql = "SELECT * FROM USERMEMBER WHERE ID = ?";

		return jdbcTemplate.queryForList(sql, id);
	}

	@Override
	public boolean memberCheck(String id, String pwd) throws SQLException { // id check

		String sql = "SELECT * FROM USERMEMBER WHERE ID = ? AND PWD = ?";

		boolean flag = false;
		Object[] params = { id, pwd };

		if (jdbcTemplate.queryForList(sql, params).size() > 0)
			flag = true;

		return flag;
	}

	@Override
	public boolean memberInsert(String id, String name, String pwd, String email, int age) throws SQLException {
		String sql = "INSERT INTO USERMEMBER VALUES(?,?,?,?,?)";

		boolean flag = false;

		Object[] params = { id, name, pwd, email, age };

		if (jdbcTemplate.update(sql, params) > 0)
			flag = true;

		return flag;
	}

}
