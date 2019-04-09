package entidades;

import java.util.List;

public class Pizza {

	private List<String> ingredientes;
	private String tama�o;
	private double precio;
	
	public Pizza() {}
	
	public Pizza(List<String> ingredientes, String tama�o) {
		this.ingredientes = ingredientes;
		this.tama�o = tama�o;
		this.precio = calculaPrecio();
	}
	private double calculaPrecio() {
		if(tama�o == "peque�o")precio=5;
		else if(tama�o == "mediano")precio=10;
		else precio=15;
		
		return precio+ingredientes.size()*2;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Pizza [ingredientes=" + ingredientes + ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}
	
}
