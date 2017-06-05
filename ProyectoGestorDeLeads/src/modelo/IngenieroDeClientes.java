package modelo;

import java.util.Collection;

public class IngenieroDeClientes extends Empleado
{

  /**
   * @associates <{modelo.Proyecto}>
   */
  private Collection<Proyecto> proyectos;

  /**
   * @associates <{modelo.Proyecto}>
   * @aggregation shared
   */
 

  public IngenieroDeClientes()
    {
        
    }
   
    public void removeEjecutivo(String dni)
    {
        
    }
}
