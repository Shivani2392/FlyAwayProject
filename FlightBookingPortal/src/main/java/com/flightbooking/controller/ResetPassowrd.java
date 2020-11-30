package com.flightbooking.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import com.flightbooking.entities.AdminRegistrationEntity;
import com.flightbooking.entities.FLIGHTMASTER;


/**
 * Servlet implementation class ResetPassowrd
 */
public class ResetPassowrd extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
    public ResetPassowrd() {
        super();

    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String newpassword=request.getParameter("newpassword");
		String oldpassword=request.getParameter("oldpassword");
		
		PrintWriter pw3 = response.getWriter();
		HttpSession session = request.getSession();
			
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.addAnnotatedClass(com.flightbooking.entities.AdminRegistrationEntity.class)
			.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
	
		//Open transaction
		Transaction tx = session1.beginTransaction();
		List<String> passwordArr = session1.createQuery("from AdminRegistrationEntity u where u.ADMINEMAIL='" + username + "' and u.ADMINPSWD='" + oldpassword + "'").getResultList();
		if(passwordArr == null || passwordArr.size() == 0)
		{
			request.getRequestDispatcher("Error2.jsp").forward(request, response);
		}
		else
		{
			session1.createQuery("update AdminRegistrationEntity u set u.ADMINPSWD = '" + newpassword + "'").executeUpdate();
			tx.commit();
			
			// build HTML code
			String htmlRespone = "<html><head></head><body>";
			htmlRespone += "<h2>Password changed succesfully!!...Next time, Please Login with new Passowrd!!"+"</h2>";     
			htmlRespone += "<a href=\"AdminLogin.jsp\">Back to Login Page"+"</a>";    
			htmlRespone += "</body></html>";
	     
			// return response
			pw3.println(htmlRespone);	

		}
		
	}		
}
