<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First JSP</title>
</head>
<body>
  <form action="welcome.jsp" method="post">
  <table width="40%" border="1" align="center">
     <tr><td colspan="1">用户名</td>
         <td colspan="2"><input type="text" name="name"></td>
     </tr>
     <tr><td colspan="1">密码</td>
         <td colspan="2"><input type="password" name="pwd"></td>
     </tr>
     <tr><td colspan="1">身份</td>
         <td colspan="2"><select name="loginSelect">
             <option selected>请选择</option></select>
         </td>
     </tr> 
     <tr>
         <th colspan="3"><input type="submit" value="LOGIN"></th>
        
     </tr>
    </table>
</body>
</html>