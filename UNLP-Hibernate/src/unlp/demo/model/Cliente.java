package unlp.demo.model;

public class Cliente
{

	protected long idCliente;
	protected String nombre;

	public Cliente()
	{

	}

	public Cliente(String nombre)
	{
		this.nombre = nombre;
	}

	public long getIdCliente()
	{
		return idCliente;
	}

	public void setIdCliente(long idCliente)
	{
		this.idCliente = idCliente;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

}
