<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex03_loginOK.jsp </title>
</head>
<body>

<%
	/*
		1. 한글처리
		method = "post"
		request.setCharacterEncoding("EUC-KR");

		2. method ="get"
		localhost:8080/day55_jsp/jsp/ex03_loginOK.jsp?userId=kingsmile&pwd=1004&hobby=baseball&hobby=soccer&hobby=basketball
		
		 <Connector  URIEncoding="UTF-8" 
		 connectionTimeout="20000" maxParameterCount="1000" port="8080" protocol="HTTP/1.1" redirectPort="8443" reloadable="true"/>
	*/

	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("userId");
	String pw = request.getParameter("pwd");
	
	//String[] hobbys = request.getParameterValues("hobby");
	Map map = request.getParameterMap();
	String[] hobbys = (String[])map.get("hobby");
	
%>
당신의 id : <%= id %><br />
당신의 password : <%= pw %><br />
당신의 취미는 :
<%
	if( hobbys != null ) {
		for(int i = 0; i < hobbys.length; i++ ) {
%>
	<%= hobbys[i] %> &nbsp;&nbsp;
<%			
		} // for end
	} // if end
%>

</body>
</html>