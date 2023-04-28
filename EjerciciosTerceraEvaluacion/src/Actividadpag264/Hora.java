package Actividadpag264;

public class Hora {

	protected int hora, minutos; //Atributos protegidos, pensados para heredar
	
		Hora(int hora, int minutos){ //Constructor
			this.hora=0; //Valores por defecto
			this.minutos=0; //Valores por defecto
			
			if(!setHora(hora)) { //usamos metodos de asignacion, que comprueba los valores
				System.out.println("La hora es incorrecta");
			}
			if(!setMinutos(minutos)) {
				System.out.println("Los minutos no son válidos ");
			}
		}
	
	public void inc() { //incrementa la hora un minutos
		minutos ++;
		if(minutos >59) { //Compromabos si los minutos sobrepasan 59
			minutos=0; //Reiniciamos los minutos a 0
			hora++; //e incrementamos la hora 
			if(hora>23) {//si la hora es mayor a 23(No tiene sentido)
				hora =0; //Reiniciamos la hora a 0
			}
		}
	}	
		
	public boolean setMinutos(int minutos) {
		boolean correcto=false;
		if(0<=minutos && minutos <60) {//solo modificamos si el valor esta´em 0..59
			this.minutos =minutos;
			correcto=true;
		}
		return correcto;
	}
		
	public boolean setHora(int hora) {
		boolean correcto=false;
		if(0<=hora && hora<24) {//solo modificamos si el valor está en 0..23
			this.hora=hora;
			correcto=true;
		}
		return correcto;
	}
	@Override //indica que estamos sustituyendo (overriding) el método
	public String toString() {
		String result;
		result=hora + ":" + minutos;
		return result;
	}	
}


