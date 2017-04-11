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
}
