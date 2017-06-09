
public class Persona {

	String nombre;
	int edad;
	int ci;
	String equipoDeFutbol;

	public Persona(String nombre, int edad, int ci, String equipoDeFutbol) {
		this.nombre = nombre;
		this.edad = edad;
		this.ci = ci;
		this.equipoDeFutbol = equipoDeFutbol;
	}

	public void mostrarInformacion() {
		System.out.println("Mi nombre es " + nombre + " tengo " + edad + " años" + ", con CI " + ci
				+ " y mi equipo de futbol es " + equipoDeFutbol);
	}
}
