<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>一个简单的JSP程序实例</title>
</head>
<body>
	<%! int sum=0,x=1; %>
	<%
		while(x<=10)
		{
			sum+=x; ++x;
		}
	%>
	<h3>改程序的功能是计算1到10的累加和,并显示运行时间</h3>
	
	<p>1 加 10 的结果是: <%= sum %> </p>
	<p> 程序的运行时间是: <%= new Date() %> </p>
	
</body>
</html>