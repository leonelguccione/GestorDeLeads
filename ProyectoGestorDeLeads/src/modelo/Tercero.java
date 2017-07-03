package modelo;

import java.util.Collection;
import java.util.HashSet;

public class Tercero
{
	private Long id;
	private String apellido;
	private String nombre;
	private String domicilio;
	private String dni;

	/**
	 * @associates <{modelo.Necesidad}>
	 * @aggregation composite
	 */
	private Collection<Necesidad> necesidades = new HashSet<Necesidad>();
	private Tipo tipo;
	private IngenieroDeClientes ingenieroDeClientes=null;

	public Tercero()
	{
	}

	public Tercero(Long id, String apellido, String nombre, String domicilio, String dni, Tipo tipo,
			IngenieroDeClientes ingenieroDeClientes)
	{
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.dni = dni;
		this.tipo = tipo;
		this.ingenieroDeClientes = ingenieroDeClientes;
	}

	public Tercero(Long id, String apellido, String nombre, String domicilio, String dni, Tipo tipo)
	{
		this.id = id;
		this.apellido = apellido;
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.dni = dni;
		this.tipo = tipo;
	}

	public void addNecesidad(Necesidad unaNecesidad)
	{
		this.necesidades.add(unaNecesidad);
	}

	public void setTipo(Tipo tipo)
	{
		this.tipo = tipo;
	}

	public Tipo getTipo()
	{
		return tipo;
	}

	public void setIngenieroDeClientes(IngenieroDeClientes ingenieroDeClientes)
	{
		this.ingenieroDeClientes = ingenieroDeClientes;
	}

	public IngenieroDeClientes getIngenieroDeClientes()
	{
		return ingenieroDeClientes;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

	public String getDomicilio()
	{
		return domicilio;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getDni()
	{
		return dni;
	}

	public void setNecesidades(Collection<Necesidad> necesidades)
	{
		this.necesidades = necesidades;
	}

	public Collection<Necesidad> getNecesidades()
	{
		return necesidades;
	}

	@Override
	public String toString()
	{
		return "Tercero [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio
				+ ", dni=" + dni + ", necesidades=" + necesidades + ", tipo=" + tipo;
	}

}
