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
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

/**
 * To create ID generator table "PROYECTO_ID_TAB_GEN":
 * CREATE TABLE "PROYECTO_ID_TAB_GEN" ("PRIMARY_KEY_NAME" VARCHAR2(4000) PRIMARY KEY, "NEXT_ID_VALUE" NUMBER(38));
 *
 * To initialize this table with data for this entity's ID generator 'Proyecto.id' (starting with value '0'):
 * INSERT INTO "PROYECTO_ID_TAB_GEN" VALUES ('Proyecto.id', 0);
 */
@Entity
@NamedQueries({ @NamedQuery(name = "Proyecto.findAll", query = "select o from Proyecto o") })
@TableGenerator(name = "Proyecto_Id_Tab_Gen", table = "PROYECTO_ID_TAB_GEN", pkColumnName = "PRIMARY_KEY_NAME",
                pkColumnValue = "Proyecto.id", valueColumnName = "NEXT_ID_VALUE")
public class Proyecto implements Serializable
{
    private static final long serialVersionUID = 6479382224216811995L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Proyecto_Id_Tab_Gen")
    private Integer id;
    @Version
    private Integer version;
    @OneToOne
    private IngenieroDeClientes ingenieroDeClientes;
    @OneToMany(mappedBy = "proyecto")
    private List<Tarea> tareaList;
    @OneToOne
    private Necesidad necesidad;
    @OneToMany
    private List<Conversacion> conversacionList;

    public Proyecto()
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

    public IngenieroDeClientes getIngenieroDeClientes()
    {
        return ingenieroDeClientes;
    }

    public void setIngenieroDeClientes(IngenieroDeClientes ingenieroDeClientes)
    {
        this.ingenieroDeClientes = ingenieroDeClientes;
    }

    public List<Tarea> getTareaList()
    {
        return tareaList;
    }

    public void setTareaList(List<Tarea> tareaList)
    {
        this.tareaList = tareaList;
    }


    public Necesidad getNecesidad()
    {
        return necesidad;
    }

    public void setNecesidad(Necesidad necesidad)
    {
        this.necesidad = necesidad;
    }

    public List<Conversacion> getConversacionList()
    {
        return conversacionList;
    }

    public void setConversacionList(List<Conversacion> conversacionList)
    {
        this.conversacionList = conversacionList;
    }
}
