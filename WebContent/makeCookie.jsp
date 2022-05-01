<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<% 
	//Cookie cookie = new Cookie("name", "홍길동");
	Cookie cookie = new Cookie("name" ,
			URLEncoder.encode("홍길동", "utf-8"));
	//쿠키의 값을 인코딩해서 저장
	//쿠키 생성시 파라미터가 두개 필요
	//쿠키의이름, 쿠키의 값
	
	//초단위로 쿠키를 얼마나 오래 유지할지 설정
	cookie.setMaxAge(3600);
	
	//response 에 쿠키를 추가해야 사용 가능
	response.addCookie(cookie);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	쿠키 이름 : <%=cookie.getName() %>
    쿠키 값 : <%=URLDecoder.decode(cookie.getValue(),"utf-8")%>
</body>
</html>