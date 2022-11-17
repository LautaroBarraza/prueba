package Comparadores;

import java.util.Comparator;

import alumnos.Alumno;

public class ComparadorAlumnoApellido implements Comparator<Alumno> {

	public ComparadorAlumnoApellido() {
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getApellido().compareTo(a2.getApellido());
	}

}
