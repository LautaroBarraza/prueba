package tpe;

import java.util.Comparator;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista<Persona> l= new Lista<Persona>();
		Comparator c = new OrdenarApellido();
		Comparator c1 = new OrdenarNombre();
		Comparator c2 = new OrdenarMultiple(c, c1);
		
		Persona p1 = new Persona("juan", "rodriguez");
		Persona p2 = new Persona("jero", "martinez");
		Persona p3 = new Persona("tomas", "martinez");
		Persona p4 = new Persona("simon", "barraza");
		Persona p5 = new Persona("lauta", "dybala");
		Persona p6 = new Persona("pepe", "messi");
		
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);
		l.add(p6);
	
		for(Comparable<Persona> p :l) {
			System.out.println(p);
		}
		System.out.println(l);
		
		l.ordenar(c2);
		l.delete(p2);
		System.out.println(l);
	
	}

}
