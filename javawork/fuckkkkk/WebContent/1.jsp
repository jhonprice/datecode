<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  import="java.util.Date" 
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! int sum=0,x=1; %>
	<% while(x<=10)
	{
		sum+=x;
		++x;
	}%>
	<h3>sum 1 to 10</h3>
	<p>sum=<%=sum %> </p>
	<p>date=<%=new Date()%>
</body>
</html>