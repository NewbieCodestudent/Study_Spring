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
<h1>delete.jsp</h1>
<h2>${param.num}번 삭제</h2>
<h3>정말 삭제하시겠습니까?</h3>
<ul>
	<li><a href="deleteOK.do?num=${param.num}">삭 제</a></li>
	<li><a href="selectOne.do?num=${param.num}">취 소</a></li>
</ul>

</body>
</html>