<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    <%@page import="com.flightbooking.entities.FlightMasterPojo"%>
    <%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MasterListofAirlines</title>
</head>
<body>
<h1>List of Airlines</h1>


   <script>
   
   function HomeFunction() {
	   var url = 'WelcomeAdmin.jsp';
	   window.location.href=url;
   } 
   
   </script>


<table width="10%" border="1">
    <thead>
    <tr>
        <td><h5>AIRLINES</h5></td>
       
    </tr>
    </thead>
    <tbody>


<%

int i = -1;
List<String> flights = (ArrayList<String>)request.getAttribute("arrAirlineName");
for(String flightM : flights) {
  
    //String sRadio = "<input type=\"radio\" id=\"" + i + "\" name=\"ticket\" onclick=\"CookieFunction(\"" + flightM.getSOURCENAME() + "\", \"" + flightM.getDESTINATION() + "\",\"" + flightM.getsDate() + "\",\"" + flightM.getFLIGHTTIME() + "\",\"" + flightM.getFLIGHTNAME() + "\",\"" + flightM.getsFlightId() + "\",\"" + flightM.getTICKETP() + "\")\">";
    //String sBookURL = "<a href=\"login.jsp?source=" + flightM.getSOURCENAME() + "&dest=" + flightM.getDESTINATION() + "&date=" + flightM.getsDate() + "&time=" + flightM.getFLIGHTTIME() + "&name=" + flightM.getFLIGHTNAME() + "&id=" + flightM.getsFlightId() + "&ticketp=" + Double.toString(flightM.getTICKETP()) + "\">Click here</a>";
	out.print("<tr>" +
            "<td>"+flightM+"</td>" +
            
                          	"</tr>"
       					);         
		                   
}

out.flush();

%>

 </tbody>
</table>
<br>

<button type="button" onclick="HomeFunction()">Back to Home</button>
</body>
</html>