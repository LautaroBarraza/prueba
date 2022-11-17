package Comparadores;

import java.util.Comparator;

import alumnos.Alumno;

public class ComparadorAlumnoDni implements Comparator<Alumno>{

	public ComparadorAlumnoDni() {
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		return a1.getDni()-a2.getDni();
	}

}
