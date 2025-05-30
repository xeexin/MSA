package com.model;

import java.sql.SQLException;
import java.util.List;

public interface MemberDAO {
	// 회원 상세 조회
	MemberVO selectMemberById(String id) throws Exception;
	
	List memberById(String id) throws Exception;
	
	
	//회원 유무를 판단하는 조회
	boolean memberCheck(String id, String pwd) throws SQLException;
	
	boolean memberInsert(String id, String name,  String pwd, String email, int age) throws SQLException;
}
