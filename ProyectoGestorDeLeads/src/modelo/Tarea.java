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
}
