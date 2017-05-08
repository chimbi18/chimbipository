package Mundo;

public class Gerente {

	private int ID;
	private String nombre;
	private int telefono;

	public Gerente(int iD, String nombre, int telefono) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
