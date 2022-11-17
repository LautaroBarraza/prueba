package listasprimitivas;

import Comparadores.ComparadorInverso;
import Comparadores.ComparadorString;
import listaVinculada.Lista;

public class MainListaString {

	public MainListaString() {
	}

	public static void main(String[] args) {

		ComparadorString c1 = new ComparadorString();
		
		Lista<String> l = new Lista<String>(c1);
		
		l.add("Facil");
		l.add("Es");
		l.add("Parcial");
		l.add("Prog2");
		
		for(String s:l) {
			System.out.println(s);
		}
		System.out.println("/////////////////////////////////////////////////");
		
		System.out.println(l.find("Parcial"));
		
		System.out.println(l.find("Recuperatorio"));
		
		
		System.out.println("////////////////////////////////////////////////////////");
		
		ComparadorInverso<String> c2 = new ComparadorInverso<String>(c1);
		l.setOrden(c2);
		
		for(String s:l) {
			System.out.println(s);
		}

	}

}
