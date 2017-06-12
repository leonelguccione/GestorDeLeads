package modelo;

import java.util.Collection;

import proyectogestordeleads.Proyecto;

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

}
