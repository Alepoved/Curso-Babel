package entidades;

public class Pedido {

	private Pizza pizza;
	private String nombreUsuario;
	private String direccion;
	private double precio;
	
	public Pedido() {}
	public Pedido(Pizza pizza, String nombreUsuario, String direccion) {
		this.pizza = pizza;
		this.nombreUsuario = nombreUsuario;
		this.direccion = direccion;
	}
	public Pizza getPizza() {
		return pizza;
	}
	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Pedido [pizza=" + pizza + ", nombreUsuario=" + nombreUsuario + ", direccion=" + direccion + ", precio="
				+ precio + "]";
	}
	
	
	
	
	
	
}
