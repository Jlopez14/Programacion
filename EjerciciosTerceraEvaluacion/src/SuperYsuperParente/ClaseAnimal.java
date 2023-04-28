package SuperYsuperParente;

public class ClaseAnimal {
	public class Animal {
	    protected String nombre;  //Atributo

	    public Animal(String nombre) { //Clase Animal con nombre
	        this.nombre = nombre;
	    }

	    public void comer() {  //metodo comer
	        System.out.println("El animal está comiendo.");
	    }
	}

	public class Perro extends Animal { //Creamos la clase perro y hereda de animal
	    private String raza; //atributo

	    public Perro(String nombre, String raza) {
	        super(nombre);//Es una llamada al constructor de la clase animal
	        this.raza = raza;
	    }


	    public void comer() {
	        super.comer(); // llamada al método comer() de la clase Animal
	        System.out.println("El perro está comiendo.");
	    }
	}
}
