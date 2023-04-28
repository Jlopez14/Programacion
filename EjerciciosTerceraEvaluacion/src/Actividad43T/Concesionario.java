package Actividad43T;
//ADOLFO YO ESTUVE EL DÍA QUE HUBO MUSICOTE
//https://www.youtube.com/watch?v=jht07O7_R9w
abstract class Concesionario {
	//Insertamos las variables de la superclase
	private String nombre;
	protected String telefono;
	public String direccion;
	
	//Constructor de la superClase
	public Concesionario(String nombre, String telefono) {
		this.nombre=nombre;
		this.telefono=telefono;
	}

	//Métodos de la superclase
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre() {
		this.nombre=nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono() {
		this.telefono=telefono;
	}	
}


