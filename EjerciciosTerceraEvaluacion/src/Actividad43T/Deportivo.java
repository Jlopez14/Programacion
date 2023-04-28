package Actividad43T;

public class Deportivo extends Automovil {
	//Insertamos las variables de la clase
	private double velocidadMaxima;
	private double acelereacion;
	
	//Constructor de la Clase
	public Deportivo(String nombre, String telefono, String marca, String modelo,int anno,double precio, double velocidadMaxima, double aceleracion) {
		
		super(nombre,telefono,marca,modelo,anno,precio); //Llamamos al constructor de la superClase Automovil
		this.velocidadMaxima=velocidadMaxima;
		this.acelereacion=aceleracion;
	}

	//métodos de la clase
	
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public double getAcelereacion() {
		return acelereacion;
	}

	public void setAcelereacion(double acelereacion) {
		this.acelereacion = acelereacion;
	}
}

