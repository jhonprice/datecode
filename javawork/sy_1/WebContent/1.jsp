<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h1>Welcome learn JSP,Now time is:</h1></center>
	<%!int year =0;%>
	<%!int month=0; %>
	<%!int day=0; %>
	<%!int hour=0; %>
	<%!int minute=0; %>
	<%!int second=0; %>
	<%
		Calendar c=Calendar.getInstance();
		year=c.get(Calendar.YEAR);
		month=c.get(Calendar.MONTH)+1;
		day=c.get(Calendar.DAY_OF_MONTH);
		hour=c.get(Calendar.HOUR);
		minute=c.get(Calendar.MINUTE);
		second=c.get(Calendar.SECOND);
	%>
	<center>
			<%
				for(int i=1;i<=3;i++)
					out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+"<br/>");
			%>
	</center>

</body>
</html>