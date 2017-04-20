package modelo;

import java.util.Collection;

public class Tercero
{   
    private String apellido;
    private String nombre;
    private String domicilio;
    private String dni;


    /**
     * @associates <{modelo.Necesidad}>
     * @aggregation composite
     */
    private Collection<Necesidad> necesidades;
    private Tipo tipo;


    public Tercero()
    {
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setDomicilio(String domicilio)
    {
        this.domicilio = domicilio;
    }

    public String getDomicilio()
    {
        return domicilio;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getDni()
    {
        return dni;
    }

    public void setNecesidades(Collection<Necesidad> necesidades)
    {
        this.necesidades = necesidades;
    }

    public Collection<Necesidad> getNecesidades()
    {
        return necesidades;
    }
}
