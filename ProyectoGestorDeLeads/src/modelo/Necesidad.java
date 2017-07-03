package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import java.util.List;



public class Necesidad
{
	private Long id_necesidad;
	private String descripcion;
	private Date fecha;

	/**
	 * @associates <{modelo.Conversacion}>
	 * @aggregation composite
	 */
	private Collection<Conversacion> conversaciones = new HashSet<Conversacion>();

	/**
	 * @associates <{modelo.TareaProgramada}>
	 * @aggregation composite
	 */

	private Collection<TareaProgramada> tareasProgramadas = new HashSet<TareaProgramada>();

	public Necesidad()
	{
	}

	public Necesidad(Long id_necesidad, String descripcion, Date fecha)
	{
		this.id_necesidad = id_necesidad;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}

	public void setTareasProgramadas(Collection<TareaProgramada> tareasProgramadas)
	{
		this.tareasProgramadas = tareasProgramadas;
	}

	public Collection<TareaProgramada> getTareasProgramadas()
	{
		return tareasProgramadas;
	}

	public void addTareaProgramada(TareaProgramada tareaProgramada)
	{
		this.tareasProgramadas.add(tareaProgramada);
	}

	public void setConversaciones(Collection<Conversacion> conversaciones)
	{
		this.conversaciones = conversaciones;
	}

	public Collection<Conversacion> getConversaciones()
	{
		return conversaciones;
	}

	public void addConversacion(Conversacion conversacion)
	{
		this.conversaciones.add(conversacion);
	}

	public void setId_necesidad(Long id)
	{
		this.id_necesidad = id;
	}

	public Long getId_necesidad()
	{
		return id_necesidad;
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
		return "Necesidad [id_necesidad=" + id_necesidad + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", conversaciones=" + conversaciones + ", tareasProgramadas=" + tareasProgramadas + "]";
	}

}
