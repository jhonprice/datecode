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
	Integer a1=(Integer)session.getAttribute("ANS");
	request.setCharacterEncoding("UTF-8");
	String s1=request.getParameter("rdname");
	String s2=request.getParameter("rdps");
	String s3=request.getParameter("who");
	String s4="123";
	session.setAttribute("ss1", s1);
	if(s1==null&&s2==null&&s3==null)
		response.setHeader("refresh","1;url=Login.jsp");
	else if(s1.equals("root")&&s2.equals("123")&&s3.equals("ad"))
	{
		out.print("welcome,"+"管理员,"+s1+"<br/>");
		out.print("您是第"+a1+"次访问<br/>");
		out.print("<a href=\"Content.jsp\">如果浏览器5秒没有跳转，请点击这里</a>");
		response.setHeader("refresh","5;url=Content.jsp");
	}
	else if(s1.equals("user")&&s2.equals("123")&&s3.equals("us"))
	{
		out.print("welcome,"+"用户,"+s1);
		out.print("您是第"+a1+"次访问<br/>");
		out.print("<a href=\"Content.jsp\">如果浏览器5秒没有跳转，请点击这里</a>");
		response.setHeader("refresh","5;url=Content.jsp");
	}
	else
	{
		out.print("Sorry,您的用户名或密码不正确。<hr>");
		out.print("<a href=\"Login.jsp\">如果浏览器5秒没有跳转，请点击这里</a>");
		response.setHeader("refresh","5;url=Login.jsp");
	}
%>

</body>
</html>