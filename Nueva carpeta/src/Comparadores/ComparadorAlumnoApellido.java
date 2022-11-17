package Comparadores;

import java.util.Comparator;

import alumnos.Alumno;

public class ComparadorAlumnoApellido implements Comparator<Alumno> {

	public ComparadorAlumnoApellido() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		// TODO Auto-generated method stub
		return a1.getApellido().compareTo(a2.getApellido());
	}

}
