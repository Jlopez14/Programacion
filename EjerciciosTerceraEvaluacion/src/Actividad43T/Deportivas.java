package Actividad43T;

public class Deportivas extends Motocicletas {
	//Declaramos las variables
	private int cilindrada;
	
	//Constructor de la Clase
	public Deportivas(String nombre, String telefono, String Color, String Carnet, int cilindrada) {
		super(nombre,telefono,Color,Carnet);
		this.cilindrada=cilindrada;
	}
	//Métodos de la clase

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
}
