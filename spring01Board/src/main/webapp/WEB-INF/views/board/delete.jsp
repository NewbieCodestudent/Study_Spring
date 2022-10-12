<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>delete</title>
	<style>
		ul li {
			display:inline-block;
		}
	</style>
</head>
<body>
<h1>delete</h1>

<ul>
	<li>${param.num}를 정말 삭제하시겠습니까?</li>
</ul>
<ul>
	<li><a href="deleteOK?num=${param.num}">삭제</a></li>
	<li><a href="selectOne?num=${param.num}">취소</a></li>
</ul>

</body>
</html>
