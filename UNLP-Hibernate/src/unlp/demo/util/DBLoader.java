/**
 * este paquete contiene clases que se utilizan para cargar la base de datos.
 */
package unlp.demo.util;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import unlp.demo.model.Person;
import unlp.demo.model.Phone;

/**
 * Esta clase se utiliza para cargar el repositorio.
 * 
 * @author Javier Bazzocco javier.bazzocco@lifia.info.unlp.edu.ar
 * 
 */
public class DBLoader {
	private static SessionFactory sessions;

	/**
	 * Constructor.
	 */
	public DBLoader() {
	}

	/**
	 * Este método permite ejecutar esta clase.
	 * 
	 * @param args
	 *            son los argumentos que se le pasan como parámetros de entrada.
	 */
	public static void main(String[] args) {

		try {

			System.out
					.println("----------------------- Setting up Hibernate -----------------------");
			Configuration cfg = new Configuration();
			cfg.configure();

			System.out.println("Droping schema.........");
			new SchemaExport(cfg).drop(true, true);
			System.out.println("DONE.");

			System.out.println("Generating schema.........");
			new SchemaExport(cfg).create(true, true);
			System.out.println("DONE.");

			System.out.println("Building sessions.........");

			sessions = cfg.buildSessionFactory();

			createObjects();

		} catch (Exception e) {
			System.out
					.println("------------------------FAIL.------------------------");
			e.printStackTrace();
		}

	}

	/**
	 * Crea y almacena los objetos en la base de datos.
	 * 
	 * @throws HibernateException
	 *             esta excepción se lanza en caso de que ocurra un error con la
	 *             base de datos.
	 */
	public static void createObjects() throws HibernateException {
		Session session = sessions.openSession();
		Person aPerson = new Person();
		aPerson.setName("Juan");
		aPerson.setSurname("Perez");
		Phone aPhone = new Phone();
		aPhone.setNumber("212121");

		aPerson.setPhone(aPhone);

		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.save(aPerson);

			session.flush();
			session.connection().commit();

			tx.commit();
			tx.begin();

			Query aQuery = session
					.createQuery("select p from unlp.demo.model.Phone p");
			System.out.println("los telefonos son " + aQuery.list());

			tx.commit();
			session.flush();
			tx.begin();

			 aQuery = session
					.createQuery("select p from unlp.demo.model.Phone p");
			System.out.println("los telefonos son " + aQuery.list());

			tx.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
			session.close();
		}
		session.disconnect();
	}

}
