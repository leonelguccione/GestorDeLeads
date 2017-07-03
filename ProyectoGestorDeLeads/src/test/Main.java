package test;

import java.sql.Date;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;

import modelo.Conversacion;
import modelo.EjecutivoDeCuentas;
import modelo.Empleado;

import util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

import javassist.bytecode.Descriptor.Iterator;
import modelo.Gestor;
import modelo.Gestor_tx;
import modelo.IngenieroDeClientes;
import modelo.Necesidad;
import modelo.TareaProgramada;
import modelo.Tercero;
import modelo.Tipo;

public class Main
{
	public static void main(String[] args)
	{

		/*
		 * System.out.println("-----agregar Ingeniero"); addIngeniero();
		 * System.out.println("-----agregar Tercero"); addTercero();
		 * System.out.println("-----Asociar tercero con ingeniero");
		 * asociarTerceroConIngeniero();
		 * 
		 * System.out.println("-----agregar Necesidad");
		 * 
		 * addNecesidad(); System.out.println("-----agregar tarea programada");
		 * add_tareaProgramada_a_necesidad();
		 * System.out.println("-----agregar Ejecutivo"); add_ejecutivo();
		 * 
		 * asociar_tareaProgramada_ejecutivoDeCuentas();
		 * 
		 * add_conversacion();
		 */
		// agregar_empleados();
		listar_empleados();

	}

	public static void addIngeniero()
	{
		Gestor gestor = new Gestor_tx();
		IngenieroDeClientes ingeniero = new IngenieroDeClientes(new Long(1), "Perez", "Juan", "17982111");
		gestor.addEmpleado(ingeniero);
	}

	public static void add_ejecutivo()
	{
		Gestor_tx gestor = new Gestor_tx();
		EjecutivoDeCuentas ejecutivo = new EjecutivoDeCuentas(new Long(100), "Gutierrez", "Pedro", "11111111");
		gestor.addEmpleado(ejecutivo);

	}

	public static void agregar_empleados()
	{
		Gestor_tx gestor = new Gestor_tx();
		EjecutivoDeCuentas ejecutivo1 = new EjecutivoDeCuentas(new Long(101), "Gonzalez", "Julio", "11111112");
		gestor.addEmpleado(ejecutivo1);
		EjecutivoDeCuentas ejecutivo2 = new EjecutivoDeCuentas(new Long(102), "Gomez", "Mirko", "11111113");
		gestor.addEmpleado(ejecutivo2);
	}

	/**
	 * agrega un nuevo tercero al gestor. El tercero no debe tener
	 * IngenieroDeClientes asociado.
	 */
	public static void addTercero()
	{
		// Long id, String apellido, String nombre, String domicilio, String
		// dni, Tipo tipo
		Gestor gestor = new Gestor_tx();
		Tercero tercero = new Tercero(new Long(2), "Gonzalez", "jorge", "Mendoza 330", "12345678", Tipo.LEAD);
		gestor.addTercero(tercero);
	}

	public static void asociarTerceroConIngeniero()
	{
		Gestor_tx gestor = new Gestor_tx();
		gestor.asociarTerceroConIngeniero(new Long(2), new Long(1));

	}

	public static void addNecesidad()
	{
		Gestor_tx gestor = new Gestor_tx();
		@SuppressWarnings("deprecation")
		Date fecha = new Date(0, 0, 0);
		Necesidad necesidad = new Necesidad(new Long(1), "necesito un programa", fecha);
		gestor.addNecesidad(new Long(2), necesidad);
	}

	public static void add_tareaProgramada_a_necesidad()
	{
		Gestor_tx gestor = new Gestor_tx();
		Long id_necesidad = new Long(1);
		// public TareaProgramada(Long id, int nivelPrioridad, String
		// descripcion, Date fechaAlta, Date desde, Date hasta)
		@SuppressWarnings("deprecation")
		Date fecha_alta = new Date(0, 0, 0);
		@SuppressWarnings("deprecation")
		Date desde = new Date(0, 0, 1);
		@SuppressWarnings("deprecation")
		Date hasta = new Date(0, 0, 2);
		TareaProgramada nuevaTareaProgramada = new TareaProgramada(new Long(1), 1, "primer tarea", fecha_alta, desde,
				hasta);
		gestor.add_tareaProgramada_a_necesidad(id_necesidad, nuevaTareaProgramada);
	}

	public static void asociar_tareaProgramada_ejecutivoDeCuentas()
	{
		Gestor_tx gestor = new Gestor_tx();
		Long id_tareaProgramada = new Long(1);
		Long id_empleado = new Long(100);
		gestor.asociar_tareaProgramada_ejecutivoDeCuentas(id_tareaProgramada, id_empleado);
	}

	/**
	 * crear una nueva tarea programada asociada con su necesidad y Ejecutivo de
	 * cuentas Necesidad (1) <-------> (*) TareaProgramada TareaPrograma (*)
	 * <---> (*) EjecutivoDeCuentas
	 */
	public static void add_tareaProgramada()
	{
		// public void add_tareaProgramada(TareaProgramada nuevaTareaProgramada,
		// Long id_necesidad, Long id_Empleado)
		Gestor_tx gestor = new Gestor_tx();
		Long id_necesidad = new Long(1);

		// TODO: crear un ejecutivo de cuentas, que la tabla de empleados genere
		// sus ID_EMPLEADO

		Long id_empleado = new Long(2);
		// public TareaProgramada(Long id, int nivelPrioridad, String
		// descripcion, Date fechaAlta, Date desde, Date hasta)
		@SuppressWarnings("deprecation")
		Date fecha_alta = new Date(0, 0, 0);
		@SuppressWarnings("deprecation")
		Date desde = new Date(0, 0, 1);
		@SuppressWarnings("deprecation")
		Date hasta = new Date(0, 0, 2);
		TareaProgramada nuevaTareaProgramada = new TareaProgramada(new Long(1), 1, "primer tarea", fecha_alta, desde,
				hasta);
		gestor.add_tareaProgramada(nuevaTareaProgramada, id_necesidad, id_empleado); // ejecutivo
																						// de
																						// cuentas
	}

	public static void add_conversacion()
	{
		Conversacion nuevaConversacion = new Conversacion(new Long(1), "Primer Conversacion", new Date(0, 0, 4));
		// public void add_conversacion_a_necesidad(Conversacion
		// nuevaConversacion, Long id_necesidad)
		Long id_necesidad = new Long(1);
		Gestor_tx gestor = new Gestor_tx();
		gestor.add_conversacion_a_necesidad(nuevaConversacion, id_necesidad);
	}

	public static void listar_empleados()
	{
		int index = 0;

		Gestor_tx gestor = new Gestor_tx();
		List<Empleado> empleados = gestor.listar_empleados();
		while (index<empleados.size())
		{
			System.out.println(empleados.get(index));
			index++;

		}
	}

}
