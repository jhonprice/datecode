<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>根据随机产生的数据的不同，显示不同的问候</h3>
	
	<%if(Math.random()<0.5){ %>
		Fang <b>Yang</b> Pi!!!
	<%}else{ %>
		have a Fang Yang pi DAY!!!
	<%} %>
</body>
</html>