<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>output</p>
	<%
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<=i;j++)
			{
				out.print(j+" ");
			}
			out.println("<hr/>");
		}
	%>
	<h3>random</h3>
	<%
		if(Math.random()<0.5)
		{
			out.println("Have a <code>nice</code> day!");
		}
		else
		{
			out.println("Have a <code>lousy</code> day!");
		}
	%>

	<hr/>
</body>
</html>