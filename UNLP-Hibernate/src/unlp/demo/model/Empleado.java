package unlp.demo.model;

public class Empleado {

	protected long idEmpleado;
	protected String nombre;
	protected String apellido;
	protected String password;
	protected String usuario;
	public Domicilio domicilio;

	public Empleado() {
	}

	public Empleado(String nombre, String apellido, String usuario, String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.password = password;
		this.usuario = usuario;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String toString() {
		return (this.getApellido().toUpperCase() + " " + this.getNombre() + "\n" + this.getDomicilio().toString());
	}
	
	
	
}
