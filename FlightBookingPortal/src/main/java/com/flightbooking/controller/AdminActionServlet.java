package com.flightbooking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.flightbooking.entities.FLIGHTMASTER;
import com.flightbooking.entities.FlightMasterPojo;

/**
 * Servlet implementation class MasterSourceDestinationlistServlet
 */
public class AdminActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AdminActionServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 PrintWriter pw = response.getWriter();
		 Configuration config = new Configuration();
		 config.configure("hibernate.cfg.xml");
		 SessionFactory sessionFactory = config.addAnnotatedClass(com.flightbooking.entities.FLIGHTMASTER.class)
					.buildSessionFactory();
		 Session session1 = sessionFactory.openSession();
		 Transaction tx = session1.beginTransaction();
		 
		 String selectedRadio = request.getParameter("admin");
		 if(selectedRadio.equals("reset"))
		 {
			 request.getRequestDispatcher("ResetPassword.jsp").forward(request, response);
		 }
		 else if(selectedRadio.equals("srcdest"))
		 {
			List<FlightMasterPojo> flightDetailsArr = new ArrayList<FlightMasterPojo>();					
			try 
			{		
				@SuppressWarnings("unchecked")
				List<FLIGHTMASTER> listofsourceanddestination=session1.createQuery("from FLIGHTMASTER").getResultList();

				if (listofsourceanddestination != null && listofsourceanddestination.size() > 0) 
				{
				   System.out.println("Size of result" + listofsourceanddestination.size());
				   for(int i=0;i<listofsourceanddestination.size();i++) 
				   { 
					   FLIGHTMASTER flightEntity = listofsourceanddestination.get(i);
					   FlightMasterPojo pojo = new FlightMasterPojo();
                       
					   pojo.setDESTINATION(flightEntity.getDESTINATION());
					   pojo.setSOURCENAME(flightEntity.getSOURCENAME());
							 
					   flightDetailsArr.add(pojo);
				   }
				   request.setAttribute("flightPojos", flightDetailsArr);
				   request.getRequestDispatcher("MasterSourceDestinationlist.jsp").forward(request, response);
				}
			 } 
			 catch (Exception e) 
			 {
				 System.out.println(e.getMessage());
			 }
		 }
		 else if(selectedRadio.equals("airlines"))
		 {

			 List<String> arrAirlineName = session1.createQuery("select DISTINCT m.FLIGHTNAME from FLIGHTMASTER m").getResultList();
				if(arrAirlineName != null)
				{
					for(String airlines:arrAirlineName) {
						System.out.println();
					}
					request.setAttribute("arrAirlineName", arrAirlineName);
					  request.getRequestDispatcher("MasterlistofAirlines.jsp").forward(request, response);
				}
		 }
		 else if(selectedRadio.equals("flights"))
		 {
			 List<FlightMasterPojo> flightDetailsArr1 = new ArrayList<FlightMasterPojo>();					
				try 
				{		
					@SuppressWarnings("unchecked")
					List<FLIGHTMASTER> listofflights=session1.createQuery("from FLIGHTMASTER").getResultList();

					if (listofflights != null && listofflights.size() > 0) 
					{
					   System.out.println("Size of result" + listofflights.size());
					   for(int i=0;i<listofflights.size();i++) 
					   { 
						   FLIGHTMASTER flightEntity1 = listofflights.get(i);
						   FlightMasterPojo pojo1 = new FlightMasterPojo();
	                       
						   pojo1.setFLIGHTNAME(flightEntity1.getFLIGHTNAME());
						   pojo1.setDESTINATION(flightEntity1.getDESTINATION());
						   pojo1.setSOURCENAME(flightEntity1.getSOURCENAME());
						   pojo1.setsFlightId(flightEntity1.getFLIGHTID());
						  
						   pojo1.setFLIGHTTIME(flightEntity1.getFLIGHTTIME());
						   pojo1.setTICKETP(flightEntity1.getTICKETP());
								 
						   flightDetailsArr1.add(pojo1);
					   }
					   request.setAttribute("Masterlistofflights", flightDetailsArr1);
					   request.getRequestDispatcher("MasterListofFlights.jsp").forward(request, response); 
		           }
				 }
				  catch (Exception e) 
			 {
				 System.out.println(e.getMessage());
			 } 
		 }
		 
		 else if(selectedRadio.equals("Logout")) {
			 request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
		 }
	}

}
