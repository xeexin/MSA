<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex02_core.jsp  JSTL core Library</title>
<style type="text/css">
	.red { font-size: 25px;   color: red; }
</style>
</head><body>
<!-- 스크립트릿과 JSTL 비교 -->
<p>1번 JSTL </p>
<c:forEach var="i"  begin="1"  end="10"  step="2">
	<b>${ i }</b> &nbsp;&nbsp;&nbsp;&nbsp;
</c:forEach><hr>
<%
	for(int j=0; j < 10; j++ ) {
		if( j % 2 == 1 ) {  
			//out.print(j + "<br>");
%>
		<b><%= j %></b>&nbsp;&nbsp;&nbsp;&nbsp;
<%
		} // if end
	} // for end
%>
<h2> 1~ 100 까지의 합은? </h2>
<c:set var="sum"  value="0" />      <!-- int sum = 0; -->
<c:forEach var="i"  begin="1" end="100">
	<%-- <c:set var="sum"  value="${ sum + i }" /> --%>
	<c:set var="sum"  >${ sum+i }</c:set>
</c:forEach>
<%-- <font color="red" size="5">합은 : ${ sum }</font><hr> --%>
<span class="red">합은 : ${ sum }</span><hr>
<h2>구구단 출력</h2>
<c:forEach var="i"  begin="2" end="9">
		<c:forEach var="j" begin="1" end="9">
			   ${ i } * ${ j } = ${ i*j } <br>
		</c:forEach>
</c:forEach> <hr>
<%
	String[] sports = {"축구", "농구", "골프", "수영", "볼링", "스카이다이빙" };
	HashMap map = new HashMap();
	map.put("name", "doyeon");
	map.put("age", 13);
	map.put("tel", "010-9872-0202");
	map.put("date", new java.util.Date());
%>
<h1>스포츠 배열 2번째 값부터 3개만 출력</h1>
<c:set value="<%= sports %>"   var="sportsArray" />
<%-- <c:set value="${ sports }"   var="sportsArray" /> --%>
<c:forEach var="j"  items="${ sportsArray }">
		${ j }&nbsp;&nbsp;&nbsp;&nbsp;
</c:forEach><hr>

<c:forEach var="i"  items="${ sportsArray }"  
							begin="1" end="3" step="1"  varStatus="status">
							
		i값 : ${ i }<br />
		루프 실행 현재 인덱스 값 : ${ status.index }<br />
		루프 실행 횟수 : ${ status.count }<br />
		begin 값 : ${ status.begin }<br />
		end 값 : ${ status.end }<br />
		step 값 : ${ status.step }<br /><br />
</c:forEach><hr>
<p>Map Member  Info output </p>
<c:set value="<%= map %>"    var="memberMap" />
<c:forEach var="i"  items="${ memberMap }">
		${ i.key } : ${ i.value } <br>
</c:forEach> <hr>
<p>2. 스크립트릿 </p>
<%
	String a = "a, b, c, d, e, f, g, h, i, j, k";
	String[] alphabet = a.split(",");
	
	for(int i=0; i < alphabet.length; i++) {
%>
	<b><%= alphabet[i] %></b>
<%} // for end %><hr>

<p>3. JSTL </p>
<c:set  var="data"  value="을지문덕, 김유신, 강감찬, 세종대왕, 이순신, 광개토대왕" />

<c:forTokens var="varData" items="${ data }" delims=",">
	<b>${ varData }</b>
</c:forTokens>
</body>
</html>








