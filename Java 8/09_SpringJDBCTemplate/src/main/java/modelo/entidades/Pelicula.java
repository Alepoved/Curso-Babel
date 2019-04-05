package modelo.entidades;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pelicula {

	private int id;
	private String director;
	private String genero;
	private String titulo;
	private int year;
	
	
	public Pelicula() {}
	
	public Pelicula(int id, String director, String genero, String titulo, int year) {
		this.id = id;
		this.director = director;
		this.genero = genero;
		this.titulo = titulo;
		this.year = year;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", director=" + director + ", genero=" + genero + ", titulo=" + titulo + ", year="
				+ year + "]";
	}
	
	
}
