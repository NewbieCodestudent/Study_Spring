<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="home">home</a>
<a href="selectAll">selectAll</a>
<h1>selectOne.jsp</h1>
<ul>
	<li>번호 : ${param.num}</li>
	<li>아이디 : ${vo2.id}</li>
	<li>비밀번호 : ${vo2.pw}</li>
	<li>이름 : ${vo2.name}</li>
	<li>전화번호 : ${vo2.tel}</li>
</ul>
<ul>
	<li><a href="update?num=${param.num}">수정</a></li>
	<li><a href="delete?num=${param.num}">삭제</a></li>
</ul>

</body>
</html>