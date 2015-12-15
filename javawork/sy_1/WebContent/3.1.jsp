<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String str1=request.getParameter("rdName");
		String str2=request.getParameter("rdPS");
		out.print("name:"+str1+"<br/>");
		out.print("password:"+str2+"<br/>");
		out.print("sex:");
		String str3=request.getParameter("rdM");
		if(str3==null)
			out.print("Female<br/>");
		else
			out.print("Male<br/>");
	%>
	
</body>
</html>