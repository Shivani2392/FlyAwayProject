<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>
   <h1 style="color:red;">Enter the details for Registration and Ticket booking</h1>
   <form action="SignUpServlet" method="post" >
      <label for="uname"><b>Full Name : </b></label><br>
      <input type="text" placeholder="Full Name" name="uname" required>
      <br><br>
      <label for="mail"><b>Email (Used as UserId for login) : 	</b></label><br>
      <input type="email" placeholder="Enter Email" name="mail" required>
      <br><br>
      <label for="psw"><b>Password : 	</b></label><br>
      <input type="password" placeholder="Enter Password" name="psw" required>
      <br><br>
      <label for="Add"><b>Phone No : 	</b></label><br>
      <input type="text" placeholder="Enter Mobile No" name="phone">
      
      <input type="hidden" name="ticketp" value="<%=request.getParameter("ticketp")%>" />
      <input type="hidden" name="source" value="<%=request.getParameter("source")%>" />
      <input type="hidden" name="dest" value="<%=request.getParameter("dest")%>" />
      <input type="hidden" name="date" value="<%=request.getParameter("date")%>" />
      <input type="hidden" name="name" value="<%=request.getParameter("name")%>" />
      <input type="hidden" name="time" value="<%=request.getParameter("time")%>" />
      <input type="hidden" name="id" value="<%=request.getParameter("id")%>" />
      
      
      <br><br><br>
      <button type="submit">Register</button>
   </form>
   
   
</body>
</html>