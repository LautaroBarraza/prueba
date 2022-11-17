package Comparadores;

import java.util.Comparator;

import alumnos.Alumno;

public class ComparadorAlumnoDni implements Comparator<Alumno>{

	public ComparadorAlumnoDni() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		// TODO Auto-generated method stub
		return a1.getDni()-a2.getDni();
	}

}
