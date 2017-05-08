package Mundo;

import java.util.ArrayList;
import java.util.Date;

public class Actividad {

	private int ID;
	private int prioridad;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String nombre;
	private String temporalidad;
	private int cantidadRepeticiones;
	private Estado estado;
	private Categoria categoria;
	private ArrayList<Actividad> actividadesRequeridas;

	public Actividad(int iD, int prioridad, Date fechaInicio, Date fechaFin, String descripcion, String nombre,
			String temporalidad, int cantidadRepeticiones, Categoria categorias,
			ArrayList<Actividad> actividadesRequeridas) {
		super();
		ID = iD;
		this.prioridad = prioridad;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.temporalidad = temporalidad;
		this.cantidadRepeticiones = cantidadRepeticiones;
		this.categoria = categorias;
		this.actividadesRequeridas = actividadesRequeridas;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTemporalidad() {
		return temporalidad;
	}

	public void setTemporalidad(String temporalidad) {
		this.temporalidad = temporalidad;
	}

	public int getCantidadRepeticiones() {
		return cantidadRepeticiones;
	}

	public void setCantidadRepeticiones(int cantidadRepeticiones) {
		this.cantidadRepeticiones = cantidadRepeticiones;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategorias(Categoria categorias) {
		this.categoria = categorias;
	}

	public ArrayList<Actividad> getActividadesRequeridas() {
		return actividadesRequeridas;
	}

	public void setActividadesRequeridas(ArrayList<Actividad> actividadesRequeridas) {
		this.actividadesRequeridas = actividadesRequeridas;
	}

}
