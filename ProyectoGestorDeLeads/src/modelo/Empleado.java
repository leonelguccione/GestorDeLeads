package modelo;

import java.util.Collection;

public class Empleado
{
  String apellido;
  String nombre;
  String dni;

  public Empleado()
  {

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
