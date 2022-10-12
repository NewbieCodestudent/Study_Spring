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
<h1>selectOne</h1>
<ul>
	<li>${param.num}</li>
	<li>${vo.id}</li>
	<li>${vo.pw}</li>
	<li>${vo.name}</li>
	<li>${vo.tel}</li>
</ul>
<a href="update.do?num=${param.num}">수정</a>
<a href="delete.do?num=${param.num}">삭제</a>
</body>
</html>