package Comparadores;

import java.util.Comparator;

import alumnos.Alumno;

public class ComparadorAlumnoMultiple implements Comparator<Alumno>{

	Comparator<Alumno> c1, c2;
	public ComparadorAlumnoMultiple(Comparator<Alumno> c1, Comparator<Alumno> c2) {
		this.c1=c1;
		this.c2=c2;
	}

	@Override
	public int compare(Alumno o1, Alumno o2) {
		int result = c1.compare(o1, o2);
		if(result==0) {
			return c2.compare(o1, o2);
		}else {
			return result;
		}
	}

}
