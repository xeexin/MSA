package com.example.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jdbc.domain.Emp;

@Repository // 데이터 처리
@Transactional(readOnly = true) // 읽기 전용 트랜잭션 적용
public class EmpRepositoryImpl implements EmpRepository {

	private final EmpRowMapper empRowMapper_1;

	@Autowired
	private JdbcTemplate jdbcTemplate; // DML 명령처리

	@Autowired
	private RowMapper<Emp> empRowMapper;

	EmpRepositoryImpl(EmpRowMapper empRowMapper_1) {
		this.empRowMapper_1 = empRowMapper_1;
	} // Emp 객체로 결과를 매핑한 RowMapper Bean 주입

	@Override
	public List<Emp> findAll() {
		String sql = "SELECT * FROM EMP";
		List<Emp> emps = jdbcTemplate.query(sql, empRowMapper); // RowMapper로 결과 매핑

		return emps;
	}

	@Override
	public Emp findOne(Long empno) {
		try {
			String sql = "SELECT * FROM EMP WHERE EMPNO = ?";

			return jdbcTemplate.queryForObject(sql, empRowMapper, empno);
		} catch (Exception e) {
			return null; // Optional.empty()
		}
	}

	@Override
	@Transactional(readOnly = false) // 쓰기 작업 readOnly 해제 필요함
	public Emp save(Emp emp) {
		String sql = "INSERT INTO EMP(EMPNO,ENAME,SAL) VALUES(?,?,?)";

		jdbcTemplate.update(sql, emp.getEmpno(), emp.getEname(), emp.getSal());
		return emp;

	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long empno) {
		String sql = "DELETE FROM EMP WHERE EMPNO = ?";

		jdbcTemplate.update(sql, empno);

	}

	@Override
	@Transactional(readOnly = false)
	public int[] batchInsert(List<Object[]> params) {
		String sql = "INSERT INTO EMP(EMPNO,ENAME,SAL) VALUES(?,?,?)";

		return this.jdbcTemplate.batchUpdate(sql, params);
	}

//  public int update(String query) : 레코드 insert, update, delete 처리
//  public int update(String query, Object...args) : PreparedStatement를 이용해서 주어진 파라미터로 레코드 
//  입력, 수정, 삭제
//  
//  public void execute(String sql) : public T execute(String sql, 
//public T execute(String sql, PreparedStatementCallback action) :

}
