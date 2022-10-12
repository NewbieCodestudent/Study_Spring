<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="home.do">home</a>
<a href="selectAll.do">selectAll</a>
<a href="insert.do">insert</a>
<form action="updateOK.do" method="post">
	<input type="text" value="${param.num}">
	<input type="text" value="id">
	<input type="text" value="pw">
	<input type="text" value="name">
	<input type="text" value="tel">
	<input type="submit">
</form>
</body>
</html>