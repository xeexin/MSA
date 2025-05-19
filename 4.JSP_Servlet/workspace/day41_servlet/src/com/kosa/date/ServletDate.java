package com.kosa.date;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/kosa/aa")
public class ServletDate extends HttpServlet {

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello Servlet!");

		response.setCharacterEncoding("euc-kr");
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		PrintWriter out = response.getWriter();
		out.write("<html><head><title>서버 측 시간을 얻어서 씁니다. </title></head>");
		out.write("<body><h1>Hello Servlet </h1>");
		out.write("<h2>현재 시간은 ");
		out.write(Integer.toString(hour) + "시 ");
		out.write(Integer.toString(min) + "분 ");
		out.write(Integer.toString(sec) + "초 입니다.");
		out.write("</h2></body></html>");
		out.close();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, resp);
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(req, resp);
		super.doPost(req, resp);
	}

}
