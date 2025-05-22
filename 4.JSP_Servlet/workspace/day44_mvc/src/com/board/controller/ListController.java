package com.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/list")
public class ListController extends HttpServlet implements CommandProcess {
	private static final long serialVersionUID = 1L;

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setAttribute("list", "List Page 입니다.");
		req.setAttribute("title", "참을 수 없는 존재의 가벼움");
		req.setAttribute("contents", "Contents 입니다.");

		return "/board/list.jsp";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher(process(request, response));
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
