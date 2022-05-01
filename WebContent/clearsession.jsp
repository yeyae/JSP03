<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	session.invalidate();
	// 세션을 만료시키기 (종료)
	// 세션을 만료시키면 더이상 세션의 속성에 접근할수가 없게 된다.
%>
<html>
<head>
<meta charset="UTF-8">
<title>세션 종료</title>
</head>
<body>
	세션을 종료하였습니다.
</body>
</html>