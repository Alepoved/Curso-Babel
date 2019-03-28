package JDBC.modelo.entidades;

public class Persona {

	private int id;
	private String nombre;
	private int edad;
	private double peso;
	
	
	public Persona(String nombre, int edad, double peso) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
	}
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	
	
}
