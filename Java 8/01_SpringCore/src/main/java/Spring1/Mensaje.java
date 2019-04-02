package Spring1;

public class Mensaje {

	private String contenido;
	private String firma;
	private int id;
	
	public Mensaje() {}
	
	public Mensaje(String contenido, String firma, int id) {
		this.contenido = contenido;
		this.firma = firma;
		this.id = id;
	}
	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getFirma() {
		return firma;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Mensaje [contenido=" + contenido + ", firma=" + firma + ", id=" + id + "]";
	}
	
	
	
	
}
