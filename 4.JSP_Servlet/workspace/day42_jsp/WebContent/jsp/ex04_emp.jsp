<%@page import="edu.kosa.ex04.Emp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_jsp.jsp</title>
</head>
<body>
	<%!
    public String message() {
    return "MSA th2";
    }
%>

	<%
    Emp e = new Emp();
    out.print(e.toString() + "<p><hr>");

    e.setEmpno(1234);
    e.setName("yang");
    e.setPay(3000);

    out.print(e);
    out.print(e.getName());
    int num = 888;
%>


</body>
</html>