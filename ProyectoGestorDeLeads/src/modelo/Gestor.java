package modelo;

import java.util.Collection;

public class Gestor
{
    /**
     * @associates <{modelo.Tercero}>
     * @aggregation composite
     */
    private Collection<Tercero> terceros;

    /**
     * @associates <{modelo.Empleado}>
     * @aggregation composite
     */
    private Collection<Empleado> empleados;

    /**
     * @associates <{modelo.Proyecto}>
     * @aggregation composite
     */
    private Collection<Proyecto> proyectos;
}
