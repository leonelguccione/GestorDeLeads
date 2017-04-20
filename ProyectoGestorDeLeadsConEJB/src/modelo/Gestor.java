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
    
    public Gestor()
    {
        
    }

    public void setTerceros(Collection<Tercero> terceros)
    {
        this.terceros = terceros;
    }

    public Collection<Tercero> getTerceros()
    {
        return terceros;
    }

    public void setEmpleados(Collection<Empleado> empleados)
    {
        this.empleados = empleados;
    }

    public Collection<Empleado> getEmpleados()
    {
        return empleados;
    }

    public void setProyectos(Collection<Proyecto> proyectos)
    {
        this.proyectos = proyectos;
    }

    public Collection<Proyecto> getProyectos()
    {
        return proyectos;
    }
}
