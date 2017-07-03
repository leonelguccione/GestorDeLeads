package unlp.demo.model;

import java.sql.Date;

import java.util.HashSet;
import java.util.Collection;

public class Proyecto
{

  protected long idProyecto;
  protected String descripcion;
  protected Date fechaInicio;
  protected Date fechaFin;
  protected Cliente cliente;
  protected Supervisor supervisor;
  protected Collection<Tecnico> tecnicos;
  protected Collection<Tarea> tareas;

  public Proyecto(String descripcion, Date fechaInicio, Date fechaFin, Cliente cliente, Supervisor supervisor)
  {
    this.descripcion = descripcion;
    this.fechaInicio = fechaInicio;
    this.fechaFin = fechaFin;
    this.cliente = cliente;
    this.supervisor = supervisor;
    this.setTecnicos((Collection<Tecnico>) new HashSet<Tecnico>());
    this.setTareas((Collection<Tarea>) new HashSet<Tarea>());
  }

  public Proyecto()
  {

  }

  public Cliente getCliente()
  {
    return cliente;
  }

  public void setCliente(Cliente cliente)
  {
    this.cliente = cliente;
  }

  public Supervisor getSupervisor()
  {
    return supervisor;
  }

  public void setSupervisor(Supervisor supervisor)
  {
    this.supervisor = supervisor;
  }

  public long getIdProyecto()
  {
    return idProyecto;
  }

  public void setIdProyecto(long idProyecto)
  {
    this.idProyecto = idProyecto;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String descripcion)
  {
    this.descripcion = descripcion;
  }

  public Date getFechaInicio()
  {
    return fechaInicio;
  }

  public void setFechaInicio(Date fechaInicio)
  {
    this.fechaInicio = fechaInicio;
  }

  public Date getFechaFin()
  {
    return fechaFin;
  }

  public void setFechaFin(Date fechaFin)
  {
    this.fechaFin = fechaFin;
  }

  public void agregarTecnico(Tecnico tecnico)
  {
    this.tecnicos.add(tecnico);
  }

  public void agregarTarea(Tarea tarea)
  {
    this.tareas.add(tarea);
  }

  public Collection<Tecnico> getTecnicos()
  {
    return tecnicos;
  }

  public void setTecnicos(Collection<Tecnico> tecnicos)
  {
    this.tecnicos = tecnicos;
  }

  public Collection<Tarea> getTareas()
  {
    return tareas;
  }

  public void setTareas(Collection<Tarea> tareas)
  {
    this.tareas = tareas;
  }
}
