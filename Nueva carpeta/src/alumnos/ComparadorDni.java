package alumnos;

import java.util.Comparator;

public class ComparadorDni implements Comparator<Alumno>{

	public ComparadorDni() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Alumno a1, Alumno a2) {
		// TODO Auto-generated method stub
		return a1.getDni()-a2.getDni();
	}

}
