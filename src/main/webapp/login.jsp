<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登陆</title>
</head>
<body>
	<form action="login" method="post">
        <font color="red">${loginError }</font><br/>
	        用户名：<input type="text" name="username"/><br/>
	        密   码：<input type="password" name="password"/><br/>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置"/>
    </form>
</body>
</html>