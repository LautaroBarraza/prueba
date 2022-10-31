package tpe;

import java.util.Comparator;

public class OrdenarApellido implements Comparator<Comparable>{

	public OrdenarApellido() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Comparable o1, Comparable o2) {
		// TODO Auto-generated method stub
		Persona p1 = (Persona)o1;
		Persona p2 = (Persona)o2;
		return  p1.getApellido().compareTo(p2.getApellido());
	}

}
