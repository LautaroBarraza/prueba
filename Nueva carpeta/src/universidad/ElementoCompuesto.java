package universidad;

import java.util.ArrayList;


public class ElementoCompuesto extends ElementoUniversidad {

	ArrayList<ElementoUniversidad> elementos;
	public ElementoCompuesto() {
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
	
	

}
