package tpe;

import java.util.Comparator;

public class OrdenarNombre implements Comparator<Persona> {

	public OrdenarNombre() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return  p1.getNombre().compareTo(p2.getNombre());
	}

}
