<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter your Payment Details</title>


</head>
<body>      
          <form action="PaymentService" method="post">
            <h3>Payment</h3>
                  
            <label for="cname">Name on Card</label><br>
            <input type="text" id="cname" name="cardname" placeholder="John More Doe">
            <br>
            <label for="ccnum">Credit card number</label>
            <input type="text" id="ccnum" name="cardnumber" placeholder="1111-2222-3333-4444">
            
            <label for="expmonth">Exp Month</label>
            <input type="text" id="expmonth" name="expmonth" placeholder="September">
        
                <label for="expyear">Exp Year</label>
                <input type="text" id="expyear" name="expyear" placeholder="2018">
     
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="352">  
                <input type="hidden" name="uname" value="<%=request.getParameter("uname")%>" />
                <input type="hidden" name="sFullName" value="<%=request.getParameter("sFullName")%>" />
                <input type="hidden" name="iPhone" value="<%=request.getParameter("iPhone")%>" />
       <input type="hidden" name="ticketp" value="<%=request.getParameter("ticketp")%>" />
      <input type="hidden" name="source" value="<%=request.getParameter("source")%>" />
      <input type="hidden" name="dest" value="<%=request.getParameter("dest")%>" />
      <input type="hidden" name="date" value="<%=request.getParameter("date")%>" />
      <input type="hidden" name="name" value="<%=request.getParameter("name")%>" />
      <input type="hidden" name="time" value="<%=request.getParameter("time")%>" />
      <input type="hidden" name="id" value="<%=request.getParameter("id")%>" />    
        <input type="submit" value="Continue to Payment ">
      </form>
   
</body>
</html>