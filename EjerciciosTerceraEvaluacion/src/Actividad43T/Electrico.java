package Actividad43T;

public class Electrico extends Patinetes {

	//Insertamos las variables de la clase
	private int ruedas;
	
	//Constructor de la clase
	public Electrico(String nombre, String telefono, String Permisos, boolean Bateria, int ruedas) {
		super(nombre,telefono,Permisos,Bateria);
		this.ruedas=ruedas;
	}

	//Método encender de la clase patinete, que lo llamamos utilizando el super. En este caso nos dice que el patinete necesita cargarse
	public void Cargar() {
		super.Cargar();
		System.out.println("El patinente eléctrico necesita cargar");
	}
	
	////Métodos de la clase
	
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	

	
	

}
