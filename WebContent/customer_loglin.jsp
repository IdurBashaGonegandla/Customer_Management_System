<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
    <h1>Customer Login Page</h1>
 <form action ="logCustomer" method="post" >
 
   <label for="tbEmail"> Email:</label>
   <input type="email" name="tbEmailLog"  id="tbEmail"  value="<%= request.getParameter("tbEmail") %>" />
   <br/>
   
   <label for="tbPass"> Password:</label>
   <input type="password" name="tbPassLog"  id="tbPswd" value="<%= request.getParameter("tbPswd") %>" />
   <br/>
   
   <input type="submit" value="Login" />
   </form>  

</body>
</html>