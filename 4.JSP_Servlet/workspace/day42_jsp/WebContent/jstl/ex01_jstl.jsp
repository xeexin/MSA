<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01_jstl.jsp</title>
</head>
<body>
	<h3>JSTL core 라이브러리 사용 예제</h3>
	<c:set var="str" value="Hello JSTL!!" />
	<br />
	<h3>
		&lt;c:set&gt; 사용 후:
		<c:out value="${str}" />
	</h3>
	<hr>
	<%
	String msg = "hello jstl~~~";
	out.print(msg + "<br />");
	%>

	표현식을 이욯한 출력 :
	<%=msg%>
	<p>

		JSTL 이용하면
		<c:set var="msg2">hello jstl!!!</c:set>
		message =
		<c:out value="${msg2}" />
	<hr>


	<%
	String name2 = "heejin";
	pageContext.setAttribute("id", "xeexin");
	session.setAttribute("pwd", "oracle");
	application.setAttribute("team", "우리팀");
	request.setAttribute("age", 27);
	%><br> name2=${name2 }
	<br /> name2=
	<c:out value="${name2 }" default="무명씨야~~" />
	<br> id=${id }
	<br> pwd=${pwd }
	<br> team=${team }
	<br> 나이=${age }
	<br>
	<hr>

	<!-- if 조건에서 else 구문은 없음 -->
	<c:if test="${5 <10 }">
		<h3>5는 10보다 작다.</h3>
	</c:if>
	<c:if test="${5 >= 10 }">
		<h3>5는 10보다 작지 않다.</h3>
	</c:if>

	<hr>
	<c:if test="${6+3 == 9 }">
		<h3>6+3 =9</h3>
	</c:if>
	<c:if test="${6+3 != 9 }">
		<h3>6+3 !=9</h3>
	</c:if>


	<!-- java : switch -> case : choose -->
	<c:choose>
		<c:when test="${5+10 == 50 }">
			<h3>5+10 == 50</h3>
		</c:when>
		<c:when test="${50+10 == 50 }">
			<h3>50+10 == 50</h3>
		</c:when>
		<c:when test="${10 +10 != 50 }">
			<h3>10 +10 != 50</h3>
		</c:when>
		<c:otherwise>
			<h3>답이 없네요.</h3>
		</c:otherwise>
	</c:choose>

</body>
</html>
