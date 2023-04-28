package EjercicioSintonizadorFM;

public class Main {

	public static void main(String[] args) {
		//ejemplo de funcionamiento
		
		SintonizadorFM a,b;
		a= new SintonizadorFM(107);
		a.up(); a.up(); a.up(); a.up(); //subimos un total de 2 MHz
		
		a.display();// debe mostrar 80.5 MHz
		
		b=new SintonizadorFM(80.5);
		b.down(); b.down(); b.down(); //bajamos 1,5 MHz
		
		b.display(); //debe mostrar 107.5 MHz
		
		a=new SintonizadorFM(200); // frecuencia fuera de rango. Debe ajustarse
		a.display(); //debe mostrar 108.MHz
	}
}
