package entidades;

import java.util.List;

public class Pizza {

	private List<String> ingredientes;
	private String tamaño;

	
	public Pizza() {}
	
	public Pizza(List<String> ingredientes, String tamaño) {
		this.ingredientes = ingredientes;
		this.tamaño = tamaño;
		
	}
	
	public List<String> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	

	@Override
	public String toString() {
		return "Pizza [ingredientes=" + ingredientes + ", tamaño=" + tamaño + "]";
	}
	
}
