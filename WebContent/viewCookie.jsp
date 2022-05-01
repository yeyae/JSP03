<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 	
	// 쿠키를 가져올때는 request에서 가져오기
	Cookie[] cookies = request.getCookies();

	if(cookies != null && cookies.length > 0){
		// 쿠키가 없을때 반복문을 실행하면 예외 발생 방지
		for(int i=0; i<cookies.length; i++){
			// 모든 쿠키들을 화면에 출력하기
%>
		쿠키 이름 : <%=cookies[i].getName() %><br>
		쿠키 값 : <%= URLDecoder.decode(cookies[i].getValue(), "utf-8") %><br>
<%		
		}
	} else {
%>
	쿠키가 존재하지 않습니다.
<%
	}
%>
</body>
</html>