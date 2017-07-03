package util;

import org.hibernate.SessionFactory;
//import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import modelo.Gestor;

public class Create_HibernateUtil
{

	private static final SessionFactory sessionFactory;

	static
	{
		try
		{
			//sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
			Configuration cfg = new Configuration().configure("create-hibernate.cfg.xml");
			sessionFactory = cfg.buildSessionFactory(); 
		}
		catch (Throwable ex)
		{
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}
