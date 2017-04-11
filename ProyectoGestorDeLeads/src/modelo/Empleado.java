package modelo;

import java.util.Collection;

public class Empleado
{
    String apellido;
    String nombre;
    String dni;
    /**
     * @associates <{modelo.Proyecto}>
     */
    private Collection<Proyecto> proyectos;
}
