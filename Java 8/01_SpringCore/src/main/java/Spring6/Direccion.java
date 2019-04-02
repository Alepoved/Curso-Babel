package Spring6;

public class Direccion {

	private String tipoVia;
	private String nombreVia;
	private String codigoP;
	
	
	public Direccion() {}
	
	public Direccion(String tipoVia, String nombreVia, String codigoP) {
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.codigoP = codigoP;
	}
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCodigoP() {
		return codigoP;
	}
	public void setCodigoP(String codigoP) {
		this.codigoP = codigoP;
	}
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", codigoP=" + codigoP + "]";
	}
	
	
}
