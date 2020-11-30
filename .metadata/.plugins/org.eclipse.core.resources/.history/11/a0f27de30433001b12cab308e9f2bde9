package com.flightbooking.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PaymentService
 */
public class PaymentService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaymentService() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw3 = response.getWriter();
		request.getParameter("cardname");
		request.getParameter("cardnumber");
		request.getParameter("expmonth");
		String price=request.getParameter("ticketp");
		String source =request.getParameter("source");
		String dest =request.getParameter("dest");
		String date =request.getParameter("date");
		String name =request.getParameter("name");
		String time =request.getParameter("time");
		String id =request.getParameter("id");
		String uname=request.getParameter("uname");
		String sFullName=request.getParameter("sFullName");
		String iphone=request.getParameter("iPhone");
		
		// build HTML code
        String htmlRespone = "<html><head></head><body>";
        htmlRespone += "<h2>Your Transaction is successful  "+"</h2>";     
        htmlRespone += "<a href=PrintReceipt.jsp>PrintReceipt"+"</a>";    
        htmlRespone += "</body></html>";
         
        // return response
        pw3.println(htmlRespone);
        
        
	
	}

}
