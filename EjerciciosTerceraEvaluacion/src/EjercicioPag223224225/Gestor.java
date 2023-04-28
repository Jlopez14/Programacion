package EjercicioPag223224225;

public class Gestor {

	public String nombre;
	private String tlf; //Es un numero con el que no se opera
	double importeMax; //visibilidad por defecto
	
	public Gestor(String nombre, String tlf, double importeMax) {
		this.nombre = nombre;
		this.tlf=tlf;
		this.importeMax=importeMax;
	}
	
	public Gestor(String nombre, String tlf) {
		this(nombre, tlf, 10000.0); //asignamos el importe máximo por defecto
	}
	
	String getTlf() {  //al ser tlf privado permite consultar el teléfono de un gestor
		return tlf;
	}
	void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Teléfono: " + tlf);
		System.out.println("Importe máximo: " + importeMax + " euros");
	}
	
}
