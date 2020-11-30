<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:red;">Enter the details for Admin Registration</h1>
   <form action="AdminRegistrationServlet" method="post" >
      <label for="adminname"><b>Full Name : </b></label><br>
      <input type="text" placeholder="Full Name" name="adminname" required>
      <br><br>
      <label for="mail"><b>Email (Used as AdminId for login) : 	</b></label><br>
      <input type="email" placeholder="Enter Email" name="mail" required>
      <br><br>
      <label for="psw"><b>Password : 	</b></label><br>
      <input type="password" placeholder="Enter Password" name="psw" required><br><br>
      <button type="submit">Register</button>
      <br><br>
</body>
</html>