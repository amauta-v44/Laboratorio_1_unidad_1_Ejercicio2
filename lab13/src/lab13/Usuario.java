package lab13;

import java.io.Serializable;


public class Usuario implements Serializable {

	private String nombre;
	private transient String password;
	
	public void Ususario (String nombre, String password) {
		this.nombre=nombre;
		this.password=password;
	}
	
	public String toString() {
		String pwd=(password==null)? "(n/a)":password;
		return "Información Usuario: \n Nombre: " +nombre+ "\nContraseña: "+pwd;
	}
}

