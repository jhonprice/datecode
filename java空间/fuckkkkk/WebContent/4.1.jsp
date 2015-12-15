<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.lang.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String str1=request.getParameter("rdName");
		String str2=request.getParameter("phName");
	%>
	<font face="3" size=4 color=green>
		information: <br/>
		name:<%=str1 %><br/>
		telephone:<%=str2 %><br/>
	</font>
</body>
</html>