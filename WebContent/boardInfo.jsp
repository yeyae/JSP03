<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Board b = (Board)request.getAttribute("board");
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 정보</title>
<style>
table {
	border: 5px solid red;
}
td {
	border: 1px solid black;
}
</style>
</head>
<body>
	<div>
		<table>
			<tr>
				<th>작성자</th>
				<td><%=b.getName() %></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><%=b.getPass() %></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><%=b.getEmail() %></td>
			</tr>
			<tr>
				<th>작성시간</th>
				<td><%=sf.format(b.getCreatedTime()) %></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><%=b.getTitle() %></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><p><%=b.getContent() %></p></td>
			</tr>
		</table>
	</div>
</body>
</html>