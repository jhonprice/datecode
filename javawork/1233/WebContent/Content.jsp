<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String s1=(String)session.getAttribute("ss1");
	if(s1==null)
		response.sendRedirect("Login.jsp");
	out.print("您好，"+s1+"欢迎光临<br/>");
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)		
			{
				out.print(j+"*"+i+"="+i*j+"&nbsp;&nbsp;&nbsp;&nbsp;");
			}
			out.print("<br/>");
		}
%>
</body>
</html>