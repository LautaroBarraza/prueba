package Comparadores;

import java.util.Comparator;

import universidad.ElementoUniversidad;

public class ComparadorElementoUniversidadNombre implements Comparator<ElementoUniversidad> {

	public ComparadorElementoUniversidadNombre() {
	}

	@Override
	public int compare(ElementoUniversidad e1, ElementoUniversidad e2) {
		return e1.getNombre().compareTo(e2.getNombre());
	}

}
