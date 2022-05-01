<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int number = 10; %>
	<%@ include file="includee.jspf" %>
	<%@ include file="variable.jspf" %>
	현재 시간 : <%=today %>
</body>
</html>
<%-- 
	<jsp:include> : 실행 흐름에 실행 결과를 추가하는 방식 
	실행결과가 여러개
	<%@ include> : 코드 레벨 수준으로 코드내용을 현재 위치에 삽입하고 컴파일
	실행결과가 합쳐져서 하나가 된다.
--%>