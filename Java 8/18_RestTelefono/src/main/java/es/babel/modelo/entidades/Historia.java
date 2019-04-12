package es.babel.modelo.entidades;


public class Historia {

	private String nombre;
	private String texto;
	
	public Historia() {}
	
	public Historia(String nombre, String texto) {
		this.nombre = nombre;
		this.texto = texto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "Historia [nombre=" + nombre + ", texto=" + texto + "]";
	}
	
	
	
	
}
