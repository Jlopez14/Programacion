package EjemplosEncapsulamiento;
import EjemplosEncapsulamiento.Persona; 

public class ClaseMain {

	public static void main(String[] args) {
		Persona persona = new Persona("Jose", 28, 1.86);
		System.out.println("Nombre: " + persona.getNombre()); // Nombre: Jose
        System.out.println("Edad: " + persona.edad); // Edad: 28
        System.out.println("Altura: " + persona.getAltura()); // Altura: 1.76

        persona.setNombre("Pablo");
        persona.edad = 54;
        persona.setAltura(1.74);

        System.out.println("Nombre: " + persona.getNombre()); // Nombre: Pablo
        System.out.println("Edad: " + persona.edad); // Edad: 54
        System.out.println("Altura: " + persona.getAltura()); // Altura: 1.74
	}
}
