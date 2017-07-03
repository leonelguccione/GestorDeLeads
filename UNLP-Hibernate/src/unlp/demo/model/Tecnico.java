package unlp.demo.model;

import java.util.HashSet;
import java.util.Collection;

public class Tecnico extends Empleado {

	protected String especialidad;
	protected Collection<Proyecto> proyectos;
	
	public Tecnico(String nombre, String apellido, String usuario, String password, String especialidad) {
		super(nombre, apellido, usuario, password);
		this.especialidad = especialidad;
		this.setProyectos((Collection<Proyecto>) new HashSet<Proyecto>());
		// TODO Auto-generated constructor stub
	}
	public Tecnico(){
		
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public void agregarProyecto(Proyecto proyecto) {
		this.proyectos.add(proyecto);
	}

	public Collection<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(Collection<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}

}
