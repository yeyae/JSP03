<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션에 저장된 member</title>
</head>
<body>
<%
	String name = (String)session.getAttribute("name");
	String id = (String)session.getAttribute("memberId");
%>
회원 ID : <%=id %><br>
회원 명 : <%=name %><br>
<a href="clearsession.jsp">다음 페이지로</a>
</body>
</html>