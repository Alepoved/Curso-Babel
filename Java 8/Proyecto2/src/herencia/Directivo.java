package herencia;

public class Directivo extends Empleado {

	public double extra;
	public static int numDirectivos = 0;
	
	public Directivo(String nombre, double salario) {
		super(nombre,salario);
	}

	public double getSalario(){
		//System.out.println("Num Empleados="+Trabajadores.numEmpleados);
		return this.salario+this.extra;
		
	}
	
	public void setSalario(double s,double e) {
		this.salario= s;
		this.extra = e*Trabajadores.numEmpleados;
	}

	@Override
	public String toString() {
		return "Directivo [nombre=" + nombre + ", salario=" + getSalario() + ", extra=" + this.extra + "]";
	}
	
	
	
}
