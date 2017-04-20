package modelo;

import java.util.Collection;

public class Proyecto
{

    /**
     * @aggregation shared
     */
    private IngenieroDeClientes ingeniero;


    /**
     * @associates <{modelo.Conversacion}>
     * @aggregation composite
     */
    private Collection<Conversacion> conversaciones;

    /**
     * @associates <{modelo.Tarea}>
     * @aggregation composite
     */
    private Collection<Tarea> tareas;

    /**
     * @aggregation shared
     */
    private Necesidad necesidad;
    
    public Proyecto()
    {
        
    }

    public void setIngeniero(IngenieroDeClientes ingeniero)
    {
        this.ingeniero = ingeniero;
    }

    public IngenieroDeClientes getIngeniero()
    {
        return ingeniero;
    }

    public void setConversaciones(Collection<Conversacion> conversaciones)
    {
        this.conversaciones = conversaciones;
    }

    public Collection<Conversacion> getConversaciones()
    {
        return conversaciones;
    }

    public void setTareas(Collection<Tarea> tareas)
    {
        this.tareas = tareas;
    }

    public Collection<Tarea> getTareas()
    {
        return tareas;
    }

    public void setNecesidad(Necesidad necesidad)
    {
        this.necesidad = necesidad;
    }

    public Necesidad getNecesidad()
    {
        return necesidad;
    }

}
