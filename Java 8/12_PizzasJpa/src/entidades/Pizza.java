package entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Entity
@Table(name="pizza")
public class Pizza {

	private List<String> ingredientes;
	private String tama�o;

	
	public Pizza() {}
	
	public Pizza(List<String> ingredientes, String tama�o) {
		this.ingredientes = ingredientes;
		this.tama�o = tama�o;
		
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
		return "Pizza [ingredientes=" + ingredientes + ", tama�o=" + tama�o + "]";
	}
	
}
