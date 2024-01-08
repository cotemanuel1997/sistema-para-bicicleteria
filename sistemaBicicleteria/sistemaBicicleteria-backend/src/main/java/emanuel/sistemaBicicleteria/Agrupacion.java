package emanuel.sistemaBicicleteria;

import java.util.ArrayList;

public class Agrupacion {
	private ArrayList<String> actividades= new ArrayList<String>();
	private ArrayList<Profesor> profesores= new ArrayList<Profesor>();

	public void setActividad(String actividad) {
		actividades.add(actividad);
	}

	public void setProfesor(Profesor profesor) {
		profesores.add(profesor);
	}
}
