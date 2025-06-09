package com.example.jdbc.repository;

import java.util.List;

import com.example.jdbc.domain.Emp;

public interface EmpRepository {

	// 전체 조회
	List<Emp> findAll();

	// 사원번호로 조회
	Emp findOne(Long empno);

	// 사원 저장
	// insert or update
	Emp save(Emp emp);

	// 사원 번호로 삭제
	void delete(Long empno);

	// 여러 사원 정보를 일괄 추가 (batch insert)
	int[] batchInsert(List<Object[]> params);

}
