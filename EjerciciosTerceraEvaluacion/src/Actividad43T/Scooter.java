package Actividad43T;

public class Scooter extends Motocicletas {
	//Declaramos las variables
		private int Tama�o;
		
		//Constructor de la Clase
		public Scooter(String nombre, String telefono, String Color, String Carnet, int Tama�o) {
			super(nombre,telefono,Color,Carnet);
			this.Tama�o=Tama�o;
		}
		 //M�todos de la clase

		public int getTama�o() {
			return Tama�o;
		}

		public void setTama�o(int tama�o) {
			Tama�o = tama�o;
		}
}
