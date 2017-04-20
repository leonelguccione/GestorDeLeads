package proyectogestordeleads;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

/**
 * To create ID generator table "GESTOR_ID_TAB_GEN":
 * CREATE TABLE "GESTOR_ID_TAB_GEN" ("PRIMARY_KEY_NAME" VARCHAR2(4000) PRIMARY KEY, "NEXT_ID_VALUE" NUMBER(38));
 *
 * To initialize this table with data for this entity's ID generator 'Gestor.id' (starting with value '0'):
 * INSERT INTO "GESTOR_ID_TAB_GEN" VALUES ('Gestor.id', 0);
 */
@Entity
@TableGenerator(name = "Gestor_Id_Tab_Gen", table = "GESTOR_ID_TAB_GEN", pkColumnName = "PRIMARY_KEY_NAME",
                pkColumnValue = "Gestor.id", valueColumnName = "NEXT_ID_VALUE")
public class Gestor implements Serializable
{
    private static final long serialVersionUID = -5860533684159860736L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Gestor_Id_Tab_Gen")
    private Integer id;
    @Version
    private Integer version;
    @OneToMany
    private List<Tercero> terceroList;
    @OneToMany
    private List<Empleado> empleadoList;
    @OneToMany
    private List<Proyecto> proyectoList;

    public Gestor()
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

    public List<Tercero> getTerceroList()
    {
        return terceroList;
    }

    public void setTerceroList(List<Tercero> terceroList)
    {
        this.terceroList = terceroList;
    }

    public List<Empleado> getEmpleadoList()
    {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList)
    {
        this.empleadoList = empleadoList;
    }

    public List<Proyecto> getProyectoList()
    {
        return proyectoList;
    }

    public void setProyectoList(List<Proyecto> proyectoList)
    {
        this.proyectoList = proyectoList;
    }
}
