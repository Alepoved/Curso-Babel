package entidades;

public class Videojuego {

	private int id;
	private String nombre;
	private String company;
	private double valoracion;
	private double precio;
	
	public Videojuego(String nombre, String company, double valoracion, double precio) {
		this.nombre = nombre;
		this.company = company;
		this.valoracion = valoracion;
		this.precio = precio;
	}
	
	public Videojuego(int id, String nombre, String company, double valoracion, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.company = company;
		this.valoracion = valoracion;
		this.precio = precio;
	}
	
	public Videojuego() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getValoracion() {
		return valoracion;
	}
	public void setValoracion(double valoracion) {
		this.valoracion = valoracion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", company=" + company + ", valoracion=" + valoracion
				+ ", precio=" + precio + "]";
	}
	
	
}
