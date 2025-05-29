package edu.kosa.model;

import java.util.List;

public interface DeptDAO {
	public List listDept(); // SelectAll

	public void insertDept(DeptDTO dto); // Insert

	public void deleteDept(int deptno); // Delete
}
