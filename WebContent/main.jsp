<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<jsp:include page="header.jsp">
		<jsp:param value="hong" name="name"/>
	</jsp:include>
	<hr>
	<h2>여기는 main 영역입니다.</h2>
	<a href="sub.jsp">서브페이지로 이동</a>
	<hr>
	<jsp:include page="footer.jsp"/>
</body>
</html>