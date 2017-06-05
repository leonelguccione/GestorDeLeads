package modelo;

import java.util.Date;


public class Tarea
{
  /**
   * @aggregation shared
   */
  private EjecutivoDeCuentas ejecutivoDeCuentas;
  private int nivelPrioridad;
  private String descripcion;
  private Date fechaAlta;
  private Date fechaCompromisoFinalizacion;
  private Date fechaFinalizacion;
  private Estado estado;

  public Tarea()
  {

  }

  public void setEjecutivoDeCuentas(EjecutivoDeCuentas ejecutivoDeCuentas)
  {
    this.ejecutivoDeCuentas = ejecutivoDeCuentas;
  }

  public EjecutivoDeCuentas getEjecutivoDeCuentas()
  {
    return ejecutivoDeCuentas;
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
    this.fechaCompromisoFinalizacion = fechaCompromisoFinalizacion;
  }

  public Date getFechaCompromisoFinalizacion()
  {
    return fechaCompromisoFinalizacion;
  }

  public void setFechaFinalizacion(Date fechaFinalizacion)
  {
    this.fechaFinalizacion = fechaFinalizacion;
  }

  public Date getFechaFinalizacion()
  {
    return fechaFinalizacion;
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
