<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	session.setAttribute("memberId", "member");
	session.setAttribute("name", "홍길동");
	
	session.setMaxInactiveInterval(20);
	// 세션의 유효시간 정하기 (초단위)
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="memberinfo.jsp">다음 페이지 이동</a>
</body>
</html>