package Actividad43T;

public class Motocicletas extends Concesionario {
	
	//Insertamos las variables de la superclase
	private String Color;
	private String Carnet;
	
	//Constructor de la clase
	public Motocicletas(String nombre, String telefono, String Color, String Carnet) {
		super(nombre,telefono);
		this.Color=Color;
		this.Carnet=Carnet;
	}

 //Métodos de la clase
	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}


	public String getCarnet() {
		return Carnet;
	}


	public void setCarnet(String carnet) {
		Carnet = carnet;
	}	
}
