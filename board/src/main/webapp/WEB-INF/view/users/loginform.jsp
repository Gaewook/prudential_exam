<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
로그인
<form name="login" method="post" action="/users/login">
ID : <input name="userId" type="text"><br/>
PW : <input name="password" type="password"><br/>
<input type="submit" value="확인">   
</form>

</body>
</html>