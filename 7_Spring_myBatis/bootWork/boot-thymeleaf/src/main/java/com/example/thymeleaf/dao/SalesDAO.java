 package com.example.thymeleaf.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.thymeleaf.vo.SaleVO;

@Repository
public class SalesDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<SaleVO> list() {
		String sql = "SELECT * FROM SALES";

		List<SaleVO> listSale = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(SaleVO.class));

		return listSale;
	}
	
	public void save(SaleVO sale) {
		SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
		insertActor.withTableName("sales").usingColumns("ITEM", "QUANTITY", "AMOUNT");
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		
		insertActor.execute(param);		
	}
	
	public SaleVO get(int id) {
		String sql = "SELECT * FROM SALES WHERE id = ?";
		Object[] args = {id};
		SaleVO vo = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(SaleVO.class));
		return vo;
	}
	
	public void update(SaleVO sale) {
		String sql = "UPDATE SALES SET item=:item, quantity=:quantity, amount=:amount WHERE id=:id";
		BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(sale);
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
		template.update(sql, param);		
	}
	
	public void delete(int id) {
		String sql = "DELETE FROM SALES WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}
}