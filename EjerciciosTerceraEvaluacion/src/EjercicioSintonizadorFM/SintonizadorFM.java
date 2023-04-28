package EjercicioSintonizadorFM;

public class SintonizadorFM {

	double frecuencia;
	
	//constructor que permite asignar una frecuencia inicial
	SintonizadorFM(double frecuenciaInicial){
		//la frecuencia inicial debe ebcobtrarse eb el rango 80-108
		
		if(frecuenciaInicial <80) {
			frecuencia =80; //MHz
		}
		else if(frecuenciaInicial > 108) {
			frecuencia =108; //MHz
		}
		else {
			frecuencia= frecuenciaInicial; 
		}
	}

	SintonizadorFM(){ //constructor
		this(80); //MHz. Frecuencia inicial por defecto
	}
	
	public double down() { 
		frecuencia -= 0.5; //bajamos la frecuencia 0.5 MHz
		comprobarRango(); //comprobamos su la nueva frecuencia esta en el rango permitido
		return(frecuencia);
	}
	
	public double up() {
		frecuencia += 0.5; //subimos la frecuencia
		comprobarRango();  // comprobamos el rango
		return(frecuencia);
	}
	
	public void display() {
		System.out.println("Sintonizando: " + frecuencia + " MHz"); //mostramos
	}
	//metodo de uso interno que se encarga de comprobar que la frecuencia se encuentra entre 80-108
	//En caso de que la frecuencia este fuera de rango la ajusta
	
	private void comprobarRango() {
		if(frecuencia<80) { //si al bajar la frecuencia es menor que el limite inferiro
			frecuencia=108;  //asignamos el limite superior
		}
		
		else if(frecuencia >108) { // si sobrepasamos el límite superior
			frecuencia=80; //colocamos la frecuencia en el valor menor
		}
	}
}
