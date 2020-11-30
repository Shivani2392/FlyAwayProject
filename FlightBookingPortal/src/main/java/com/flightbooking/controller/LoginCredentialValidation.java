package com.flightbooking.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.flightbooking.entities.FLIGHTMASTER;
import com.flightbooking.entities.FlightMasterPojo;
import com.flightbooking.entities.UserRegistration;
import com.flightbooking.entities.UserRegistrationPojo;

/**
 * Servlet implementation class LoginCredentialValidation
 */
public class LoginCredentialValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCredentialValidation() {
        super();
        
    }
    
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("psw");
		
		String price = request.getParameter("ticketp");
		String source = request.getParameter("source");
		String dest = request.getParameter("dest");
		String time = request.getParameter("time");
		String id = request.getParameter("id");
		String date = request.getParameter("date");
		String name = request.getParameter("name");
		
	    String NoOfAdult = (String)request.getSession().getAttribute("adult1");
	    int iAdult = Integer.parseInt(NoOfAdult);
	    String NoOfChild = (String)request.getSession().getAttribute("child1");
	    int iChild = Integer.parseInt(NoOfChild);
	    
	    double iPrice = Double.parseDouble(price);
	    
	    double iFinalPrice = 0;
	    if(iChild == 0)
	    {
	    	iFinalPrice = iPrice * iAdult;
	    }
	    else
	    {
	    	iFinalPrice = iPrice * iChild * iAdult;
	    }
	     
	    
		//get connection from database
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.addAnnotatedClass(com.flightbooking.entities.UserRegistration.class)
				.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		
		//Open transaction
		
		Transaction tx = session1.beginTransaction();
		
		//check whether user is already exist is database
		Integer iPhone = 0;
		String sFullName = "";
		PrintWriter pw = response.getWriter();
		UserRegistrationPojo pojo = new UserRegistrationPojo();
	    List<UserRegistration> userObjs =	session1.createQuery("from UserRegistration u where u.Email = '"+uname+"' AND u.Password='"+pwd + "'").getResultList();
		if(userObjs == null && userObjs.size() == 0)
		{
			request.getRequestDispatcher("Error1.jsp").forward(request, response);			
		}
		else
		{
			// Assumption, only one user will be queried out
			UserRegistration user = userObjs.get(0);
			iPhone = user.getPhoneNo();
			sFullName = user.getFullName();

		    pojo.setEmail(uname);
		    pojo.setSFullName(sFullName);
		    pojo.setsPhoneNo(iPhone);
		    
			request.setAttribute("userPojo", pojo);
			String sURL = "BookFlight.jsp?price="+iFinalPrice + "&source=" + source + "&dest=" + dest + "&name=" + name +
					      "&id=" + id + "&time=" + time + "&date=" + date;
			
			request.getRequestDispatcher(sURL).forward(request, response);
		}
		
	    
	    sessionFactory.close();
	}
	 
}