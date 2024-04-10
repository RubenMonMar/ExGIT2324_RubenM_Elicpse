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
	
	
	
	public String getNombre() {
		return nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public int getEdad() {
		return edad;
	}



	/**
	 * Suma 1 a la edad de la persona
	 * @return - Edad de la persona + 1
	 */
	public int cumpleaños() {
		return getEdad() + 1;
	}
	
	/**
	 * Muestra por pantalla los datos de la persona
	 * @return - Devuelve los datos de la persona
	 */
	public String datosPersona() {
		return 	"Nombre: " + getNombre() + "Apellidos: " + getApellidos() + "Edad: " + cumpleaños();
	}
	
}
