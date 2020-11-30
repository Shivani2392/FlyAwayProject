package com.flightbooking.sessionfactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Creating Session Factory to connect with Database in hibernate
public class SessionFactoryProvider {
	public static SessionFactory factory;
	
	public static SessionFactory getFactory() 
	   {
		
		if(factory==null)
		{
			//factory=   new Configuration().configure("hibernate.cfg.xml");
			factory = new Configuration().configure("hibernate.cfg.xml")
					.buildSessionFactory();

		}		
		
		return factory;	
	   }

	public void closeFactory()
	  {
		if(factory.isOpen()) 
		{
			factory.close();
		}
		
	  }
	
	
	
	
}
