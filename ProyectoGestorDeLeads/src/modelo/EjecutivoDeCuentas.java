package modelo;

import java.util.Collection;

public class EjecutivoDeCuentas extends Empleado
{
    /**
   * @associates <{modelo.Tarea}>
   * @aggregation shared
   */
    private Collection<Tarea> tareas;
    
    public EjecutivoDeCuentas()
    {
        
    }

    public void setTareas(Collection<Tarea> tareas)
    {
        this.tareas = tareas;
    }

    public Collection<Tarea> getTareas()
    {
        return tareas;
    }
}
