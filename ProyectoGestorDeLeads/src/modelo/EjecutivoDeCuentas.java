package modelo;

import java.util.Collection;
import java.util.HashSet;

public class EjecutivoDeCuentas
  extends Empleado
{

  /**
   * @associates <{modelo.TareaProgramada}>
   */
  private Collection<TareaProgramada> tareasProgramadas;

  public EjecutivoDeCuentas()
  {
    super();
    tareasProgramadas = new HashSet<TareaProgramada>();
  }
  
  public EjecutivoDeCuentas(Long id, String apellido, String nombre, String dni)
  {
    super(id,apellido,nombre,dni);
    tareasProgramadas = new HashSet<TareaProgramada>();
  }

  public void setTareasProgramadas(Collection<TareaProgramada> tareas)
  {
    this.tareasProgramadas = tareas;
  }

  public Collection<TareaProgramada> getTareasProgramadas()
  {
    return tareasProgramadas;
  }
  
  public void addTareaProgramada(TareaProgramada nuevaTareaProgramada)
  {
    this.tareasProgramadas.add(nuevaTareaProgramada);
  }
}
