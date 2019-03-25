package herencia;

public abstract class Empleado {

	protected String nombre;
	protected double salario;
	
	public Empleado() {}
	
	public Empleado(String n, double s) {
		this.nombre = n;
		this.salario = s;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", salario=" + salario + "]";
	}
	
}
