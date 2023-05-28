package org.simplilearn.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.simplilearn.app.config.HbConfig;
import org.simplilearn.app.entities.Customer;
import org.simplilearn.app.entities.Employees;
import org.simplilearn.app.entities.Person;


public class Test {

	public static void main(String[] args) {

		SessionFactory factory = HbConfig.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			/*
			 * SalariedEmployee se = new SalariedEmployee(); se.setName("Ankita");
			 * se.setAddress("Kamla Nagar"); se.setSalary(80000); session.save(se);
			 * 
			 * HourlyEmployee he = new HourlyEmployee(); he.setName("Preeti");
			 * he.setAddress("U.P"); he.setHourlySalary(6000); session.save(he);
			 */
			Employees e=new Employees();
			e.setName("Garima");
			e.setAddress("New Delhi");
			e.setSalary(50000);
			e.setDname("Full Stack");
			Employees e1=new Employees();
			e1.setName("Ankita");
			e1.setAddress("Gurugram");
			e1.setSalary(45000);
			e1.setDname("HR");
			
	        Customer c=new Customer();
	        c.setName("Preeti");
	        c.setAddress("Noida");
	        c.setOrderName("Bulk Order");
	        c.setOrderDate("18/10/1991");
	        Customer c1=new Customer();
	        c1.setName("Geeta");
	        c1.setAddress("Noida");
	        c1.setOrderName("Retail");
	        c1.setOrderDate("04/01/2023");
	        session.save(e);
	        session.save(c);
	        session.save(e1);
	        session.save(c1);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
		}
		session.close();
	}

}
