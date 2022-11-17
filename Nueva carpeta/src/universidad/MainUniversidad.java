package universidad;

import Comparadores.ComparadorElementoUniversidadCantAlumnos;
import Comparadores.ComparadorElementoUniversidadNombre;
import Comparadores.ComparadorInverso;
import listaVinculada.Lista;

public class MainUniversidad {

	public MainUniversidad() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		
		
		
		/////////////////////Primera estructura///////////////////
		ElementoCompuesto unicen = new ElementoCompuesto("unicen");
		ElementoCompuesto exactas = new ElementoCompuesto("exactas");
		ElementoCompuesto humanas = new ElementoCompuesto("humanas");
		ElementoCompuesto historia = new ElementoCompuesto("historia");
		
		Alumno john = new Alumno("john", "Doe", 1200000);
		john.addInteres("intercambio");
		
		
		Alumno federico = new Alumno("Federico", "Lopez", 35999888);
		federico.addInteres("redes");
		federico.addInteres("php");
		federico.addInteres("java");
		federico.addInteres("Python");
		
		Alumno juana = new Alumno("Juana", "Garcia", 27123455);
		juana.addInteres("programacion");
		juana.addInteres("php");
		juana.addInteres("java");
		
		Alumno flora = new Alumno("Flora","Rivas", 34555111);
		flora.addInteres("historia");
		flora.addInteres("antigua");
		
		Alumno martin = new Alumno("Martin","Gomez",34111222);
		martin.addInteres("romanos");
		martin.addInteres("egipcios");
		martin.addInteres("griegos");
		
		Alumno roman = new Alumno("Roman", "Bazan",32555111);
		roman.addInteres("argentina");
		
		Alumno mora = new Alumno("Mora", "Diaz", 37124425);
		mora.addInteres("psicologia");
		mora.addInteres("Freud");
		
		historia.addElemento(flora);
		historia.addElemento(martin);
		historia.addElemento(roman);
		
		humanas.addElemento(historia);
		humanas.addElemento(mora);
		
		exactas.addElemento(federico);
		exactas.addElemento(juana);
		
		unicen.addElemento(exactas);
		unicen.addElemento(humanas);
		unicen.addElemento(john);
		
		
		
		/////////////////////Segunda estructura///////////////////
		
		ElementoCompuesto olimpiada = new ElementoCompuesto("Olimpiadas Matematicas");
		ElementoCompuesto matea2 = new ElementoCompuesto("Matea2");
		ElementoCompuesto losfibo = new ElementoCompuesto("LosFibo");
		
		Alumno juan = new Alumno("Juan","Juarez",33222444);
		juan.addInteres("sucesiones");
		juan.addInteres("algebra");
		
		Alumno julio = new Alumno("Julio", "Cesar", 33222111);
		julio.addInteres("sucesiones");
		julio.addInteres("algebra");
		
		Alumno bernandino = new Alumno("Bernandino", "Rivas", 30987654);
		bernandino.addInteres("matematicas");
		
		Alumno jose = new Alumno("Jose","Paso", 33322112);
		jose.addInteres("problemas");
		
		Alumno isaac = new Alumno("Isaac","Newton",1234565);
		isaac.addInteres("sucesiones");
		
		matea2.addElemento(juan);
		matea2.addElemento(julio);
		
		losfibo.addElemento(bernandino);
		losfibo.addElemento(jose);
		losfibo.addElemento(isaac);
		
		olimpiada.addElemento(matea2);
		olimpiada.addElemento(losfibo);
		
		
		////////////////Universidad//////////////////////////
		
		ComparadorElementoUniversidadCantAlumnos c1 = new ComparadorElementoUniversidadCantAlumnos();
		ComparadorElementoUniversidadNombre c2 = new ComparadorElementoUniversidadNombre();
		
		ComparadorInverso<ElementoUniversidad> c3 = new ComparadorInverso<ElementoUniversidad>(c1);
		Lista<ElementoUniversidad> universidad = new Lista<ElementoUniversidad>(c3);
		
		universidad.add(unicen);
		universidad.add(olimpiada);
		
		System.out.println(universidad);
			
	}
	
}

