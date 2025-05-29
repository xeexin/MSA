<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List.jsp</title>
</head>
<body>
	<h3>List Page</h3>

	<c:forEach items="${list}" var="list">
		<p>${list.deptno}</p>
		<p>${list.dname}</p>
		<p>${list.loc}</p>
	</c:forEach>

	<input type="button" value="지점저장" onclick="location.replace('writeForm.bo')">
	<input type="button" value="Hello" onclick="location.replace('hello.bo')">
	<input type="button" value="삭제하기" onclick="location.replace('deleteForm.bo')">
</body>
</html>
