package modelo;

import java.util.Collection;

public class IngenieroDeClientes
  extends Empleado
{


  /**
   * @associates <{modelo.Tercero}>
   */
  private Collection<Tercero> tercero;


  public IngenieroDeClientes()
  {
    super();
  }
  
  public IngenieroDeClientes(Long id, String apellido, String nombre, String dni)
  {
    super(id,apellido,nombre,dni);
  }

  public void removeEjecutivo(String dni)
  {

  }
}
