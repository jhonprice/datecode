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
	Integer ans=new Integer(0);
	if(session.isNew())
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
	session.setAttribute("ANS",ans);
%>
<form action="Welcome.jsp" method="post">
	<table width="50%" border="1" align="center">
		<tr><td>用户名</td><td colspan="2"><input type="text" name="rdname"></td></tr>
		<tr><td>密码</td><td colspan="2"><input type="password" name="rdps"></td></tr>
		<tr><td>身份</td><td colspan="2">
			<select name="who">
				<option value="choose" selected>请选择</option>
				<option value="us">user</option>
				<option value="ad">admin</option>
			</select> 
		</td></tr>
		<tr  align="center"><td colspan="3"><input type="submit" name="login"></td></tr>
	</table>
</form>
</body>
</html>