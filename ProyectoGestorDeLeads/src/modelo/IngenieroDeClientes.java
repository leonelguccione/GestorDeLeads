package modelo;

import java.util.Collection;

public class IngenieroDeClientes extends Empleado
{
    /**
     * @associates <{modelo.EjecutivoDeCuentas}>
     * @aggregation shared
     */
    private Collection<EjecutivoDeCuentas> ejecutivos;
}
