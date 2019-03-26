package modelo.entidades;

public class Coche {

	private String matricula;
	private String marca;
	private double km;
	private String modelo;
	
	public Coche() {}
	
	public Coche(String mat,String mar,String mo,double km) {
		this.matricula = mat;
		this.marca = mar;
		this.km = km;
		this.modelo = mo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", marca=" + marca + ", km=" + km + ", modelo=" + modelo + "]";
	}
	
	
	
}
