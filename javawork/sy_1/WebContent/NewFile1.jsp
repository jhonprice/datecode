<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! Integer ans=new Integer(0); %>
<% if(session.isNew())
		{
			Integer number=(Integer)application.getAttribute("Count");
			if(number==null)
			{
				number=new Integer(1);
			}
			else
			{
				number=new Integer(number.intValue()+1);
			}
			application.setAttribute("Count", number);
			ans=(Integer)application.getAttribute("Count");
		}
%>
<%=ans %>
</body>
</html>