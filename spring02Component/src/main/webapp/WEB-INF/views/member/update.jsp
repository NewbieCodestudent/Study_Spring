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
<a href="selectOne.do?num=${param.num}">selectOne</a>
<h1>update.jsp</h1>
<h2>${param.num}번을 수정</h2>
<form action="updateOK.do" method="post">
	<input type="text" name="num" value="${param.num}">
	<input type="text" name="id" value="admin">
	<input type="text" name="pw" value="1234">
	<input type="text" name="name" value="kim">
	<input type="text" name="tel" value="010-7777-7777">
	<input type="submit" value="수정">
</form>

</body>
</html>