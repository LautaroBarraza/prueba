package universidad;

import java.util.ArrayList;

public class Alumno extends ElementoUniversidad{

	private String apellido;
	private int dni;
	private ArrayList<String> intereses;
	public Alumno(String nombre,String apellido, int dni) {
		super(nombre);
		this.apellido=apellido;
		this.dni=dni;
		this.intereses= new ArrayList<String>();		
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
	
	public int getCantidadAlumnos() {
		return 1;
	}
	
	public void addInteres(String i) {
		if(!this.intereses.contains(i)) {
			this.intereses.add(i);
		}
	}
	
	public ArrayList<String> getIntereses(){
		return new ArrayList<String>(intereses);
	}
	
	public String toString() {
		return this.getNombre()+" "+this.apellido;
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
