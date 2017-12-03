<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/shprj/user/regist" commandName="user" method="post">
		昵称：<form:input path="loginName"/><form:errors path="loginName" /><br>
		密码：<form:input path="password"/><form:errors path="password" /><br>
		邮箱：<form:input path="email"/><form:errors path="email" /><br>
		生日：<form:input path="birthday"/><form:errors path="birthday" /><br>
		注册时间：<form:input path="registTime"/><form:errors path="registTime" /><br>
		工资：<form:input path="salary"/><form:errors path="salary" /><br>
		<input type="submit" value="注册" />
	</form:form>
</body>
</html>