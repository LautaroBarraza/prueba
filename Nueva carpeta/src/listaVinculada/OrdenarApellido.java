package listaVinculada;

import java.util.Comparator;

public class OrdenarApellido implements Comparator<Persona>{

	public OrdenarApellido() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		return  p1.getApellido().compareTo(p2.getApellido());
	}

}
