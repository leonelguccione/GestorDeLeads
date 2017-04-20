package modelo;

import java.util.Date;


public class Tarea
{
    private EjecutivoDeCuentas responsable;
    private int nivelPrioridad;
    private String descripcion;
    private Date fechaAlta;
    private Date fechaCompromisoFinalizacion;
    private Date fechaFinalizacion;
    private Estado estado;

    /**
     * @aggregation composite
     */
    private Proyecto proyecto;
    
    public Tarea()
    {
        
    }

    public void setResponsable(EjecutivoDeCuentas responsable)
    {
        this.responsable = responsable;
    }

    public EjecutivoDeCuentas getResponsable()
    {
        return responsable;
    }

    public void setNivelPrioridad(int nivelPrioridad)
    {
        this.nivelPrioridad = nivelPrioridad;
    }

    public int getNivelPrioridad()
    {
        return nivelPrioridad;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setFechaAlta(Date fechaAlta)
    {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaAlta()
    {
        return fechaAlta;
    }

    public void setFechaCompromisoFinalizacion(Date fechaCompromisoFinalizacion)
    {
        this.fechaCompromisoFinalizacion = fechaCompromisoFinalizacion;
    }

    public Date getFechaCompromisoFinalizacion()
    {
        return fechaCompromisoFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion)
    {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Date getFechaFinalizacion()
    {
        return fechaFinalizacion;
    }

    public void setEstado(Estado estado)
    {
        this.estado = estado;
    }

    public Estado getEstado()
    {
        return estado;
    }

    public void setProyecto(Proyecto proyecto)
    {
        this.proyecto = proyecto;
    }

    public Proyecto getProyecto()
    {
        return proyecto;
    }
}
