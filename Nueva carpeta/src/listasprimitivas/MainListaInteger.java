package listasprimitivas;

import Comparadores.ComparadorInteger;
import listaVinculada.Lista;

public class MainListaInteger {

	public MainListaInteger() {
	}

	public static void main(String[] args) {
		
		ComparadorInteger c1 = new ComparadorInteger();
		
		Lista<Integer> l = new Lista<Integer>(c1);
		
		l.add(10);
		l.add(21);
		l.add(1);
		l.add(5);
		l.add(11);
		
		for(Integer i:l) {
			System.out.println(i);
		}
		System.out.println("///////////////////////////////////////////");
		
		l.delete(0);
		l.deleteAllOcurrences(5);
		l.deleteAllOcurrences(11);

		for(Integer i:l) {
			System.out.println(i);
		}
		System.out.println("///////////////////////////////////////////");
	}

}
