package universidad;

import java.util.ArrayList;

public class Alumno extends ElementoUniversidad{

	private String nombre,apellido;
	private int dni,edad;
	private ArrayList<String> intereses;
	public Alumno(String nombre,String apellido, int edad, int dni) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.edad=edad;
		this.intereses= new ArrayList<String>();		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void addInteres(String i) {
		if(!this.intereses.contains(i)) {
			this.intereses.add(i);
		}
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
