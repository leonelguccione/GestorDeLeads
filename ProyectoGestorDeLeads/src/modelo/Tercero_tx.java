package modelo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;

public class Tercero_tx extends Tercero
{
	Tercero tercero;

	public Tercero_tx()
	{
		tercero = new Tercero();
	}

	public Tercero_tx(Long id, String apellido, String nombre, String domicilio, String dni, Tipo tipo,
			IngenieroDeClientes ingenieroDeClientes)
	{
		tercero = new Tercero(id, apellido, nombre, domicilio, dni, tipo, ingenieroDeClientes);
	}
	
	public Tercero_tx(Long id, String apellido, String nombre, String domicilio, String dni, Tipo tipo)
	{
		//Long id, String apellido, String nombre, String domicilio, String dni, Tipo tipo
		tercero = new Tercero(id, apellido,  nombre, domicilio, dni, tipo);
	}

}
