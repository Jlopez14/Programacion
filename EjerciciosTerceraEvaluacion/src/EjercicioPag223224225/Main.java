package EjercicioPag223224225;

import EjercicioPag223224225.CuentaCorriente;
import EjercicioPag223224225.Gestor;

public class Main {

	public static void main(String[] args) {
	CuentaCorriente c1,c2,c3;
	//creamos dos gestores
		Gestor g1=new Gestor("Antonio Gonzáles", "666 555 444" );
		Gestor g2= new Gestor("Bea Rodríguez", "987 543 210", 12000.0);
	//creamos varias cuentas
		c1=new CuentaCorriente("12345678-A", "Pepita",g1); //cuenta administrada por g1
		c2=new CuentaCorriente("98765432-Z", "Ana", g1); //Otra cuenta de g1
		c3= new CuentaCorriente("1122333-b","Sancho",0); //cuenta sin gestor
		
		c1.mostrarInformacion();
		c2.mostrarInformacion();
		c3.mostrarInformacion();
		c1.setGestor(g2); //cambiamos de gestor
		c1.mostrarInformacion();
	}
}
