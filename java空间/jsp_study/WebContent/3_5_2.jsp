<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接收参数界面</title>
</head>
<body>
	接收参数，并显示结果页面。<br>
	<%String str=request.getParameter("Name"); %>
	<font color="blue" size="12"><%=str %></font>
</body>
</html>