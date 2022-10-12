<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>selectAll</title>
	<style>
		ul li {
			display:inline-block;
		}
	</style>
</head>
<body>
<a href="home">home</a>
<a href="insert">insert</a>
<h1>selectAll</h1>

<c:forEach var="vo" items="${vos}">
	<ul>
		<a href="selectOne?num=${vo.num}">
		<li>${vo.num}</li>
		<li>${vo.title}</li>
		<li>${vo.content}</li>
		<li>${vo.writer}</li>
		<li>날짜</li>
		</a>
	</ul>
</c:forEach>

</body>
</html>
