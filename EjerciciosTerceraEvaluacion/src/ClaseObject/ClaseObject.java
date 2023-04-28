package ClaseObject;

import java.util.Objects;

public class ClaseObject extends fd {

	public class Persona { 
	    private String nombre; //Atributos
	    private int edad; //Atributos

	    public int hashCode() {   //Al usar el hashcode devuelve un valor hash único a los atributos nombre y edad
	        return Objects.hash(nombre, edad);
	    }
	}
}
	
	

