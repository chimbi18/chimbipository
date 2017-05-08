package Mundo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class BaseDatos {

	private Conexion conexion;
	private Proyecto actual;
	private ArrayList<Color> colores;
	

	public BaseDatos() {
		super();

		colores= new ArrayList<>();
		colores.add(new Color(103, 188, 200));//Azul
		colores.add(new Color(153,50,204));//Morado
		colores.add(new Color(50,205,50));//Verde
		colores.add(new Color(237, 188, 99));//dorado
		colores.add(new Color(0,0,0));//
		colores.add(new Color(0,0,0));//
		colores.add(new Color(0,0,0));//
		colores.add(new Color(0,0,0));//
		colores.add(new Color(0,0,0));//
		colores.add(new Color(0,0,0));//
	}

	public ArrayList<String[]> consultarDatosInicialesProyectos() {

		return null;
	}

	public boolean seleccionarProyecto(int id) {

		actual = conexion.consultarProyecto(id);

		return true;
	}

	public boolean cambiarActividadConMayorPrioridad() {

		conexion.recalcularPrioridadActividad(actual.getID(), actual.getActividadMayorPrioridad().getID(), -1);
		Actividad actividad = conexion.consultarActividadMayorPrioridad(actual.getID());

		actual.setActividadMayorPrioridad(actividad);
		return true;
	}

	public void consultarActividad(int IDProyecto, int IDActividad) {

		Actividad act = conexion.consultarActividad(IDProyecto, IDActividad);

	}

	

	public void crearNuevaActividad(int prioridad, Date fechaInicio, Date fechaFin, String descripcion, String nombre,
			String temporalidad, int cantidadRepeticiones, int IDEstado, int IDCategoria) {

		
		conexion.crearNuevaActividad(prioridad, fechaInicio, fechaFin, descripcion, nombre, temporalidad,
				cantidadRepeticiones, IDEstado, IDCategoria);

	}

	public void eliminarActividad(int IDActividad) {

		conexion.borrarActividad(actual.getID(), IDActividad);

	}

	public void completarActividad(int IDActividad) {

		conexion.completarActividad(actual.getID(), IDActividad);

	}

	public void crearCategoria(String nombre, String descripcion, double peso) {

		int consecutivo = conexion.darConsecutivoCategoria();
		conexion.crearCategoria(consecutivo, nombre, descripcion, peso);
	}

	public void crearEstado(String nombre, String descripcion) {

		int consecutivo = conexion.darConsecutivoEstado();
		conexion.crearEstado(consecutivo, nombre, descripcion);
	}

	public void editarActividad(int IDActividad, int prioridad, Date fechaInicio, Date fechaFin, String descripcion,
			String nombre, String temporalidad, int cantidadRepeticiones, int IDEstado, int IDCategoria) {

		conexion.editarActividad(actual.getID(), IDActividad, prioridad, fechaInicio, fechaFin, descripcion, nombre,
				temporalidad, cantidadRepeticiones, IDEstado, IDCategoria);

	}

	public void crearNuevoProyecto(String nombre, Date fechaInicio, Date fechaFin, int IDGerente) {

		int consecutivo = conexion.darConsecutivoProyecto();
		conexion.crearNuevoProyecto( nombre, IDGerente, fechaInicio, fechaFin);

	}

	

	public void administrarTablaProyecto(boolean seCrea) {

		if (seCrea)
			conexion.crearTablaProyecto();
		else
			conexion.borrarTablaProyecto();

	}

	public void administrarTablaActividad(boolean seCrea) {

		if (seCrea)
			conexion.crearTablaActividad();
		else
			conexion.borrarTablaActividad();

	}

	public void administrarTablaGerente(boolean seCrea) {

		if (seCrea)
			conexion.crearTablaGerente();
		else
			conexion.borrarTablaGerente();

	}

	public void administrarTablaCategoria(boolean seCrea) {

		if (seCrea)
			conexion.crearTablaCategoria();
		else
			conexion.borrarTablaCategoria();

	}

	public void administrarTablaEstado(boolean seCrea) {

		if (seCrea)
			conexion.crearTablaEstado();
		else
			conexion.borrarTablaEstado();

	}

	public void filtrarActividades(int idProyecto, Date fechaVencimiento, String descripcion, int prioridad, int IDActividad) {

		ArrayList<Actividad> actividades = conexion.filtrarActividadesPorProyecto(idProyecto, fechaVencimiento, descripcion, prioridad, IDActividad);
		actual.setActividades(actividades);

	}

}
