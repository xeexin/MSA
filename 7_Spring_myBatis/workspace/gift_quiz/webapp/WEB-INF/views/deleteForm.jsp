<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete Gift</title>
</head>
<body>
<h3>Delete Gift Form</h3>
<form action="deleteGift.bo" method="post">
	삭제할 상품 번호 : <input type="text" name="gno" placeholder="선물 번호">
	
<br>
		<p>

			<input type="submit" value="저장하기"> &nbsp;&nbsp; <input
				type="reset" value="취소하기">&nbsp;&nbsp; 
				<input type="button" value="홈으로" onclick="location.replace('giftAll.bo')">
</form>

</body>
</html>