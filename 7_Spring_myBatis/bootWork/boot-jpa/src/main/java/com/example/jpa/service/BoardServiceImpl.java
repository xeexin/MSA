package com.example.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.jpa.model.Board;
import com.example.jpa.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardRepository repository;

	@Override
	public Page<Board> findAll(Integer currentPage) {
		Sort sort = Sort.by(Sort.Order.desc("reply"), Sort.Order.asc("replystep"));
		PageRequest pageRequest = PageRequest.of(currentPage, 5, sort);

		return repository.findAll(pageRequest);
	}

}
