package unlp.demo.model;

public class Tarea {
	
	protected long idTarea;
	protected String descripcion;
	
	public Tarea(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tarea(){
		
	}

	public long getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(long idTarea) {
		this.idTarea = idTarea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
