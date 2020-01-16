<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판목록</title>
</head>
<body>
<c:if test="${sessionScope.login == null }">
	<a href="users/loginform">로그인</a>
</c:if>

<c:if test="${sessionScope.login != null }"> 
	
	<table border="1">
	<tr>
	<td>ID</td>
	<td>USER_ID</td>
	<td>USER_NAME</td>
	<td>TITLE</td>
	<td>CONTENT</td>
	</tr>
		<c:forEach var="board" items="${list}"> 
	<tr>
			<td><div>${board.id}</div></td>
			<td><div>${board.userId}</div></td>
			<td><div>${board.userName}</div></td>
			<td><div>${board.title}</div></td>
			<td><div>${board.content}</div></td>
	</tr>		
		</c:forEach>
		</table> 
	<a href="users/logout">로그아웃</a>
</c:if>
</body>
</html>