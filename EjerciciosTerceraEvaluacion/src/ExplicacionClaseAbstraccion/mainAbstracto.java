package ExplicacionClaseAbstraccion;

public class mainAbstracto {

	public static void main(String[] args) {
	
				Circulo c=new Circulo(5,6); //Constructor del metodo Circulo de la clase Circulo insertando los valores a aplicar
				System.out.println("El �rea del circulo es: " + c.area()); // Imprimir por pantalla llamando al m�todo �rea
				c.mostrar();
				 System.out.println("El factorial es: " + c.fact());//Imprimir por pantalla la llamando al metodo factorial
			}
}
