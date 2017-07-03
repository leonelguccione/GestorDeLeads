package unlp.demo.model;

public class Domicilio {

	protected String calle;
	protected int numero;
	protected int piso;
	protected String depto;
	protected String localidad;

	public Domicilio(String calle, int numero, int piso, String depto,
			String localidad) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.depto = depto;
		this.localidad = localidad;
	}

	public Domicilio() {
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getDepto() {
		return depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public String toString() {
		
		return ("DOMICILIO \n ---------- \nCalle " + this.getCalle() + " numero " + this.getNumero() + "; \nPiso : " + this.getPiso() + "; Depto : " + this.getDepto() + "\nLocalidad : " + this.getLocalidad());
	}
	
}
