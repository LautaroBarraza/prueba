package alumnos;

import java.util.Comparator;

public class ComparadorApellido implements Comparator<Alumno> {

	public ComparadorApellido() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		// TODO Auto-generated method stub
		return a1.getApellido().compareTo(a2.getApellido());
	}

}
