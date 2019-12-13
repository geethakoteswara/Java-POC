package com.project.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {

		SessionFactory sessionfactory =  new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
	try {
		session.beginTransaction();
		CustomerInfo cust1 = new CustomerInfo();
		cust1.setCustomerName("Amazon");
		Customer_Details details = new Customer_Details();
		details.setMobile_number("9689893409");
		details.setEmail_id("geeta.sharma@tcs.com");
		cust1.setCdetail(details); 
		//Auto Generating Customer ID
			
		//to store hibernate obj into database
		session.save(cust1);
		
//		session.save(cust2);
//		session.save(cust3);
		
		session.getTransaction().commit();
	}
	catch(Exception sqlException) {
		if(session != null)
			session.getTransaction().rollback();
		sqlException.printStackTrace();
	}
	finally {
		session.close();
		sessionfactory.close();
	}
	}

}
