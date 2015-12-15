<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="java.sql.*"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection c = null; 
    	try { 
       		Class.forName("org.postgresql.Driver"); 
       		c = DriverManager 
          		.getConnection("jdbc:postgresql://localhost:5432/book", 
          		"postgres", "dzxxxy"); 
    	} catch (Exception e) 
    	{ 
       		e.printStackTrace(); 
       		out.println("dfsdf"); 
    	} 
    	out.println("Opened database successfully"); 
 	
	%>
	
</body>
</html>