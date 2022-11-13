package alumnos;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Alumno> {

	public ComparadorNombre() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getNombre().compareTo(a2.getNombre());
	}
	
}
