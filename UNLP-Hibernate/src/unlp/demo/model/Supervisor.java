package unlp.demo.model;

import java.util.Collection;
import java.util.HashSet;

public class Supervisor extends Empleado {

	protected Collection<Proyecto> proyectos;
	
	public Supervisor(String nombre, String apellido, String usuario,
			String password) {
		super(nombre, apellido, usuario, password);
		this.setProyectos((Collection<Proyecto>) new HashSet<Proyecto>());
		// TODO Auto-generated constructor stub
	}

	public Supervisor() {
		
	}

	public Collection<Proyecto> getProyectos() {
		return proyectos;
	}

	public void setProyectos(Collection<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	public void agregarProyecto(Proyecto proyecto) {
		this.getProyectos().add(proyecto);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
