/**
 * Este paquete contiene clases que pertenecen a la capa de modelo de una aplicación de ejemplo.
 */
package unlp.demo.model;

/**
 * Las instancias de esta clase se utilizan para representar a las personas.
 * 
 * @author Javier Bazzocco javier.bazzocco@lifia.info.unlp.edu.ar
 * 
 */
public class Person {

	/**
	 * Es el nombre de la persona.
	 */
	protected String name;

	/**
	 * Es el apellido de la persona.
	 */
	protected String surname;

	/**
	 * Es el id de esta instancia.
	 */
	protected Long oid;
	
	protected Phone phone;

	/**
	 * Constructor.
	 */
	public Person() {
		this.setName("");
		this.setSurname("");
	}

	/**
	 * Getter.
	 * 
	 * @return el nombre de la persona.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Setter.
	 * 
	 * @param aName
	 *            es el nombre de la persona.
	 */
	public void setName(String aName) {
		this.name = aName;
	}

	/**
	 * Getter.
	 * 
	 * @return el apellido de la persona.
	 */
	public String getSurname() {
		return this.surname;
	}

	/**
	 * Setter.
	 * 
	 * @param aSurname
	 *            es el apellido de la persona.
	 */
	public void setSurname(String aSurname) {
		this.surname = aSurname;
	}

	/**
	 * Getter.
	 * 
	 * @return el id de esta instancia.
	 */
	public Long getOid() {
		return this.oid;
	}

	/**
	 * Setter.
	 * 
	 * @param anOid
	 *            es la identificación de esta instancia.
	 */
	public void setOid(Long anOid) {
		this.oid = anOid;
	}

	public Phone getPhone() {
		return this.phone;
	}

	public void setPhone(Phone aPhone) {
		this.phone = aPhone;
	}

}
