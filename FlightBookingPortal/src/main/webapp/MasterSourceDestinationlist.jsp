<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="com.flightbooking.entities.FlightMasterPojo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MasterListSourceDestination</title>
</head>
<body>

   <script>
   
   function HomeFunction() {
	   var url = 'WelcomeAdmin.jsp';
	   window.location.href=url;
   } 
   
   </script>


<table width="59%" border="1">
    <thead>
    <tr>
        <td><h5>Source</h5></td>
        <td><h5>Destination</h5></td>
        
    </tr>
    </thead>
    <tbody>
    <%
    
    	int i = -1;
        List<FlightMasterPojo> flights = (ArrayList<FlightMasterPojo>)request.getAttribute("flightPojos");
        for(FlightMasterPojo flightM : flights) {
            i++;
            //String sRadio = "<input type=\"radio\" id=\"" + i + "\" name=\"ticket\" onclick=\"CookieFunction(\"" + flightM.getSOURCENAME() + "\", \"" + flightM.getDESTINATION() + "\",\"" + flightM.getsDate() + "\",\"" + flightM.getFLIGHTTIME() + "\",\"" + flightM.getFLIGHTNAME() + "\",\"" + flightM.getsFlightId() + "\",\"" + flightM.getTICKETP() + "\")\">";
            //String sBookURL = "<a href=\"login.jsp?source=" + flightM.getSOURCENAME() + "&dest=" + flightM.getDESTINATION() + "&date=" + flightM.getsDate() + "&time=" + flightM.getFLIGHTTIME() + "&name=" + flightM.getFLIGHTNAME() + "&id=" + flightM.getsFlightId() + "&ticketp=" + Double.toString(flightM.getTICKETP()) + "\">Click here</a>";
            out.print(String.format("<tr>" +
                    "<td>%s</td>" +
                    "<td>%s</td>" +
                                  	"</tr>",
               					flightM.getSOURCENAME(),flightM.getDESTINATION()));                  
        }

        out.flush();
    %>
    </tbody>
</table>
<br>

<button type="button" onclick="HomeFunction()">Back to Home</button>

</body>
</html>