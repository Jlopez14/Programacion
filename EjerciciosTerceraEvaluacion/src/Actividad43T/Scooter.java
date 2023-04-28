package Actividad43T;

public class Scooter extends Motocicletas {
	//Declaramos las variables
		private int Tamaño;
		
		//Constructor de la Clase
		public Scooter(String nombre, String telefono, String Color, String Carnet, int Tamaño) {
			super(nombre,telefono,Color,Carnet);
			this.Tamaño=Tamaño;
		}
		 //Métodos de la clase

		public int getTamaño() {
			return Tamaño;
		}

		public void setTamaño(int tamaño) {
			Tamaño = tamaño;
		}
}
