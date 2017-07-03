package modelo;

import java.util.Collection;
import java.util.HashSet;

//import proyectogestordeleads.Proyecto;

public class Gestor
{
	private Long id_gestor;

	/**
	 * @associates <{modelo.Tercero}>
	 * @aggregation composite
	 */
	private Collection<Tercero> terceros = new HashSet<Tercero>();

	/**
	 * @associates <{modelo.Empleado}>
	 * @aggregation composite
	 */
	private Collection<Empleado> empleados = new HashSet<Empleado>();;

	public Gestor()
	{

	}

	public Long getId_gestor()
	{
		return id_gestor;
	}

	public void setId_gestor(Long id)
	{
		this.id_gestor = id;
	}

	public void setTerceros(Collection<Tercero> terceros)
	{
		this.terceros = terceros;
		System.out.println("Gestor.setTercero()--toString(): "+ terceros.toString());
	}

	public Collection<Tercero> getTerceros()
	{
		return terceros;
	}

	public void setEmpleados(Collection<Empleado> empleados)
	{
		this.empleados = empleados;
	}

	public Collection<Empleado> getEmpleados()
	{
		return empleados;
	}

	public void addTercero(Tercero nuevoTercero)
	{
		if (terceros != null)
		{
			terceros.add(nuevoTercero);
			System.out.println("Tercero.toString(): "+ terceros.toString());
		}
		else
		{
			System.out.println("Error en Gestor->addTercero()");
		}
	}

	public void addEmpleado(Empleado nuevoEmpleado)
	{
		this.empleados.add(nuevoEmpleado);
	}

	@Override
	public String toString()
	{
		return "Gestor [id_gestor=" + id_gestor + ", terceros=" + terceros + ", empleados=" + empleados + "]";
	}

}
