package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import entidades.Director;
import entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;

/*
 * Esta clase ba a llevar la creacion de beans de Spring
 * */
@Configuration
public class Configuracion {

	@Bean //este metodo crea un objeto en el contenedor de Spring
	@Scope("prototype")
	public Pelicula pelicula(Director director) {//autoWired al parametro director, si no existe director = null
		Pelicula p = new Pelicula();
		p.setDirector(director);
		return p;
	}
	
	@Bean //este metodo crea un objeto en el contenedor de Spring
	@Scope("prototype")
	public Director director() {
		Director d = new Director();
		d.setNombre("George Lucas");
		return d;
	}
	
	@Bean
	public GestorPelicula gestorPelicula(DaoPelicula daoPelicula) {
		GestorPelicula gp = new GestorPelicula();
		gp.setDaoPelicula(daoPelicula);
		return gp;
		
	}
	
	@Bean("daoPelicula")
	public DaoPelicula daoPelicula() {
		DaoPelicula daoPelicula = new DaoPelicula();
		return daoPelicula;
	}
}
