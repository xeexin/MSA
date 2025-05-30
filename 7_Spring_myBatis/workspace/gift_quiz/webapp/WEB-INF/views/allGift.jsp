<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Gift</title>
</head>
<body>
	<h3>Gift List</h3>

	<c:forEach items="${list }" var="list">
		<p>${list.gno }
		${list.gname }
		${list.g_start }
		${list.g_end }</p>
	</c:forEach>
	
	<input type="button" value="선물 추가" onclick="location.replace('insertForm.bo')">
	<input type="button" value="선물 삭제" onclick="location.replace('deleteForm.bo')">

</body>
</html>