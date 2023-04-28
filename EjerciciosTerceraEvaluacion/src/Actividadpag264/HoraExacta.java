package Actividadpag264;

public class HoraExacta extends Hora{ //heredamos de la clase Hora
	protected int segundos; //añadimos un atributo para los segundos 
	public HoraExacta(int hora, int minutos, int segundos) {
		super(hora, minutos); //aprovechamos el constructor de la superclase
		this.segundos=segundos; //Permitiria asignar cualquier valor a los segundos
	if (!setSegundos(segundos)) { //mejor usar el método para asignar valores
		System.out.println("Segundos incorrectos ");
		}
	} 
//añadimos un método que asigna los segundos
	public boolean setSegundos(int segundos) {
		boolean correcto = false;
		if(0<=segundos && segundos<60) { //si está en un rango válido
			this.segundos=segundos; //modificamos los segundos
			correcto=true;
		}
		return correcto;
	}
	
	@Override //sustituimos el método para incrementar segundos en lugar de minutos
	public void inc() {
		segundos ++;
		if(segundos >59) { //si los segundos son mayores que 59
			segundos =0; //inicializamos los segundos
			super.inc(); // +1 con el método inc() de la superclase, que incrementa minutos
		}
	}
	
	@Override //sustituimos toString() para mostrar los segundos 
	public String toString() {
		String result = super.toString(); // utilizamos toString() de la superclase
		result += ":" + segundos; //añadimos lo segundos
		return result;
	}
	
	/*
	 * Reimplementaremos (Overriding) el método equals() heredado de la clas Object, para comparar dos horas, 
	 * que serán iguales sí sus horas, minutos y segundos son iguales
	 * La hora con la que tenemos que comparar se pasa com un objeto de la clase Object, que ttendremos que convertir
	 * (cast) a HoraExacta
	 */
	
	@Override 
	public boolean equals(Object o) {
		HoraExacta otroReloj = (HoraExacta) o; /*El mismo objeto está referenciado como Object
												(con el parámetro o) y como HoraExacta (con la variable otro reloj)
													*/
		boolean iguales;
		if(this.hora == otroReloj.hora //Si las horas son iguales
			&& this.minutos == otroReloj.minutos // y los minutos son iguales
				&& this.segundos == otroReloj.segundos) { //son iguales
			iguales = true; //son iguales
		}
		else {
			iguales = false; // no son iguales
		}
		return iguales;
	}
}
