<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<body>
   <script>
   
   function signUpFunction() {
	   
	
 	     var url = 'UserResgistrationPage.jsp?';
	     
	     var price1 = 'price=';
	     var pval1 = '<%=request.getParameter("ticketp")%>';

	     var source1 = '&source=';
	     var pval2 = '<%=request.getParameter("source")%>';
	     
	     var dest1 = '&dest=';
	     var pval3 = '<%=request.getParameter("dest")%>';
	     
	     var name1 = '&name=';
	     var pval4 = '<%=request.getParameter("name")%>';
	     
	     var id1 = '&id=';
	     var pval5 = '<%=request.getParameter("id")%>';
	     
	     var time1 = '&time=';
	     var pval6 = '<%=request.getParameter("time")%>';
	     
	     var date1 = '&date=';
	     var pval7 = '<%=request.getParameter("date")%>';
	     
	     var url1 = url.concat(price1,pval1,source1,pval2,dest1,pval3,name1,pval4,id1,pval5,time1,pval6,date1,pval7);

 	     window.location.href=url1;

	     
	 }
   	
   </script>
   <form action="LoginCredentialValidation" method="post">
      <label for="uname"><b>Username : </b></label><br>
      <input type="text" placeholder="Enter Registered Email" name="uname">
      <br><br>
      <label for="psw"><b>Password : 	</b></label><br>
      <input type="password" placeholder="Enter Password" name="psw">
      <br><br><br>
      <button type="submit">Login</button>

      <input type="hidden" name="ticketp" value="<%=request.getParameter("ticketp")%>" />
      <input type="hidden" name="source" value="<%=request.getParameter("source")%>" />
      <input type="hidden" name="dest" value="<%=request.getParameter("dest")%>" />
      <input type="hidden" name="date" value="<%=request.getParameter("date")%>" />
      <input type="hidden" name="name" value="<%=request.getParameter("name")%>" />
      <input type="hidden" name="time" value="<%=request.getParameter("time")%>" />
      <input type="hidden" name="id" value="<%=request.getParameter("id")%>" />
     
   </form>
   
   <br>
   
   <button onclick="signUpFunction()">SignUp</button>   
   
</body>
</html>