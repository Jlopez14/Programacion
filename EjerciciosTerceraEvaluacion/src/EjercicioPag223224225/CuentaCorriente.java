package EjercicioPag223224225;

public class CuentaCorriente {
	
	String dni;  //Sin modificador su visibilidad es por defecto. Visible para clases vecinas
	public String nombre2;  //Visibilidad total
	public double saldo;  //Invisible para cualquier clase DEBERIA SER PRIVATE PERO VAMOS A CAMBIARLO


	CuentaCorriente(String dni, double saldo){ //Constructor
		this.dni=dni;
		this.saldo=saldo;
		this.nombre2="Sin asignar";
	}
	
	CuentaCorriente(String dni, String nombre, double saldo){ //constructor
		this.dni=dni;
		this.nombre2=nombre;
		this.saldo=saldo;
	}
	
	static private String nombreBanco ="International Java Bank"; //Valor por defecto y se asigna antes de crear ningun objeto
	
	static void setBanco(String nuevoNombre) {
		nombreBanco =nuevoNombre;
	}
	static String getBanco() {
		return nombreBanco;
	}
	
	boolean egreso(double cant) { //sacar dinero de la cuenta corriente
		boolean operacionPosible;
		if(saldo>=cant) { //si disponemos de saldo suficiente
			saldo-=cant;
			operacionPosible =true;
		}
		else { //No hay saldo disponible
			System.out.println("No hay dinero suficiente");
			operacionPosible=false;
		}
		return(operacionPosible); //Indica si ha sido posibble realizar la operacion
	}

void ingreso(double cant) { //añadimos dinero a la cuenta corriente 
	saldo += cant;
	}	

Gestor gestor; //gestor que administra la cuenta
CuentaCorriente(String dni, String nombre, Gestor gestor){ //Sobrecargamos

	this.gestor=gestor;
}
//permite asignar un nuevo objeto Gestor a la cuenta
void setGestor(Gestor gestor) {
	this.gestor=gestor;
}

void mostrarInformacion() {  //muestra el estado de la cuenta corriente
	
	if(gestor == null) {
		System.out.println("Cuenta sin gestor");
	}
	
	else {
		System.out.println("Informacion del gestor");
		gestor.mostrarInformacion();
	}
	System.out.println("Informacion de la cuenta");
	System.out.println("Nombre: " + nombre2 );
	System.out.println("Dni: " + dni);
	System.out.println("Saldo: " + saldo + " euros");
	
	}	
}


