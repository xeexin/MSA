package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
