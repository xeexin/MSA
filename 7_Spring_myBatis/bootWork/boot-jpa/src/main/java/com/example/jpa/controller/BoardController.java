package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.jpa.model.Board;
import com.example.jpa.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	@GetMapping("/home")  // Get, http://localhost:8081/board/home
	public String testPage() {
		return "home"; // jsp/home.jsp
	}
	

	// ---------------------------------------------
	// 루트요청(localhost:8081/board/)시 리스트 보기로
	// ---------------------------------------------
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:/board/list/0";
	}

	// ---------------------------------------------
	// 게시판 리스트 보기
	// Get, http://localhost:8081/board/list/1
	// ---------------------------------------------
	@RequestMapping(value = "/list/{curPage}", method = RequestMethod.GET)
	public String findAll(Model model, Pageable pageable, @PathVariable Integer curPage) {
		Page<Board> page = boardService.findAll(curPage);
		model.addAttribute("page", page);
		return "list";
	}

}
