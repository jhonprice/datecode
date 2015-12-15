<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 import="java.util.Date"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		now time: <%=new Date() %>
		<hr>
		<%//<jsp:include page="3.1.jsp" />%>
		<%@ include file="3.1.jsp" %>
	</center>
</body>
</html>