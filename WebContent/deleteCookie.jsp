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
	/*
		쿠키 지우기
		쿠키는 브라우저가 관리하기때문에 서버에서 직접 삭제할수는 없습니다.
		삭제가 아니라 같은 이름을 가진 쿠키를 생성해서
		그 쿠키의 maxAge를 0으로 설정한다음에 추가
		maxAge => 쿠키의 유효시간
	*/
	Cookie[] cookies = request.getCookies();
	if(cookies != null && cookies.length > 0){
		for(int i=0; i<cookies.length; i++){
			if(cookies[i].getName().equals("name")) {
				// 우리가 삭제할 쿠키의 이름을 검사합니다.
				// 그 쿠키의 유효시간(만료시간)을 0으로 만들어줌
				Cookie newCookie = new Cookie("name" , "");
				newCookie.setMaxAge(0);
				response.addCookie(newCookie);
			}
		}
	}

%>
</body>
</html>