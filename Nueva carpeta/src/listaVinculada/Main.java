package listaVinculada;
import alumnos.*;

import java.util.Comparator;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Lista<Alumno> listaAlumno= new Lista<Alumno>();
		
		Alumno a1 = new Alumno("juan", "perez", 20,43512854);
		Alumno a2 = new Alumno("roberto", "rodriguez", 20,43512222);
		Alumno a3 = new Alumno("matias", "diaz", 20,43512643);
		
		listaAlumno.add(a1);
		listaAlumno.add(a2);
		listaAlumno.add(a3);
		
		System.out.println(listaAlumno);
		
		System.out.println(listaAlumno.find(a1));
		
	}

}