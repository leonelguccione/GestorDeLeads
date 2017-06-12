package modelo;

import java.util.Collection;
import java.util.Date;


public class Necesidad
{
  private Long id;
  private String descripcion;
  private Date fecha;

  /**
   * @associates <{modelo.Conversacion}>
   * @aggregation composite
   */
  private Collection<Conversacion> conversaciones;

  /**
   * @associates <{modelo.TareaProgramada}>
   * @aggregation composite
   */
  private Collection<TareaProgramada> tareasProgramadas;


  public Necesidad()
  {
  }

  public void setConversaciones(Collection<Conversacion> conversaciones)
  {
    this.conversaciones = conversaciones;
  }

  public Collection<Conversacion> getConversaciones()
  {
    return conversaciones;
  }

  public void setTareasProgramadas(Collection<TareaProgramada> tareasProgramadas)
  {
    this.tareasProgramadas = tareasProgramadas;
  }

  public Collection<TareaProgramada> getTareasProgramadas()
  {
    return tareasProgramadas;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public Long getId()
  {
    return id;
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

  
}
