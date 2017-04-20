package modelo;

import java.util.Date;

public class Conversacion
{
    String descripcion;
    Date fecha;

    public Conversacion()
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
}
