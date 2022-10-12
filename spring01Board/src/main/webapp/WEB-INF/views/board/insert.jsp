<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>update</title>
	<style>
		ul li {
			display:inline-block;
		}
	</style>
</head>
<body>
<h1>update</h1>

<form action="insertOK" method="post">
	<input type="text" value="${param.num}" name="num">
	<input type="text" value="${vo.title}" name="title">
	<input type="text" value="${vo.content}" name="content">
	<input type="text" value="${vo.writer}" name="writer">
	<input type="submit" value="작성">
	<a href="selectAll"><input type="button" value="취소"></a>
</form>

</body>
</html>
