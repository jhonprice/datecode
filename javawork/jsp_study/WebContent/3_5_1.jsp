<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>传参数页面</title>
</head>
<body>
	<h4>该页面传递一个参数QQ,直线下是接收</h4>
	<hr>
	<jsp:include page="3_5_2.jsp">
		<jsp:param name="Name" value="ddddd"/>
	</jsp:include>

</body>
</html>