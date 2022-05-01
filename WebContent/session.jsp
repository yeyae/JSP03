<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	Date time = new Date(); // 이 date객체로 session의 시간을 표현
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	// 우리가 사용하고 싶은 날짜 형식으로 SimpleDateFormat 객체를 생성
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보</title>
</head>
<body>
	세션 id : <%=session.getId() %><br> <%--세션의 ID 구하기 --%>
	<% 
		time.setTime(session.getCreationTime());
		// time 객체의 시간값을 session의 생성 시간으로 설정
	%>
	세션 생성 시간 : <%=formatter.format(time) %><br>
	<%-- 1970년 1월 1일 이후 흘러간 시간 --%>
	<% 
		time.setTime(session.getLastAccessedTime());
		// time 객체의 시간값을 session의 최근 접근 시간으로 설정
	%>
	최근 접근 시간 : <%=formatter.format(time) %>
</body>
</html>