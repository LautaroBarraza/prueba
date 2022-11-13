package listaVinculada;

import java.util.Comparator;

public class OrdenarMultiple implements Comparator<Persona>{

	Comparator<Persona> c1, c2;
	public OrdenarMultiple(Comparator<Persona> c1, Comparator<Persona> c2) {
		this.c1=c1;
		this.c2=c2;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		int resultado = c1.compare(o1, o2);
		if(resultado==0) {
			return c2.compare(o1, o2);
		}else {
			return resultado;
		}
	}

}
