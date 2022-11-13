package alumnos;

import java.util.ArrayList;

public class Alumno implements Comparable<Alumno> {

	String nombre,apellido;
	int dni,edad;
	ArrayList<String> intereses;
	public Alumno(String nombre,String apellido, int edad, int dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.edad=edad;
		this.intereses= new ArrayList<String>();		
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	protected int getDni() {
		return dni;
	}
	protected void setDni(int dni) {
		this.dni = dni;
	}
	protected int getEdad() {
		return edad;
	}
	protected void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void addInteres(String i) {
		if(!this.intereses.contains(i)) {
			this.intereses.add(i);
		}
	}
	@Override
	public int compareTo(Alumno o) {
		return this.nombre.compareTo(o.getNombre());
	}
	
	public String toString() {
		return this.nombre+" "+this.apellido+", ";
	}
	
	public boolean equals(Object obj) {
		try {
			Alumno a= (Alumno)obj;
			return this.getDni()==a.getDni();
		}catch(Exception e) {
			return false;
		}
	}

}
