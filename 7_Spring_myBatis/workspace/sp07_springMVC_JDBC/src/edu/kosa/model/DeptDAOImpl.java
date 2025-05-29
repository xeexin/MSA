package edu.kosa.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component // deptDAO bean 생성!
public class DeptDAOImpl implements DeptDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate; // DML 명령처리에 대한 모든 클래스 갖고 있음 (Insert, Update, Delete, Select)

	@Override
	public List listDept() {
		// SelectAll
		String sql = "SELECT * FROM DEPT ORDER BY DEPTNO DESC";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void insertDept(DeptDTO dto) {
		// Insert
		String sql = "INSERT INTO DEPT(DEPTNO, DNAME, LOC) VALUES(?,?,?)";

		Object[] arr = { dto.getDeptno(), dto.getDname(), dto.getLoc() };

		this.jdbcTemplate.update(sql, arr);
	}

	@Override
	public void deleteDept(int deptno) {
		// Delete

		String sql = "DELETE FROM DEPT WHERE DEPTNO = " + deptno;

		this.jdbcTemplate.update(sql);

	}

}
