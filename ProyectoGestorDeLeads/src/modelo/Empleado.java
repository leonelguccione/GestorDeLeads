package modelo;

import java.util.Collection;

public abstract class Empleado
{
  protected Long id_empleado;
  private String apellido;
  private String nombre;
  private String dni;

  public Empleado()
  {
    
  }

  public Empleado(Long id, String apellido, String nombre, String dni)
  {
    this.id_empleado = id;
    this.apellido = apellido;
    this.nombre = nombre;
    this.dni = dni;
  }

  public void setId_empleado(Long id)
  {
    this.id_empleado = id;
  }

  public Long getId_empleado()
  {
    return id_empleado;
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

@Override
public String toString()
{
	return "Empleado [id_empleado=" + id_empleado + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
			+ "]";
}
  
  
}
