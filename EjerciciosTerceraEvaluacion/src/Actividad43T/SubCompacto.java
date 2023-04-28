package Actividad43T;

public class SubCompacto extends Automovil{
	
	//Insertamos las variables de la clase
	private int peso;
	private int potencia;
	
	//Constructor de la Clase
	public SubCompacto(String nombre, String telefono, String marca, String modelo,int anno,double precio, int peso, int potencia) {
		
		super(nombre,telefono,marca,modelo,anno,precio);
		this.peso=peso;
		this.potencia=potencia;
	}


	//Métodos de la clase
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}	
}
