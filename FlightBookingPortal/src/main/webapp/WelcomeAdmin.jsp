<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.vertical-menu {
  width: 200px;
}

.menu a {
  background-color: #eee;
  color: black;
  display: block;
  padding: 12px;
  text-decoration: none;
}

.menu a:hover {
  background-color: #ccc;
}

.menu a.active {
  background-color: #4CAF50;
  color: white;
}
</style>
<title>AdminHome</title>
</head>
<body>

<!--  <div class="Menu">
  <a href="#" class="active">Home</a>
  <a href="ResetPassword.jsp">ResetPassword</a>
  <br>
  <a href="MasterSourceDestinationlist.jsp">Available Source and Destination List</a>
  <br>
  <a href="MasterlistofAirlines.jsp">Master List of Airlines</a>
  <br>
  <a href="MasterListofFlights.jsp">Master List of Flights</a>
</div> -->
    
   <form action="AdminActionServlet" method="post">
          <input type = "radio"
                 name = "admin"
                 id = "reset"
                 value="reset" />
          <label>Reset Password</label>
          <br>
          <input type = "radio"
                 name = "admin"
                 id = "master"
                 value="srcdest" />
          <label>Master Source Destination List</label>
          <br>
          <input type = "radio"
                 name = "admin"
                 id = "airline"
                 value="airlines" />
          <label>List of Airlines</label>    
          <br>
          <input type = "radio"
                 name = "admin"
                 id = "flights"
                 value="flights" />	                      	     
          <label>List of Flights</label>
          <br>
          <input type = "radio"
                 name = "admin"
                 id = "Logout"
                 value="Logout" />	                      	     
          <label>Logout</label>
          <br>
          <button type="submit">List</button>    
    </form>
</body>
</html>