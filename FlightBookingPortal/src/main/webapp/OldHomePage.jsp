<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Booking SIte</title>
</head>
<body>
<h1>Welcome to Airline Ticket Booking</h1>

    
<form action="HomePageServlet" method="post">


<label for="Source">From</label>
<input type="text" name="From">
<label for="Destination">To</label>
<input type="text" name="To">

<label for="Dateofjourney">Depart</label>
<input type="date" name="TravelDate" id="datepicker">

<label for="Numberofpeopletobetravelled"></label>

<div id="submit">
    <input type="submit" name="Gotoserver" value="Go">
</div>

</form>


</body>
</html>