<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="emp-list">List All Employees</a>

	<br>
	<br>

	<a href="emp-input">Add New Employee</a>

	<br>学生
	<s:form action="student-login" method="post">
		<s:textfield name="loginName" label="loginName"></s:textfield>
		<s:textfield name="password" label="password"></s:textfield>
		<s:submit>提交</s:submit>
	</s:form>
	<br>老师
	<s:form action="teacher-login" method="get">
		<s:textfield name="username" label="username"></s:textfield>
		<s:textfield name="password" label="password"></s:textfield>
		<s:submit>提交</s:submit>
	</s:form>


</body>
</html>