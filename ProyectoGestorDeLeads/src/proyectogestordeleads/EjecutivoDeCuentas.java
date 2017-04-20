package proyectogestordeleads;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "EjecutivoDeCuentas.findAll", query = "select o from EjecutivoDeCuentas o") })
public class EjecutivoDeCuentas extends Empleado implements Serializable
{
    private static final long serialVersionUID = -4099670439749132294L;
    @OneToMany(mappedBy = "ejecutivoDeCuentas")
    private List<Tarea> tareaList;

    public EjecutivoDeCuentas()
    {
    }

    public List<Tarea> getTareaList()
    {
        return tareaList;
    }

    public void setTareaList(List<Tarea> tareaList)
    {
        this.tareaList = tareaList;
    }
}
