<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Gift Form</title>
</head>
<body>
	<h3>선물 추가</h3>
	<form  action="insertGift.bo" method="post">
		선물 번호 : <input type="text" name="gno" placeholder="선물 번호 입력">
		<br>선물명 : <input type="text" name="gname" placeholder="선물명">
		<br>최저가 : <input type="text" name="g_start" placeholder="최고가">
		<br>최고가 : <input type="text" name="g_end" placeholder="최저가">
		<br>
		<p>

			<input type="submit" value="저장하기"> &nbsp;&nbsp; <input
				type="reset" value="취소하기">&nbsp;&nbsp; 
				<input type="button" value="홈으로" onclick="location.replace('giftAll.bo')">
	</form>

</body>
</html>