<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String current_param="";
		String current_vaul="";
		request.setCharacterEncoding("UTF-8");
		Enumeration params=request.getParameterNames();
		while(params.hasMoreElements())
		{
			current_param=(String)params.nextElement();
			current_vaul=request.getParameter(current_param);
		
	%>
	name:<%=current_param %>
	num: <%=current_vaul %>
	<br>
	<%} %>
</body>
</html>