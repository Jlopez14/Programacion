package Actividad43T;

public class Familiar extends Automovil {

	//Insertamos las variables de la clase
	private int plazas;
	private boolean baca;
	
	//Constructor de la clase
	public Familiar(String nombre, String telefono, String marca, String modelo,int anno,double precio,int plazas, boolean baca) {
		super(nombre,telefono,marca,modelo,anno,precio);
		this.plazas=plazas;
		this.baca=baca;
	}

	//Métodos de la clase
	
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public boolean isBaca() {
		return baca;
	}

	public void setBaca(boolean baca) {
		this.baca = baca;
	}
}
