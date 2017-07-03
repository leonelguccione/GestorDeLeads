package test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import modelo.Gestor;
import util.Create_HibernateUtil;

public class Create
{
	public static void main(String[] args)
	{
		System.out.println("Creando Gestor y tablas");
		Gestor gestor = new Gestor();
		Long id = new Long(1);
		Session session;
		session = Create_HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();

			gestor.setId_gestor(id);
			session.save(gestor);

			tx.commit();
		}
		catch (RuntimeException e)
		{
			try
			{
				if (tx != null)
					tx.rollback();
			}
			catch (HibernateException e1)
			{
				// log.error("Transaction roleback not succesful");
			}
			throw e;
		}
	}

}
