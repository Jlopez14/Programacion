package ExplicacionClaseAbstraccion;

public class Circulo extends Figura {

	//Declaramos los atributos
	private double radio;
	 private double factorial;
	 
	 //Creamos un método donde asignamos los atributos area y factorial
	public Circulo(double radio, double factorial) {
		this.radio=radio;
		this.factorial=factorial;
	}
	
	public  double area() {  //Creamos la funcion area donde se calcula el area del circulo
		return Math.PI*radio*radio;
	}
	
	public double fact() {  // Creamos la funcion fact donde se realiza la factorizacion de un numero
		
		int fact=1;
		
		for(int i=1;i<=factorial;i++) {
			fact=fact*i;
		}
		return fact;
	}	
}


