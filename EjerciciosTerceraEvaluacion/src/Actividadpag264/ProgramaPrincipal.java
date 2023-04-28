package Actividadpag264;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		HoraExacta a=new HoraExacta(1,2,3);
		HoraExacta b=new HoraExacta(1,2,3);
		HoraExacta c=new HoraExacta(10,20,30);
		
		System.out.println(a.equals(b)); //son iguales
		System.out.println(a.equals(c)); //son distintas
	
	}
}
