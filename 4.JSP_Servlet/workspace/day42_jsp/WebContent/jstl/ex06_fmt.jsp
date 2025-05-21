<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="fmt"  uri="http://java.sun.com/jstl/fmt_rt" %>   
<%@taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt" %>

<%-- <fmt:setLocale value="en" /> --%>
<fmt:setLocale value="ko_KR"/>
<%-- <fmt:setLocale value="jp"/> --%>
<fmt:requestEncoding value="UTF-8" />

						<!-- .properties 를 뺀 파일명만 기재 -->
<fmt:bundle basename="bundle.testBundle">  <!-- 경로.파일명 -->

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title> ex06_fmt.jsp JSTL fmt - bundle, message </title>
</head>
<body>
	<fmt:message  key="name" /> <br>
	<fmt:message  key="say" /> <br>
	<fmt:message  key="message" /> <br>
	<c:out value="${ say2 }" />
</body>
</html>

</fmt:bundle>