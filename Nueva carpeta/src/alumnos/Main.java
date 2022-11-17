package alumnos;
import java.util.Comparator;

import Comparadores.ComparadorAlumnoApellido;
import Comparadores.ComparadorAlumnoDni;
import Comparadores.ComparadorAlumnoMultiple;
import Comparadores.ComparadorAlumnoNombre;
import Comparadores.ComparadorInverso;
import listaVinculada.Lista;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		
		ComparadorAlumnoApellido c1 = new ComparadorAlumnoApellido();
		ComparadorAlumnoNombre c2 = new ComparadorAlumnoNombre();
		ComparadorAlumnoDni c3 = new ComparadorAlumnoDni();
		
		ComparadorAlumnoMultiple c4 = new ComparadorAlumnoMultiple(c1,c2);
		ComparadorAlumnoMultiple c5 = new ComparadorAlumnoMultiple(c4,c3);
		
		ComparadorInverso<Alumno> c6 = new ComparadorInverso<Alumno>(c5);
		
		Lista<Alumno> listaAlumno= new Lista<Alumno>(c5);
		
		Alumno a1 = new Alumno("juan", "perez", 20,43512854);
		Alumno a2 = new Alumno("roberto", "rodriguez", 20,43512222);
		Alumno a3 = new Alumno("matias", "diaz", 20,43512643);
		Alumno a4 = new Alumno("matias", "diaz", 24, 45897532);
		
		listaAlumno.add(a1);
		listaAlumno.add(a2);
		listaAlumno.add(a3);
		listaAlumno.add(a4);
		
		System.out.println(listaAlumno);
		
		
		//System.out.println(listaAlumno.find(a2));
		//listaAlumno.deleteAllOcurrences(a2);
		//System.out.println(listaAlumno);
		//System.out.println(listaAlumno.getSize());
		
		//System.out.println(listaAlumno.find(a1));
		
	}

}
