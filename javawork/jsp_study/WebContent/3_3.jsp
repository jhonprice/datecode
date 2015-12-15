<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>page指令import属性实例</title>
</head>
<body>
	<% Date date=new Date(); %>
	<h1>page 指令的import属性实例演示</h1>
	<p>现在时间是：<%=date %></p>
</body>
</html>