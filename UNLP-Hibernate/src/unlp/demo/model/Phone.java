package unlp.demo.model;

public class Phone {

	protected Long oid;

	protected String number;

	public Phone() {
		this.setNumber("-");
	}

	public void setOid(Long anOId) {
		this.oid = anOId;
	}

	public Long getOid() {
		return this.oid;
	}

	public void setNumber(String aPhoneNumber) {
		this.number = aPhoneNumber;
	}

	public String getNumber() {
		return this.number;
	}
	
	public String toString() {
		return "Telefono con oid="+this.getOid()+" "+super.toString();
	}

}
