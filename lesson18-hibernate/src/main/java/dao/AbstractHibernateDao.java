package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class AbstractHibernateDao {
	// Application ~ SessionFactory
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	/*public*/ Session openSession() {
		/*
			Option 1: Using openSession -> thread
					  Always create new thread, new session while calling openSession
		 */
		return sessionFactory.openSession();
	}
	
	/*public*/ Session getCurrentSession() {
		/*
		 	Option 2: Using getCurrentSession -> thread
		 			  Only create ONE unique thread, session for each Session Factory
		 			  session_current_context_class -> singleton pattern
		 */
		return sessionFactory.getCurrentSession();
	}
}
