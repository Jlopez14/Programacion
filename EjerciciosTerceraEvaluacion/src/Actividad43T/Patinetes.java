package Actividad43T;


public class Patinetes extends Concesionario {

	//Insertamos las variables de la superclase
	
	private String Permisos;
	private boolean Bateria;
	
	//Constructor de la clase
	
	public Patinetes(String nombre, String telefono, String Permisos, boolean Bateria) {
		super(nombre,telefono);
		this.Permisos=Permisos;	
		this.Bateria=Bateria;
	}

	//Método Encender para utilizar el super
	public void Cargar() {
		System.out.println("El patinete se puede cargar o no");
	}

	 //Métodos de la clase

	public String getPermisos() {
		return Permisos;
	}

	public void setPermisos(String permisos) {
		Permisos = permisos;
	}

	public boolean getBateria() {
		return Bateria;
	}

	public void setBateria(boolean bateria) {
		Bateria = bateria;
	}	
}
