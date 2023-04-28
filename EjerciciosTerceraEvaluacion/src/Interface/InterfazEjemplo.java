package Interface;

/* La principal diferencia entre interface y abstract es que un interface 
proporciona un mecanismo de encapsulaci�n de los protocolos de los m�todos
sin forzar al usuario a utilizar la herencia.
*/

public class InterfazEjemplo {

	public static void main(String[] args) {
		
		Animal perro= new Perro();
		Animal gato = new Gato();
		
		//Llamar al m�todo hacer Sonido de 
		perro.hacerSonido();//Saca guau
		gato.hacerSonido(); //Saca mau
		
	}
}
