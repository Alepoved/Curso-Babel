package herencia;

public class Jefe extends Empleado {

	public double incentivos;
	public static int numJefes = 0;
	
	public Jefe(String nombre, double salario,double i) {
		super(nombre,salario);
		this.incentivos = i;
	}

	public double getSalario(){
		return this.salario+this.incentivos;
		
	}
	
	public void setSalario(double s,double i) {
		this.salario= s;
		this.incentivos = i;
	}

	@Override
	public String toString() {
		return "Jefe [nombre=" + nombre + ", salario=" + getSalario() + ", incentivos=" + incentivos + "]";
	}

	
	
}
