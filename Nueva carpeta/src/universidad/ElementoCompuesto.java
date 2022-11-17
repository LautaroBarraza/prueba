package universidad;

import java.util.ArrayList;


public class ElementoCompuesto extends ElementoUniversidad {

	ArrayList<ElementoUniversidad> elementos;
	public ElementoCompuesto(String nombre) {
		super(nombre);
		this.elementos= new ArrayList<ElementoUniversidad>();
	}
	@Override
	public int getCantidadAlumnos() {
		int cantidad=0;
		for(ElementoUniversidad e: elementos) {
			cantidad += e.getCantidadAlumnos();
		}
		return cantidad;
	}
	
	public void addElemento(ElementoUniversidad e) {
		this.elementos.add(e);
	}

	public String toString() {
		return this.getNombre();
	}
	
	

}
