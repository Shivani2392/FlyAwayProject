<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <script>
   
   function signUpFunction() {
	   
	
 	     var url = 'AdminRegistrationPage.jsp';
	     	    
 	     window.location.href=url;

	     
	 }
   	
   </script>
  <form action="AdminLogin" method="post">
      <label for="auname"><b>AdminUName : </b></label><br>
      <input type="text" placeholder="Enter Registered Email" name="auname">
      <br><br>
      <label for="psw"><b>Password : 	</b></label><br>
      <input type="password" placeholder="Enter Password" name="psw">
      <br><br><br>
      <button type="submit">Login</button>
      
      </form>
       <br>
   
   <button onclick="signUpFunction()">SignUp</button> 
</body>
</html>