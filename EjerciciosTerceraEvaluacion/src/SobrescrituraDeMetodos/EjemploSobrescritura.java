package SobrescrituraDeMetodos;

/* -Modifica/extiende el comportamiento de los metodos heredados de una SuperClase
 * -Reutilazacion de código
 * -Implementar el polimorfismo en java
 * -Es una medida de seguridad
 * @Override se uitiliza antes del método que sobreescribimos
 */
public class EjemploSobrescritura {  //Clase padre
	
	private String nombre; //Atributo de la clase padre
	
	public EjemploSobrescritura(String nombre) { //Metodo 
		this.nombre=nombre; //usamos el this para llamar al atrributo de arriba
	}
	
	@Override
 	public String toString() {    //Usando el override comprombamos que todo ees correcto
		return "EjemploSobreescritura[nombre=" + nombre + "]";
	}
}
