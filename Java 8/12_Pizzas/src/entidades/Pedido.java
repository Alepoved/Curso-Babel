package entidades;

public class Pedido {

	private static int id = 0;
	private Pizza pizza;
	private String nombreUsuario;
	private String direccion;
	
	
	public Pedido(Pizza pizza, String nombreUsuario,String direccion) {
		this.pizza = pizza;
		this.nombreUsuario = nombreUsuario;
		this.direccion = direccion;
		this.id= id++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
}
