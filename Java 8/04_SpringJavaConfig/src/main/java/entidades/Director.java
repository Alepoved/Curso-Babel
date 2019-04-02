package entidades;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Director {

	
	/* Anotaciones -> 
	 * @Component -> Anotacion padre
	 * @Controller -> Logica de navegacion dentro de modelo
	 * @Service -> Objeto de negocio
	 * @Repository -> Objeto de persistencia
	 * */
	private int id;
	@Value("George Lucas")
	private String nombre;
	
	public Director() {}
	
	public Director(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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
	@Override
	public String toString() {
		return "Director [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
	
}
