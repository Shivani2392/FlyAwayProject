<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.flightbooking.entities.UserRegistrationPojo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
<h3>Confirm Personal information</h3>
<%
UserRegistrationPojo user = (UserRegistrationPojo)request.getAttribute("userPojo");
out.println("Name : ");
out.println(user.getSFullName());%>
<br>
<%
out.println("Email : ");
out.println(user.getEmail());
%>
<br>
<%
out.println("Phone No : ");
out.println(user.getsPhoneNo());
 %>

<h3>Confirm Flight Information</h3>
<%
out.println("From : ");
out.println(request.getParameter("source"));
%>
<br>
<%
out.println("To : ");
out.println(request.getParameter("dest"));
%>
<br>
<%
out.println("Flight Name : ");
out.println(request.getParameter("name"));
%>
<br>
<%
out.println("Total Ticket price (inr) : ");
out.println(request.getParameter("price"));
%>
<br>
<%
out.println("Flight Id : "); 
out.println(request.getParameter("id"));
%>
<br>
<%
out.println("Journey Date : ");
out.println(request.getParameter("date"));
%>
<br>
<%
out.println("Flight time : ");
out.println(request.getParameter("time"));
%>
<br>
<%
out.println("No of Adult selected : ");
out.println((String)request.getSession().getAttribute("adult1"));
%>
<br>
<%
out.println("No of Child selected : ");
out.println((String)request.getSession().getAttribute("child1"));
%>

<h2>Proceed to Payment</h2>
<form action="Payement.jsp" >

	  <input type="submit" value="Payment" name="Payment"></input>
	 
</form>

</body>
</html>