package EjemplosEncapsulamiento;

public class Persona {
	private String nombre; // variable de instancia privada
    public int edad; // variable de instancia pública
    protected double altura; // variable de instancia protegida

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    // métodos públicos para acceder a las variables privadas y protegidas
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected double getAltura() {
        return this.altura;
    }

    protected void setAltura(double altura) {
        this.altura = altura;
    }
	
}
