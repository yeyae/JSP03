<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		아이디 : <input type="text" name="userid">
		비밀번호 : <input type="password" name="userpw">
		<input type="submit" value="로그인">
	</form>
	<%-- login 처리하는 서블릿, logout 처리하는 서블릿, main 처리하는 서블릿 --%>
</body>
</html>