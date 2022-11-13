package tpe;

public class Persona implements Comparable<Persona>{
	String nombre;
	String apellido;
	public Persona(String nombre,String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public boolean equals(Object o) {
		try {
			Persona p = (Persona)o;
			return this.getNombre().equals(p.getNombre());
		}catch(Exception e) {
			return false;
		}
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
	
	public String toString() {
		return this.getNombre()+ ", "+ this.getApellido();
	}

}
