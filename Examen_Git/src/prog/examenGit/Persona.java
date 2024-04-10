package prog.examenGit;

public class Persona {
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	
	/**
	 * Apellidos de la persona
	 */
	private String apellidos;
	
	/**
	 * Edad de la persona
	 */
	private int edad;
	
	/**
	 * Contructor - Crea a una persona
	 * @param nombre - Nombre de la persona
	 * @param apellidos - Apellidos de la persona
	 * @param edad - Edad de la persona
	 */
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	/**
	 * Suma 1 a la edad de la persona
	 * @return - Edad de la persona + 1
	 */
	public int cumpleaños() {
		return edad + 1;
	}
	
}
