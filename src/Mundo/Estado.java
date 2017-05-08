package Mundo;

public class Estado {

	private int consecutivo;
	private String nombre;
	private String descripcion;

	public Estado(int consecutivo, String nombre, String descripcion) {
		super();
		this.consecutivo = consecutivo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getConsecutivo() {
		return consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
