package modelo;

import java.util.Date;

public class Conversacion
{
	private Long id_conversacion;
	private String descripcion;
	private Date fecha;

	public Conversacion()
	{

	}

	public Conversacion(Long id_conversacion, String descripcion, Date fecha)
	{
		super();
		this.id_conversacion = id_conversacion;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public void setId_conversacion(Long id)
	{
		this.id_conversacion = id;
	}

	public Long getId_conversacion()
	{
		return id_conversacion;
	}

	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}

	public String getDescripcion()
	{
		return descripcion;
	}

	public void setFecha(Date fecha)
	{
		this.fecha = fecha;
	}

	public Date getFecha()
	{
		return fecha;
	}

	@Override
	public String toString()
	{
		return "Conversacion [id_conversacion=" + id_conversacion + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ "]";
	}
	
	
}
