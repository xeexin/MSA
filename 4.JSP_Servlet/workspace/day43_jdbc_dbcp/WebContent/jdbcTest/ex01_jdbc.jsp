<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_jdbc.jsp JDBC Test</title>
</head>
<body>
	<%
 	Connection conn = null;
	try{
		//1,2 드라이버 로드 및 오픈
		Class.forName("oracle.jdbc.OracleDriver");
		out.print("Driver Load Success <br/>");
		
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","heejin","oracle");
		out.print("Connection Success <br/>");
	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
	 //conn.clone();
	}
%>
</body>
</html>