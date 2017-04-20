package proyectogestordeleads;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

/**
 * To create ID generator table "CONVERSACION_ID_TAB_GEN":
 * CREATE TABLE "CONVERSACION_ID_TAB_GEN" ("PRIMARY_KEY_NAME" VARCHAR2(4000) PRIMARY KEY, "NEXT_ID_VALUE" NUMBER(38));
 *
 * To initialize this table with data for this entity's ID generator 'Conversacion.id' (starting with value '0'):
 * INSERT INTO "CONVERSACION_ID_TAB_GEN" VALUES ('Conversacion.id', 0);
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Conversacion.findAll", query = "select o from Conversacion o") })
@TableGenerator(name = "Conversacion_Id_Tab_Gen", table = "CONVERSACION_ID_TAB_GEN", pkColumnName = "PRIMARY_KEY_NAME",
                pkColumnValue = "Conversacion.id", valueColumnName = "NEXT_ID_VALUE")
public class Conversacion implements Serializable
{
    private static final long serialVersionUID = -8640371135785687969L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Conversacion_Id_Tab_Gen")
    private Integer id;
    @Version
    private Integer version;

    private String descripcion;
    private Date fecha;

    public Conversacion()
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
