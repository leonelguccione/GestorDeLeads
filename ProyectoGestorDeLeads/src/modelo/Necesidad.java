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
}
