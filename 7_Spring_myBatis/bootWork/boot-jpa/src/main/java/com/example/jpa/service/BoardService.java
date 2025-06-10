package com.example.jpa.service;

import org.springframework.data.domain.Page;

import com.example.jpa.model.Board;

public interface BoardService {
	
	//게시판 리스트 보기
	public Page<Board> findAll(Integer currentPage);

}
