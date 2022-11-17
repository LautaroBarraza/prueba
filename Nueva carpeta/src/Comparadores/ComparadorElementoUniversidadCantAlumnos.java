package Comparadores;

import java.util.Comparator;

import universidad.ElementoUniversidad;

public class ComparadorElementoUniversidadCantAlumnos implements Comparator<ElementoUniversidad>{

	public ComparadorElementoUniversidadCantAlumnos() {
	}

	@Override
	public int compare(ElementoUniversidad e1, ElementoUniversidad e2) {
		return e1.getCantidadAlumnos()-e2.getCantidadAlumnos();
	}

}
