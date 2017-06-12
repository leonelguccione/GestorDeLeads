package modelo;

import java.util.Date;

public class Conversacion
{
  private Long id;
  private String descripcion;
  private Date fecha;

  public Conversacion()
  {

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
