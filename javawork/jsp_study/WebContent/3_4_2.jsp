<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include 指令实例</title>
</head>
<body>
	<center>
		现在的日期和时间是: <%=new Date() %>
		<hr>
		<%@ include file="3_4_1.jsp" %>
	</center>
</body>
</html>