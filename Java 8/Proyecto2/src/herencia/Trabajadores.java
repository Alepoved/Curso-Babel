package herencia;

public class Trabajadores extends Empleado {

	public static int numEmpleados = 0;

	public Trabajadores() {
		numEmpleados++;
	}
	public Trabajadores(String nombre, double salario) {
		super(nombre,salario);
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
