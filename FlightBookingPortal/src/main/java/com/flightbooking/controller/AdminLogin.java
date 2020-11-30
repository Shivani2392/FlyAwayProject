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

import com.flightbooking.entities.UserRegistration;
import com.flightbooking.entities.UserRegistrationPojo;
import com.flightbooking.pojo.AdminRegistration;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminLogin() {
        super();
      
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String adminname=request.getParameter("auname");
		String adminpswd=request.getParameter("psw");
		
		HttpSession session = request.getSession();
		session.setAttribute("auname", adminname);
		session.setAttribute("psw", adminpswd);
		
		//Connect to DB
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.addAnnotatedClass(com.flightbooking.entities.AdminRegistrationEntity.class)
				.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		
		//Open transaction
		
		Transaction tx = session1.beginTransaction();
		
		AdminRegistration pojo1 = new AdminRegistration();
	    List<AdminRegistration> adminObjs =	session1.createQuery("from AdminRegistrationEntity u where u.ADMINEMAIL = '"+adminname+"' AND u.ADMINPSWD='"+adminpswd + "'").getResultList();
		if(adminObjs == null || adminObjs.size() == 0)
		{
			request.getRequestDispatcher("ErrorinAdminlogin.jsp").forward(request, response);			
		}
		else
		{
			PrintWriter pw = response.getWriter();
			
			request.getRequestDispatcher("WelcomeAdmin.jsp").
	        include(request, response);
			
		}

		
		
		
		
	}

}
