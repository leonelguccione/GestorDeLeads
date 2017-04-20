package modelo;

import java.util.Date;


public class Necesidad
{
    private String descripcion;
    private Date fecha;

    /**
     * @aggregation composite
     */
    private Proyecto proyecto;

    /**
     * @aggregation shared
     */
    private Tercero tercero;

    public Necesidad()
    {
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setFecha(Date fecha)
    {
        this.fecha = fecha;
    }

    public Date getFecha()
    {
        return fecha;
    }

    public void setProyecto(Proyecto proyecto)
    {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto()
    {
        return proyecto;
    }

    public void setTercero(Tercero tercero)
    {
        this.tercero = tercero;
    }

    public Tercero getTercero()
    {
        return tercero;
    }
}
