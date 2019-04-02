package Casa;

public class Habitacion {

	private String tipo;
	private double metrosCua;
	
	
	public Habitacion() {
	
	}
	public Habitacion(String t,double m) {
		this.tipo = t;
		this.metrosCua = m;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getMetrosCua() {
		return metrosCua;
	}
	public void setMetrosCua(double metrosCua) {
		this.metrosCua = metrosCua;
	}
	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", metrosCua=" + metrosCua + "]";
	}
	
}
