<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String userid = ""; // 쿠키 안에 있는 userid 값을 넣을거에요
	
	Cookie[] cookies = request.getCookies();
	for(Cookie c : cookies){
		// index 안쓰고 전체 탐색 하는 for문
		// ( 배열 원소 : 배열 )
		// cookies[i] ==> c
		if(c.getName().equals("userid")) {
			userid = c.getValue(); // 쿠키 안의 값 가져오기
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=userid %>님 반갑습니다. <br>
<button onclick="location.href='logout'">로그아웃</button>
<%-- Cookie를 가져와서 Cookie 안에 있는 userid값 출력

	xxx 님 반갑습니다.
	로그아웃 처리하는 버튼도 만들어주기
	logoutServlet에서 쿠키를 제거
 --%>
</body>
</html>