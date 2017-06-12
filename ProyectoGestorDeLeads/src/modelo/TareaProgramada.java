package modelo;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;


public class TareaProgramada
{
  private Long id;
  private int nivelPrioridad;
  private String descripcion;
  private Date fechaAlta;
  private Date desde;
  private Date hasta;
  private Estado estado;

  /**
   * @associates <{modelo.EjecutivoDeCuentas}>
   */
  private Collection<EjecutivoDeCuentas> responsables;

  public TareaProgramada()
  {

  }

  public TareaProgramada(Long id, int nivelPrioridad, String descripcion, Date fechaAlta, Date desde, Date hasta)
  {
    this.id = id;
    this.nivelPrioridad = nivelPrioridad;
    this.descripcion = descripcion;
    this.fechaAlta = fechaAlta;
    this.desde = desde;
    this.hasta = hasta;
    this.estado = Estado.PENDIENTE;
    this.responsables = new HashSet();
  }


  public void setResponsable(Collection<EjecutivoDeCuentas> responsables)
  {
    this.responsables = responsables;
  }

  public Collection<EjecutivoDeCuentas> getResponsable()
  {
    return responsables;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public Long getId()
  {
    return id;
  }

  public void setNivelPrioridad(int nivelPrioridad)
  {
    this.nivelPrioridad = nivelPrioridad;
  }

  public int getNivelPrioridad()
  {
    return nivelPrioridad;
  }

  public void setDescripcion(String descripcion)
  {
    this.descripcion = descripcion;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setFechaAlta(Date fechaAlta)
  {
    this.fechaAlta = fechaAlta;
  }

  public Date getFechaAlta()
  {
    return fechaAlta;
  }

  public void setFechaCompromisoFinalizacion(Date fechaCompromisoFinalizacion)
  {
    this.desde = fechaCompromisoFinalizacion;
  }

  public Date getFechaCompromisoFinalizacion()
  {
    return desde;
  }

  public void setFechaFinalizacion(Date fechaFinalizacion)
  {
    this.hasta = fechaFinalizacion;
  }

  public Date getFechaFinalizacion()
  {
    return hasta;
  }

  public void setEstado(Estado estado)
  {
    this.estado = estado;
  }

  public Estado getEstado()
  {
    return estado;
  }
}
