package modelo;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


import javassist.bytecode.Descriptor.Iterator;
import util.Create_HibernateUtil;
import util.HibernateUtil;

public class Gestor_tx extends Gestor
{
	private Gestor gestor;

	public Gestor_tx()
	{
		gestor = new Gestor();
	}

	@Override
	public Long getId_gestor()
	{
		// TODO Auto-generated method stub
		return gestor.getId_gestor();
	}

	/*
	@Override
	public void setId_gestor(Long id)
	{
		// TODO Auto-generated method stub

		System.out.println("setId_gestor() entrando");
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
		System.out.println("setId_gestor() saliendo");

	}
	*/

	@Override
	public void setTerceros(Collection<Tercero> terceros)
	{
		System.out.println("setTercero() entrando");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();

			Gestor gestor = (Gestor) session.get(Gestor.class, new Long(1));
			if (gestor != null)
			{
				System.out.println("id del gestor: " + gestor.getId_gestor());
				System.out.println("toString: " + gestor);
				gestor.setTerceros(terceros);
				System.out.println("toString: " + gestor);
			}
			else
			{
				System.out.println("no existe gestor, es null");
			}
			// session.save(gestor);

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
		System.out.println("setTercero() saliendo");

	}

	@Override
	public Collection<Tercero> getTerceros()
	{
		// TODO Auto-generated method stub
		return gestor.getTerceros();
	}

	@Override
	public void setEmpleados(Collection<Empleado> empleados)
	{
		// TODO Auto-generated method stub
		gestor.setEmpleados(empleados);
	}

	@Override
	public Collection<Empleado> getEmpleados()
	{
		// TODO Auto-generated method stub
		return gestor.getEmpleados();
	}
	
	public List<Empleado> listar_empleados()
	{
		List<Empleado> results;
		
		System.out.println("Gestor_tx.addTercero()--entrando");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();
			
			Criteria cr = session.createCriteria(Empleado.class);
			Long id = new Long(101);
			cr.add(Restrictions.eq("id_empleado", id));
			results =  cr.list();
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
		return results;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see modelo.Gestor#addTercero(modelo.Tercero) agrega un tercero que no
	 * contenga IngenieroDeClientes asociado
	 */
	@Override
	public void addTercero(Tercero nuevoTercero)
	{
		System.out.println("Gestor_tx.addTercero()--entrando");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();

			Gestor gestor = (Gestor) session.load(Gestor.class, new Long(1));
			// Tercero tercero = (Tercero)session.get(Tercero.class,
			// nuevoTercero.getId());
			if (gestor != null)
			{
				System.out.println("id del gestor: " + gestor.getId_gestor());
				System.out.println("toString: " + gestor);
				gestor.getTerceros().add(nuevoTercero);
				System.out.println("muestro Gestor luego de agregar un tercero nuevo: " + gestor);
				/*
				 * if (gestor.getTerceros().size() == 0) { HashSet<Tercero>
				 * terceros = new HashSet<Tercero>();
				 * terceros.add(nuevoTercero); gestor.setTerceros(terceros); }
				 * else { gestor.getTerceros().add(nuevoTercero); }
				 */
			}
			else
			{
				System.out.println("no existe gestor, es null");
			}
			// session.save(gestor);

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
		System.out.println("addTercero() saliendo");

	}

	@Override
	public void addEmpleado(Empleado nuevoEmpleado)
	{
		System.out.println("Gestor_tx.addEmpleado()--entrando");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();

			Gestor gestor = (Gestor) session.load(Gestor.class, new Long(1));
			if (gestor != null)
			{

				gestor.addEmpleado(nuevoEmpleado);

			}
			else
			{
				System.out.println("no existe gestor, es null");
			}
			// session.save(gestor);

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
		System.out.println("addEmpleado() saliendo");

	}

	public static void crearTercero(Tercero terceroSinIngenieroAsignado, Long ingeniero_id)
	{
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();
			IngenieroDeClientes ingeniero = (IngenieroDeClientes) session.load(Empleado.class, ingeniero_id);

			Gestor gestor = (Gestor) session.load(Gestor.class, new Long(1));

			if (gestor != null && ingeniero != null)
			{
				terceroSinIngenieroAsignado.setIngenieroDeClientes(ingeniero);
				gestor.getTerceros().add(terceroSinIngenieroAsignado);

			}
			else
			{
				System.out.println("no existe gestor o ingeniero, es null");
			}
			// session.save(gestor);

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
		System.out.println("CrearTercero() saliendo");
	}

	public void asociarTerceroConIngeniero(Long id_tercero, Long id_ingeniero)
	{
		System.out.println("entrando Gestor_tx asociarTerceroConIngeniero()");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();
			// Gestor gestor = (Gestor) session.load(Gestor.class, new Long(1));
			// gestor.getTerceros().

			Tercero tercero = (Tercero) session.load(Tercero.class, id_tercero);
			System.out.println(tercero);

			IngenieroDeClientes ingeniero = (IngenieroDeClientes) session.load(IngenieroDeClientes.class, id_ingeniero);
			System.out.println(ingeniero);
			if (tercero != null && ingeniero != null)
			{
				ingeniero.getTerceros().add(tercero);
				tercero.setIngenieroDeClientes(ingeniero);
				System.out.println(tercero);
				System.out.println(ingeniero);
				// session.update(ingeniero);
				// session.update(tercero);
			}
			else
			{
				System.out.println("no existe tercero o ingeniero");
			}
			// session.save(gestor);

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
		System.out.println("saliendo Gestor_tx asociarTerceroConIngeniero()");

	}

	public void addNecesidad(Long id_tercero, Necesidad necesidad)
	{
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();
			Tercero tercero = (Tercero) session.load(Tercero.class, id_tercero);
			System.out.println("desde Gestor_tx.addNecesidad(), muestro tercero: " + tercero);
			if (tercero != null)
			{
				// tercero.getNecesidades().add(necesidad);
				tercero.addNecesidad(necesidad);
				System.out.println("desde Gestor_tx.addNecesidad(), muestro tercero: " + tercero);
			}
			else
			{
				System.out.println("no existe tercero, es null");
			}
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
		System.out.println("CrearTercero() saliendo");
	}

	public void add_tareaProgramada_a_necesidad(Long id_necesidad, TareaProgramada nuevaTareaProgramada)
	{
		System.out.println("entrando Gestor_tx add_tareaProgramada_a_necesidad()");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();

			Necesidad necesidad = (Necesidad) session.load(Necesidad.class, id_necesidad);
			System.out.println(necesidad);

			if (necesidad != null && nuevaTareaProgramada != null)
			{
				necesidad.addTareaProgramada(nuevaTareaProgramada);
				System.out.println(necesidad);
				nuevaTareaProgramada.setNecesidad(necesidad);
				System.out.println(nuevaTareaProgramada);
			}
			else
			{
				System.out.println("no existe necesidad o nuevaTareaProgramada");
			}
			// session.save(gestor);

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
		System.out.println("saliendo Gestor_tx add_tareaProgramada_a_necesidad");
	}

	public void asociar_tareaProgramada_ejecutivoDeCuentas(Long id_tareaProgramada, Long id_empleado)
	{
		System.out.println("entrando Gestor_tx asociar_tareaProgramada_ejecutivoDeCuentas()");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();
			TareaProgramada tareaProgramada = (TareaProgramada) session.load(TareaProgramada.class, id_tareaProgramada);
			System.out.println(tareaProgramada);
			EjecutivoDeCuentas ejecutivoDeCuentas = (EjecutivoDeCuentas) session.load(EjecutivoDeCuentas.class, id_empleado);
			System.out.println(ejecutivoDeCuentas);
			if (tareaProgramada != null && ejecutivoDeCuentas != null)
			{
				tareaProgramada.addResponsable(ejecutivoDeCuentas);
				ejecutivoDeCuentas.addTareaProgramada(tareaProgramada);
				System.out.println(tareaProgramada);
				System.out.println(ejecutivoDeCuentas);
			}
			else
			{
				System.out.println("no existe tareaProgramada o ejecutivoDeCuentas");
			}
			// session.save(gestor);

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
		System.out.println("saliendo Gestor_tx asociarTerceroConIngeniero()");
	}

	/**
	 * crear una nueva tarea programada asociada con su necesidad y Ejecutivo de
	 * cuentas Necesidad (1) <-------> (muchos) TareaProgramada 
	 * TareaPrograma (muchos) <---> (muchos) EjecutivoDeCuentas
	 */
	public void add_tareaProgramada(TareaProgramada nuevaTareaProgramada, Long id_necesidad, Long id_Empleado)
	{
		System.out.println("entrando Gestor_tx add_tareaProgramada_a_necesidad()");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();

			Necesidad necesidad = (Necesidad) session.load(Necesidad.class, id_necesidad);
			System.out.println(necesidad);
			EjecutivoDeCuentas ejecutivoDeCuentas = (EjecutivoDeCuentas) session.load(EjecutivoDeCuentas.class,
					id_Empleado);

			if (necesidad != null && ejecutivoDeCuentas != null && nuevaTareaProgramada != null)
			{
				necesidad.addTareaProgramada(nuevaTareaProgramada);
				System.out.println(necesidad);
				nuevaTareaProgramada.setNecesidad(necesidad);
				System.out.println(nuevaTareaProgramada);
				nuevaTareaProgramada.addResponsable(ejecutivoDeCuentas);
				ejecutivoDeCuentas.addTareaProgramada(nuevaTareaProgramada);
			}
			else
			{
				System.out.println("no existe necesidad o nuevaTareaProgramada o ejecutivoDeCuentas");
			}
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
		System.out.println("saliendo Gestor_tx add_tareaProgramada_a_necesidad");
	}
	
	/**
	 * Unidireccional: Necesidad (uno) <-----> (muchos) Conversacion
	 * @param nuevaConversacion
	 * @param id_necesidad
	 */
	public void add_conversacion_a_necesidad(Conversacion nuevaConversacion, Long id_necesidad)
	{
		System.out.println("ENTRANDO --- Gestor_tx() add_converacion_a_necesidad()");
		Session session;
		session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = null;
		try
		{
			tx = session.getTransaction();
			tx.begin();

			Necesidad necesidad = (Necesidad) session.load(Necesidad.class, id_necesidad);
			System.out.println(necesidad);

			if (necesidad != null && nuevaConversacion != null)
			{
				necesidad.addConversacion(nuevaConversacion);
				System.out.println(necesidad);
			}
			else
			{
				System.out.println("no existe necesidad o conversacion");
			}
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
		System.out.println("SALIENDO --- Gestor_tx() add_converacion_a_necesidad()");
	}
	
	
}
