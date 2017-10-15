package javaClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EntryManager {
	static Configuration cfg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("here?");
		cfg=new Configuration().configure("hibernate.cfg.xml");

		// creating session object
		SessionFactory factory=cfg.buildSessionFactory();

		//creating session object  
		Session session=factory.openSession(); 

		//creating transaction object  
		Transaction t=session.beginTransaction(); 
	}

}
