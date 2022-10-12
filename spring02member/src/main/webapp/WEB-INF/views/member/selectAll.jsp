<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 ul li {
 	display:inline-block;
 }
</style>
</head>
<body>
<a href="home.do">home</a>
<a href="insert.do">insert</a>
<h1>selectAll</h1>
<ol>
	<c:forEach var="vo" items="${vos}">
	<li>
		<ul>
			<a href="selectOne.do?num=${vo.num}">
			<li>${vo.num}</li>
			<li>${vo.id}</li>
			<li>${vo.pw}</li>
			<li>${vo.name}</li>
			<li>${vo.tel}</li>
			</a>
		</ul>
	</li>
	</c:forEach>
</ol>
</body>
</html>