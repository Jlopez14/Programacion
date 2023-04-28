package TiposHerencias;

public class HerenciaMultiple {

	public interface A {//Interface es una palabra reservada en java y es la unica forma de que haya herencia multiple en java
	    public void metodoA(); //Creamos el m�todo
	}

	public interface B {  //Interface es una palabra reservada en java y es la unica forma de que haya herencia multiple en java
	    public void metodoB(); //Creamos el m�todo
	}

	public class MiClase implements A, B { //Con el implements declaramos todos los m�todos puestos en interface
	    public void metodoA() { 
	        System.out.println("Metodo A");
	    }
	    
	    public void metodoB() {
	        System.out.println("Metodo B");
	    }
	}
}
