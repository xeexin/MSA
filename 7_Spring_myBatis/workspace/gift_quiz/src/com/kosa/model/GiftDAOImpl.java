package com.kosa.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component // giftDAO bean 积己
public class GiftDAOImpl implements GiftDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate; // DML 疙飞贸府

	@Override
	public List GiftAll() {
		String sql = "SELECT * FROM GIFT";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void insertGift(GiftDTO dto) {
		String sql = "INSERT INTO GIFT(GNO, GNAME, G_START, G_END) VALUES(?,?,?,?)";
		Object[] arr = { dto.getGno(), dto.getGname(), dto.getG_start(), dto.getG_end() };

		this.jdbcTemplate.update(sql, arr);

	}

	@Override
	public void deleteGift(int dno) {
		String sql = "DELETE FROM GIFT WHERE GNO = " + dno;
		this.jdbcTemplate.update(sql);

	}

}
