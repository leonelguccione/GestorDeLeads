package proyectogestordeleads;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
import javax.persistence.TableGenerator;
import javax.persistence.Version;

/**
 * To create ID generator table "EMPLEADO_ID_TAB_GEN":
 * CREATE TABLE "EMPLEADO_ID_TAB_GEN" ("PRIMARY_KEY_NAME" VARCHAR2(4000) PRIMARY KEY, "NEXT_ID_VALUE" NUMBER(38));
 *
 * To initialize this table with data for this entity's ID generator 'Empleado.id' (starting with value '0'):
 * INSERT INTO "EMPLEADO_ID_TAB_GEN" VALUES ('Empleado.id', 0);
 */
@Entity
@Inheritance
@TableGenerator(name = "Empleado_Id_Tab_Gen", table = "EMPLEADO_ID_TAB_GEN", pkColumnName = "PRIMARY_KEY_NAME",
                pkColumnValue = "Empleado.id", valueColumnName = "NEXT_ID_VALUE")
public class Empleado implements Serializable
{
    private static final long serialVersionUID = 5489310268424912207L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Empleado_Id_Tab_Gen")
    private Integer id;
    @Version
    private Integer version;
    @OneToMany
    private List<Proyecto> proyectoList;
    private String apellido;
    private String nombre;
    private String dni;

    public Empleado()
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

    public List<Proyecto> getProyectoList()
    {
        return proyectoList;
    }

    public void setProyectoList(List<Proyecto> proyectoList)
    {
        this.proyectoList = proyectoList;
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

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getDni()
    {
        return dni;
    }
}
