package modelo;

import java.util.Collection;

public class EjecutivoDeCuentas extends Empleado
{

  /**
   * @associates <{modelo.TareaProgramada}>
   */
  private Collection<TareaProgramada> tareasProgramadas;

  public EjecutivoDeCuentas()
    {
        
    }

    public void setTareas(Collection<TareaProgramada> tareas)
    {
        this.tareasProgramadas = tareas;
    }

    public Collection<TareaProgramada> getTareas()
    {
        return tareasProgramadas;
    }
}
