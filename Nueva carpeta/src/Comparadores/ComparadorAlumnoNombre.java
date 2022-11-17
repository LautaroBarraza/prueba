package Comparadores;

import java.util.Comparator;

import alumnos.Alumno;

public class ComparadorAlumnoNombre implements Comparator<Alumno> {

	public ComparadorAlumnoNombre() {
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getNombre().compareTo(a2.getNombre());
	}
	
}
