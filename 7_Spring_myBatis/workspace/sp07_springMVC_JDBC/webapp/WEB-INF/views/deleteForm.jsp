<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Form</title>
</head>
<body>
	<h3>Delete Form</h3>
	<h5>삭제할 지점 번호를 입력하세요</h5>
	<form action="deleteForm.bo" method="post">
		삭제할 지점 번호 : <input type="text" name="deptno" , placeholder="삭제할 지점 번호">
		<p>
			<input type="submit" value="삭제하기"> &nbsp;&nbsp; <input
				type="reset" value="취소하기">&nbsp;&nbsp; <input type="button"
				value="리스트 보기" onclick="location.href='list.bo'">
	</form>

</body>
</html>