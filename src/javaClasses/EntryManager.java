package javaClasses;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EntryManager {
	
	static Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		// creating session object
		
	}
	
	
	
	public users LogInValidation(String username, String password){
		//-1 means this user doesn't exist
		users user=new users();
		
		SessionFactory factory=cfg.buildSessionFactory();

		//creating session object  
		Session session=factory.openSession(); 

		//creating transaction object  
		Transaction t=session.beginTransaction(); 
		
		try{
			user=session.get(users.class,username);
			//validating the password
			if(user.getPassword().equals(password)){
				return user; 
			}else{
				return null;
			}
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
		
		
	   return null;
		
		
	}

}
