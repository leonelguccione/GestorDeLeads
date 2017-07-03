package modelo;

import java.util.Collection;
import java.util.HashSet;

public class IngenieroDeClientes extends Empleado
{
	/**
	 * @associates <{modelo.Tercero}>
	 */
	private Collection<Tercero> terceros = new HashSet<Tercero>();

	public IngenieroDeClientes()
	{
		super();
	}

	public IngenieroDeClientes(Long id, String apellido, String nombre, String dni)
	{
		super(id, apellido, nombre, dni);
	}

	public void addTercero(Tercero nuevoTercero)
	{
		terceros.add(nuevoTercero);
	}
	
	

	public Collection<Tercero> getTerceros()
	{
		return terceros;
	}

	public void setTerceros(Collection<Tercero> terceros)
	{
		this.terceros = terceros;
	}

	@Override
	public String toString()
	{
		return "IngenieroDeClientes [terceros=" + terceros + ", id_empleado=" + id_empleado + "]";
	}

}
