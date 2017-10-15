package DataBase;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EntityManagerDrug {
	
	static Configuration cfg;
	static SessionFactory factory;
	
	public static void main(String[] args) {
		// creating configuration object
		cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file
		factory = cfg.buildSessionFactory();
		//addStudent();
		// deleteStudent();
		// showStudent();
		// updateStudent();

	}

}
