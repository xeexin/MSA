<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Write From Page</h1>
	<h3>회사 지점 위치 추가 글쓰기</h3>
	<form action="write.bo" method="post">
		지점 번호 : <input type="text" name="deptno" placeholder="지점 번호">
		<br> 영업소명: <input type="text" name="dname" placeholder="지역명">
		<br> 위치 :<input type="text" name="loc" placeholder="위치">
		<p>
		<br>
		
		<input type="submit" value="저장하기"> &nbsp;&nbsp;&nbsp;
		<input type="reset" value="취소하기"> &nbsp;&nbsp;&nbsp;
		<input type="button" value="List Page" onclick="location.href='list.bo '">
		
	</form>
</body>
</html>