<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

  <h1>Registration Form</h1>
<form action="regCustomer" method="post" >
   Name:<input type ="text" name="tbName" id="tbName"/>
  <br>
    
 Email:<input type ="email" name="tbEmail" id="tbEmail" />
 <br>
 
  Mobile:<input type ="text" name="tbMobile" id="tbMobile" />
 <br>
 
  Password:<input type ="password" name="tbPswd" id="tbPswd" />
   <br>
   States:<select name="ddlStates" > 
          <option value="AndhraPradesh">AP</option>
          <option value="Karnataka">kA</option>
          <option value="Tamilnadu">TN</option>
          <option value="Kerala">KL</option>
          </select>
          <br>
  <input type="submit" value="REGISTER" />
   

</form>

</body>
</html>