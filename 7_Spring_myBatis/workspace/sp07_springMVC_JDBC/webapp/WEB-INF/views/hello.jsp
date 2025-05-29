<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello.jsp</title>
</head>
<body>
	<h2>Hello Page</h2>
	<h3>인사합니다 : ${greeting }</h3>
	<button onclick="javascript:window.location.href='list.bo'">목록보기</button>
	&nbsp;&nbsp;
	<input type="button" value="지점저장"
		onclick="javascript:location.replace('writeForm.bo')">
</body>
</html>