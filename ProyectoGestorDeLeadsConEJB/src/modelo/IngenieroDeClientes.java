package modelo;

import java.util.Collection;

public class IngenieroDeClientes extends Empleado
{
    /**
     * @associates <{modelo.EjecutivoDeCuentas}>
     * @aggregation shared
     */
    private Collection<EjecutivoDeCuentas> ejecutivos;
    
    public IngenieroDeClientes()
    {
        
    }

    public void setEjecutivos(Collection<EjecutivoDeCuentas> ejecutivos)
    {
        this.ejecutivos = ejecutivos;
    }

    public Collection<EjecutivoDeCuentas> getEjecutivos()
    {
        return ejecutivos;
    }
    
    public addEjecutivo(EjecutivoDeCuentas e)
    {
        ejecutivos.add(e);
    }
    
    public removeEjecutivo(String dni)
    {
        
    }
}
