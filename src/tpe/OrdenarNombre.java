package tpe;

import java.util.Comparator;

public class OrdenarNombre implements Comparator<Comparable> {

	public OrdenarNombre() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Comparable o1, Comparable o2) {
		// TODO Auto-generated method stub
		Persona p1 = (Persona)o1;
		Persona p2 = (Persona)o2;
		return  p1.getNombre().compareTo(p2.getNombre());
	}

}
