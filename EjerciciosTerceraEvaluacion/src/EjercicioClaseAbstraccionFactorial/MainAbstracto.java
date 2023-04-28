package EjercicioClaseAbstraccionFactorial;

import ExplicacionClaseAbstraccion.Circulo;

public class MainAbstracto {

	public static void main(String[] args) {
		Circulo c=new Circulo(5);
		System.out.println("El área del circulo es: " + c.area());
		c.mostrar();
	}
}
