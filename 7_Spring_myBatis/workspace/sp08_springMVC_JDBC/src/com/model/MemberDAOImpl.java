package com.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

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
	public boolean memberCheck(String id, String pwd) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean memberInsert(String id, String name, String pwd, String email, int age) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

}
