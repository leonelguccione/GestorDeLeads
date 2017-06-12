package modelo;

import java.util.Collection;

public class Empleado
{
  protected Long id;
  private String apellido;
  private String nombre;
  private String dni;

  public Empleado()
  {

  }

  public Empleado(Long id, String apellido, String nombre, String dni)
  {
    this.id = id;
    this.apellido = apellido;
    this.nombre = nombre;
    this.dni = dni;
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

  public void setDni(String dni)
  {
    this.dni = dni;
  }

  public String getDni()
  {
    return dni;
  }
}
