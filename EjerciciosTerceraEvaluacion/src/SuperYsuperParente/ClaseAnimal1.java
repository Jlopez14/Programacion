package SuperYsuperParente;

public class ClaseAnimal1 {
	public class Animal{ //Clase Padre
		protected String name ; //Declaramos variable y encapsulamos
		
		public Animal(String name) { //Subclase
			this.name=name; //Usamos elthis para decir que estamos asignando a la misma variable de arriba
		}
		
		public void makeSound() { //Método de la clase animal
			System.out.println("El animal hace ruidos");
		}
	}
	
	public class Cat extends Animal { //Subclase que hereda de la clase animal
		private int age; //Atributo encapsulado
		
		public Cat(String name, int age) { //Constructor 
			super(name); //llamando al cosntructor de la clase padre
			this.age=age; //Esta asignando el age con el age 
		}
		
		public void makeSound() { //método 
			super.makeSound(); //llamada al método de la superclase
			System.out.println("El gato esta maullando");
		}
	}
}
