/**
 * este paquete contiene clases que se utilizan para cargar la base de datos.
 */
package unlp.demo.util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.PropertyValueException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import unlp.demo.model.*;

/**
 * Esta clase se utiliza para cargar el repositorio.
 * 
 * @author Javier Bazzocco javier.bazzocco@lifia.info.unlp.edu.ar
 * 
 */
public class DBLoaderEmpleado {
	private static SessionFactory sessions;

	/**
	 * Constructor.
	 */
	public DBLoaderEmpleado() {
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
					.println("----------------------- Configurando Hibernate -----------------------");
			Configuration cfg = new Configuration();
			cfg.configure();

			System.out.println("Eliminando schema previo.........");
			new SchemaExport(cfg).drop(true, true);
			System.out.println("DONE.");

			System.out.println("Generando schema.........");
			new SchemaExport(cfg).create(true, true);
			System.out.println("DONE.");

			System.out.println("Construyendo las seciones.........");

			sessions = cfg.buildSessionFactory();

			createObjects();

		} catch (Exception e) {
			System.out
					.println("------------------------FALLA.------------------------");
			e.printStackTrace();
		}

	}

	/**
	 * Crea y almacena los objetos en la base de datos.
	 * 
	 * @throws HibernateException
	 *             esta excepción se lanza en caso de que ocurra un error con la
	 *             base de datos.
	 * @throws ParseException 
	 */
	public static void createObjects() throws HibernateException, ParseException {
		
		Session session = sessions.openSession();


		// -- Carga de Datos de Prueba -- //
        Domicilio dom1 = new Domicilio("Calle1",1,1,"Dpto1","La Plata");
		Domicilio dom2 = new Domicilio("Calle2",25,1789,"Dpto2","La Plata");
		Domicilio dom3 = new Domicilio("Corrientes",325,5,"Dpto3","Buenos Aires");
		Domicilio dom4 = new Domicilio("Calle4",441,1,"Dpto4","La Plata");
		Domicilio dom5 = new Domicilio("Santa Fe",5423,9,"Dpto5","Buenos Aires");
		Domicilio dom6 = new Domicilio("Calle6",6,1589,"Dpto6","La Plata");
		Domicilio dom7 = new Domicilio("Rivadavia",720,15,"Dpto7","Buenos Aires");
		Domicilio dom8 = new Domicilio("Belgrano",847,14,"Dpto8","Buenos Aires");

		Cliente cli1 = new Cliente("Juan Perez");
		Cliente cli2 = new Cliente("Pedro Gonzales");
		Cliente cli3 = new Cliente("Carlos Rodriguez");
		
		Supervisor sup1 = new Supervisor("Maria","Ruiz","mruiz","1234");
		Supervisor sup2 = new Supervisor("Ana","Fernandez","afernandez","1234");
		Supervisor sup3 = new Supervisor("Silvia","Fernandez","sfernandez","1234");
		
		Tecnico tec1 = new Tecnico("Juan","Martin","jmartin","1234","electronica");
		Tecnico tec2 = new Tecnico("Pedro","Rodriguez","prodriguez","1234","mecanica");
		Tecnico tec3 = new Tecnico("Carlos","Fernandez","cfernandez","1234","mecanica");
		Tecnico tec4 = new Tecnico("Jose","Ruiz","jruiz","1234","quimica");
		Tecnico tec5 = new Tecnico("Jorge","Perez","jperez","1234","electronica");
		
		sup1.setDomicilio(dom1);
		sup2.setDomicilio(dom2);
		sup3.setDomicilio(dom3);
		
		tec1.setDomicilio(dom4);
		tec2.setDomicilio(dom5);
		tec3.setDomicilio(dom6);
		tec4.setDomicilio(dom7);
		tec5.setDomicilio(dom8);
		
		Tarea t1 = new Tarea("Analisis");
		Tarea t2 = new Tarea("Documentacion");
		Tarea t3 = new Tarea("Prototipado");
		Tarea t4 = new Tarea("Preproduccion");
		Tarea t5 = new Tarea("Produccion");
		Tarea t6 = new Tarea("Analisis");
		Tarea t7 = new Tarea("Documentacion");
		Tarea t8 = new Tarea("Analisis");
		Tarea t9 = new Tarea("Preproduccion");
		Tarea t10 = new Tarea("Produccion");
		Tarea t11 = new Tarea("Analisis");
		Tarea t12 = new Tarea("Documentacion");
		Tarea t13 = new Tarea("Prototipado");
		Tarea t14 = new Tarea("Preproduccion");
		
		Date d = new Date(2006, 2, 26);
		Date d2 = new Date(2006, 2, 26);
		Date d3 = new Date(2006, 2, 26);
		Date d4 = new Date(2006, 2, 26);
//		DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
//		Date d  = (Date) dfm.parse("2006-02-26");
//		Date d2 = (Date) dfm.parse("2008-09-26");
//		Date d3 = (Date) dfm.parse("2009-02-26");
//		Date d4 = (Date) dfm.parse("2010-09-01");

		Proyecto p1 = new Proyecto("Descripcion1", d, d2,cli1,sup1);
		Proyecto p2 = new Proyecto("Descripcion2", d3, d4,cli2,sup2);
		Proyecto p3 = new Proyecto("Descripcion3", d, d3,cli3,sup3);
		Proyecto p4 = new Proyecto("Descripcion4", d2, d4,cli1,sup1);
		Proyecto p5 = new Proyecto("Descripcion5", d, d2,cli2,sup2);
		Proyecto p6 = new Proyecto("Descripcion6", d2, d3,cli3,sup3);
		Proyecto p7 = new Proyecto("Descripcion7", d2, d4,cli1,sup1);
		Proyecto p8 = new Proyecto("Descripcion8", d3, d4,cli2,sup2);
		Proyecto p9 = new Proyecto("Descripcion9", d, d4,cli3,sup3);
		Proyecto p10 = new Proyecto("Descripcion10", d, d3,cli1,sup1);

		sup1.agregarProyecto(p1);
		sup1.agregarProyecto(p4);
		sup1.agregarProyecto(p7);
		sup1.agregarProyecto(p10);
		sup2.agregarProyecto(p2);
		sup2.agregarProyecto(p5);
		sup2.agregarProyecto(p8);
		sup3.agregarProyecto(p3);
		sup3.agregarProyecto(p6);
		sup3.agregarProyecto(p9);

		p1.agregarTecnico(tec1);
		tec1.agregarProyecto(p1);
		p1.agregarTecnico(tec5);
		tec5.agregarProyecto(p1);
		p2.agregarTecnico(tec1);
		tec1.agregarProyecto(p2);
		p2.agregarTecnico(tec2);
		tec2.agregarProyecto(p2);
		p2.agregarTecnico(tec4);
		tec4.agregarProyecto(p2);
		p3.agregarTecnico(tec3);
		tec3.agregarProyecto(p3);
		p3.agregarTecnico(tec5);
		tec5.agregarProyecto(p3);
		p6.agregarTecnico(tec3);
		tec3.agregarProyecto(p6);
		p6.agregarTecnico(tec5);
		tec5.agregarProyecto(p6);
		p5.agregarTecnico(tec4);
		tec4.agregarProyecto(p5);
		p7.agregarTecnico(tec2);
		tec2.agregarProyecto(p7);
		p8.agregarTecnico(tec2);
		tec2.agregarProyecto(p8);
		p8.agregarTecnico(tec5);
		tec5.agregarProyecto(p8);
		p9.agregarTecnico(tec3);
		tec3.agregarProyecto(p9);
		p9.agregarTecnico(tec1);
		tec1.agregarProyecto(p9);
		p10.agregarTecnico(tec2);
		tec2.agregarProyecto(p10);
		p10.agregarTecnico(tec4);
		tec4.agregarProyecto(p10);
	
		p1.agregarTarea(t1);
		p2.agregarTarea(t8);
		p3.agregarTarea(t2);
		p4.agregarTarea(t6);
		p4.agregarTarea(t7);
		p5.agregarTarea(t3);
		p6.agregarTarea(t12);
		p6.agregarTarea(t13);
		p7.agregarTarea(t4);
		p8.agregarTarea(t11);
		p8.agregarTarea(t14);
		p9.agregarTarea(t5);
		p10.agregarTarea(t9);
		p10.agregarTarea(t10);    

		// -- Creando el Empleado y asignando los Atributos -- // 
		Empleado aEmpleado = new Empleado();
		aEmpleado.setNombre("Walter");
		aEmpleado.setApellido("Altamirano");
		aEmpleado.setUsuario("walter");
		aEmpleado.setPassword("*");

		// -- Creando el Domicilio -- //
		Domicilio aDomicilio = new Domicilio();
		aDomicilio.setCalle("Santiago del Estero");
		aDomicilio.setDepto("");
		aDomicilio.setLocalidad("Rio Gallegos");
		aDomicilio.setNumero(99);
		aDomicilio.setPiso(1);
		
		// -- Una vez instanciado / cargado el Domicilio, se le asigna al Empleado -- //
		aEmpleado.setDomicilio(aDomicilio);
		

		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			session.save(aEmpleado);
			session.save(cli1);
			session.save(cli2);
			session.save(cli3);
			session.save(sup1);
			session.save(sup2);
			session.save(sup3);
			

			session.flush();
			session.connection().commit();

			tx.commit();
			tx.begin();

			Query aQuery = session
					.createQuery("select p from unlp.demo.model.Empleado p");
			System.out.println("LISTADO DE EMPLEADOS \n\n " + aQuery.list());

			tx.commit();
			session.flush();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
			session.close();
		}
		session.disconnect();
	}

}
