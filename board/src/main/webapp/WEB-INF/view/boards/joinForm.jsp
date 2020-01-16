<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판등록</title>
</head>
<body>
게시판등록 폼
<form name="board" method="post" action="/boards/actionJoin">
USER_ID  : <input name="userId" type="text"/><br/>
TITLE    : <input name="title" type="text"/><br/>
CONTENT  : <input name="content" type="text"><br/>
<input type="submit" value="확인">
</form>
</body>
</html>