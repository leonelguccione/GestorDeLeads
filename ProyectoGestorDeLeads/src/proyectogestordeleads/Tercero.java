package proyectogestordeleads;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

import modelo.Tipo;

/**
 * To create ID generator table "TERCERO_ID_TAB_GEN":
 * CREATE TABLE "TERCERO_ID_TAB_GEN" ("PRIMARY_KEY_NAME" VARCHAR2(4000) PRIMARY KEY, "NEXT_ID_VALUE" NUMBER(38));
 *
 * To initialize this table with data for this entity's ID generator 'Tercero.id' (starting with value '0'):
 * INSERT INTO "TERCERO_ID_TAB_GEN" VALUES ('Tercero.id', 0);
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Tercero.findAll", query = "select o from Tercero o") })
@TableGenerator(name = "Tercero_Id_Tab_Gen", table = "TERCERO_ID_TAB_GEN", pkColumnName = "PRIMARY_KEY_NAME",
                pkColumnValue = "Tercero.id", valueColumnName = "NEXT_ID_VALUE")
public class Tercero implements Serializable
{
    private static final long serialVersionUID = -699229909924683086L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Tercero_Id_Tab_Gen")
    private Integer id;
    @Version
    private Integer version;
    @OneToMany
    private List<Necesidad> necesidadList;

    private String apellido;
    private String nombre;
    private String domicilio;
    private String dni;
    private Tipo tipo;

    public Tercero()
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

    public List<Necesidad> getNecesidadList()
    {
        return necesidadList;
    }

    public void setNecesidadList(List<Necesidad> necesidadList)
    {
        this.necesidadList = necesidadList;
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

    public void setTipo(Tipo tipo)
    {
        this.tipo = tipo;
    }

    public Tipo getTipo()
    {
        return tipo;
    }
}
