package proyectogestordeleads;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import modelo.Estado;

/**
 * To create ID generator table "TAREAS_ID_TAB_GEN":
 * CREATE TABLE "TAREAS_ID_TAB_GEN" ("PRIMARY_KEY_NAME" VARCHAR2(4000) PRIMARY KEY, "NEXT_ID_VALUE" NUMBER(38));
 *
 * To initialize this table with data for this entity's ID generator 'Tareas.id' (starting with value '0'):
 * INSERT INTO "TAREAS_ID_TAB_GEN" VALUES ('Tareas.id', 0);
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Tarea.findAll", query = "select o from Tarea o") })
@TableGenerator(name = "Tareas_Id_Tab_Gen", table = "TAREAS_ID_TAB_GEN", pkColumnName = "PRIMARY_KEY_NAME",
                pkColumnValue = "Tareas.id", valueColumnName = "NEXT_ID_VALUE")
@Table(name = "TAREAS")
public class Tarea implements Serializable
{
    private static final long serialVersionUID = 2608883545437045895L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Tareas_Id_Tab_Gen")
    private Integer id;
    @Version
    private Integer version;
    @ManyToOne
    private Proyecto proyecto;
    @ManyToOne
    private EjecutivoDeCuentas ejecutivoDeCuentas;
    private int nivelPrioridad;
    private String descripcion;
    private Date fechaAlta;
    private Date fechaCompromisoFinalizacion;
    private Date fechaFinalizacion;
    private Estado estado;
    
    public Tarea()
    {
    }

    public Integer getId()
    {
        return id;
    }

    public Integer getVersion()
    {
        return version;
    }

    public void setVersion(Integer version)
    {
        this.version = version;
    }

    public Proyecto getProyecto()
    {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto)
    {
        this.proyecto = proyecto;
    }

    public EjecutivoDeCuentas getEjecutivoDeCuentas()
    {
        return ejecutivoDeCuentas;
    }

    public void setEjecutivoDeCuentas(EjecutivoDeCuentas ejecutivoDeCuentas)
    {
        this.ejecutivoDeCuentas = ejecutivoDeCuentas;
    }
}
