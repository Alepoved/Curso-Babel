package Spring4;

public class Coche {

	private String marca;
	private String matricula;
	private String modelo;
	
	
	public Coche() {
	}
	public Coche(String marca, String matricula, String modelo) {
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + "]";
	}
	
	
}
