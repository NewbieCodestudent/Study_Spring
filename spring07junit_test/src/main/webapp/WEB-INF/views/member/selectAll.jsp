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
<h1>selectAll.jsp</h1>
<ul>
	<form action="searchList.do" meghod="get">
	<li>
		<select name="searchKey" >
			<optoin></optoin>
			<optoin></optoin>
		</select>
	</li>
	<li><input type="submit" value="검색"></li>
	</form>
</ul>
<ol>
<c:forEach var="vo" items="${vos}">
<li>
	<ul>
		<li><a href="selectOne.do?num=${vo.num}">${vo.num}</a></li>
		<li>${vo.id}</li>
		<li>${vo.pw}</li>
		<li>${vo.name}</li>
		<li>${vo.tel}</li>
	</ul>
</li>	
</c:forEach>
</ol>
</body>
</html>