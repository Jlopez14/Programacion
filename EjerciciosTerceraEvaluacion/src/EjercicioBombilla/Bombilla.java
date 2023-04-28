package EjercicioBombilla;

public class Bombilla {

	public static boolean interruptorGeneral = true; //atributo estático
	private boolean interruptor; //interruptor(estado) que posee cada bombilla
	
	public Bombilla() {
		interruptor=false;//inicialmente la nueva bombilla está apagada
	}
	public void enciende() {
		interruptor =true; //activamos el interruptor (a true)
	}
	public void apaga() {
		interruptor= false; //descativamos el interruptor
	}
	public boolean estado() {
		return interruptorGeneral && interruptor;
		//El estado es true si el interruptor de la bombilla y el general estan activados
	}
	//Devuelve una cadena con el estado de la bombilla
	
	public String muestraEstado() {
		return estado() ? "Encendida" : "Apagada";
	}
}
