package javaClasses;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EntryManager implements Serializable {

	static Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
	static SessionFactory factory = cfg.buildSessionFactory();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public users LogInValidation(String username, String password) {
		// -1 means this user doesn't exist
		users user = new users();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		try {
			user = session.get(users.class, username);
			// validating the password
			if (user.getPassword().equals(password)) {
				return user;
			} else {
				return null;
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			session.close();
			factory.close();
		}

		return null;

	}

	// select the searched drugs from Drug table

	public List<Drug> searchDrug(String search) {
		List<Drug> drugs = new ArrayList<Drug>();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();
		try {
			// HQL
			
			drugs = (List<Drug>) session.createQuery("FROM Drug where name LIKE '%" + search + "%' ").list();

			t.commit();

			return drugs;

		} catch (Exception e) {
			e.printStackTrace();
			t.rollback();
		} finally {
			session.close();

		}
		return drugs;

	}

	public boolean addDrug(Drug drug1) {
		boolean status = false;

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();

		try {

			Drug drug = new Drug();
			drug.setName(drug1.getName());
			session.save(drug);
			t.commit();
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;

		} finally {
			session.close();
			factory.close();
		}

	}

}
