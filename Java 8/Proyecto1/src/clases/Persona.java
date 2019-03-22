package clases;

public class Persona {

	private String nombre;
	private double altura;
	private int edad;
	private Direccion direccion;
	
	public Persona(double a, String n,int e) {
		this.altura = a;
		this.nombre = n;
		this.edad = e;
	}
	
	public Persona() {}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", edad=" + edad + ", direccion=" + direccion + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
