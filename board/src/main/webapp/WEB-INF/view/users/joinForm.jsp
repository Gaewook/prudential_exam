<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
회원가입 폼
<form name="user" method="post" action="/users/actionJoin">
ID       : <input name="userId" type="text"/>
NAME     : <input name="name" type="text"/>
PASSWORD : <input name="password" type="password">
<input type="submit" value="확인">
</form>
</body>
</html>