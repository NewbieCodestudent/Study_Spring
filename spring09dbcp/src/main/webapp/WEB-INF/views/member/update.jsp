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
<form action="updateOK" method="get">
	<input type="text" name="num" value="${param.num}">
	<input type="text" name="id" value="${vo2.id}">
	<input type="text" name="pw" value="${vo2.pw}">
	<input type="text" name="name" value="${vo2.name}">
	<input type="text" name="tel" value="${vo2.tel}">
	<input type="submit" value="수정">
</form>

</body>
</html>