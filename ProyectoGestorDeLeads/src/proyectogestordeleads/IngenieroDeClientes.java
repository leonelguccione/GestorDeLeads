package proyectogestordeleads;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "IngenieroDeClientes.findAll", query = "select o from IngenieroDeClientes o") })
public class IngenieroDeClientes extends Empleado implements Serializable
{
    private static final long serialVersionUID = 2559034040885689960L;
    @OneToMany
    private List<EjecutivoDeCuentas> ejecutivoDeCuentasList;

    public IngenieroDeClientes()
    {
    }

    public List<EjecutivoDeCuentas> getEjecutivoDeCuentasList()
    {
        return ejecutivoDeCuentasList;
    }

    public void setEjecutivoDeCuentasList(List<EjecutivoDeCuentas> ejecutivoDeCuentasList)
    {
        this.ejecutivoDeCuentasList = ejecutivoDeCuentasList;
    }
}
