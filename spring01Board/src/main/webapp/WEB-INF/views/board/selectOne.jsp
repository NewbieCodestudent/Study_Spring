<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>selectOne</title>
	<style>
		ul li {
			display:inline-block;
		}
	</style>
</head>
<body>
<h1>selectOne</h1>

<ul>
	<li>${param.num}</li>
	<li>${vo.title}</li>
	<li>${vo.content}</li>
	<li>${vo.writer}</li>
	<li>날짜</li>
</ul>
<ul>
	<li><a href="update?num=${param.num}">수정</a></li>
	<li><a href="delete?num=${param.num}">삭제</a></li>
</ul>

</body>
</html>
