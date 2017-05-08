package Mundo;

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {

	private int ID;
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private Gerente gerente;
	private ArrayList<Actividad> actividades;
	private Actividad actividadMayorPrioridad;

	public Proyecto(int iD, String nombre, Date fechaInicio, Date fechaFin, Gerente gerente,
			Actividad actividadMayorPrioridad) {
		super();
		ID = iD;
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.gerente = gerente;
		this.actividades = new ArrayList<>();
		this.actividadMayorPrioridad = actividadMayorPrioridad;

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

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public ArrayList<Actividad> getActividades() {
		return actividades;
	}

	public Actividad getActividadMayorPrioridad() {
		return actividadMayorPrioridad;
	}

	public void setActividadMayorPrioridad(Actividad actividadMayorPrioridad) {
		this.actividadMayorPrioridad = actividadMayorPrioridad;
	}

	public void setActividades(ArrayList<Actividad> actividades) {
		this.actividades = actividades;
	}

}
