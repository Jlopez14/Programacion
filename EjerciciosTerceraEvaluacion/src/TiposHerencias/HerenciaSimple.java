package TiposHerencias;

public class HerenciaSimple extends PruebaSuperClass {
	
	public class Animal {  //Creamos la clase animal
	    private String nombre;  //Atriburos
	    
	    public Animal(String nombre) { //Clase Animal con nombre
	        this.nombre = nombre;
	    }
	    
	    public String getName() { //Metodo get del nombre
	        return nombre;
	    }
	}

	public class Perro extends Animal {  //Creamos la clase perro y hereda de animal
	    public Perro(String nombre) {
	        super(nombre); //Super es una palabra clave que se utiliza para hacer referencia alos miembros
	        //de la clase animal a la clase perro.
	    }
	    
	    public void ladrar() { 
	        System.out.println("Woof!");
	    }
	}
}
	