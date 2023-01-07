package dao;

import org.hibernate.Cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class AbstractHibernateDao {
	// Application ~ SessionFactory
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	Session openSession() {
		/*
			Option 1: Using openSession -> thread
					  Always create new thread, new session while calling openSession
		 */
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		/*
		 	Option 2: Using getCurrentSession -> thread
		 			  Only create ONE unique thread, session for each Session Factory
		 			  session_current_context_class -> singleton pattern
		 */
		return sessionFactory.getCurrentSession();
	}
	
	Cache getRegionCache( ) {
		// 2nd cache
		return sessionFactory.getCache();
	}
	
	void clearRegionCache(Class<?> clazz) {
		Cache cache = getRegionCache();
		if (cache != null) {
			cache.evict(clazz);
		}
	}
	
	void clearAllRegionCache() {
		Cache cache = getRegionCache();
		if (cache != null) {
			cache.evictAllRegions();
		}
	}
}
