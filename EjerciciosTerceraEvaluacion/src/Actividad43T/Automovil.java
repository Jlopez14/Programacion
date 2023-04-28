package Actividad43T;

public class Automovil extends Concesionario{
	
	//Insertamos las variables de la superclase
	private String marca;
	private String modelo;
	private int anno;
	private double precio;

	
	public Automovil(String nombre,String telefono, String marca, String modelo, int anno, double precio) {
		super(nombre,telefono);
		this.marca=marca;
		this.modelo=modelo;
		this.anno=anno;
		this.precio=precio;
	}

	//Métodos de la clase
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
