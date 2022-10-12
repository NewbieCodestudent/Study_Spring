<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
ul li {
	display: inline-block;
}
</style>
</head>
<body>
	<a href="home">home</a>
	<a href="insert">insert</a>
	<h1>selectAll.jsp</h1>
	<form action="searchList.do" meghod="get">
		<select name="key" id="key">
			<option value="name">이름
				</optoin>
			<option value="tel">전화번호
				</optoin>
		</select> <input type="text" name="word" id="word"> <input
			type="submit" value="검색">
	</form>
	<ol>
		<c:forEach var="vo" items="${vos}">
			<li>
				<ul>
					<li><a href="selectOne?num=${vo.num}">${vo.num}</a></li>
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