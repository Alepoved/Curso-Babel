package Main;

import java.util.List;

import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import cfg.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.PeliculaDao;

public class Main {

	private static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	public static void main(String[] args) {
		PeliculaDao daoPelicula = context.getBean("peliculaDao",PeliculaDao.class);

		Pelicula p = new Pelicula();
		p.setTitulo("La unica pelicula :)"); p.setDirector("Nolan");
		p.setGenero("Terror"); p.setYear(1969);
		daoPelicula.save(p);
		
		
		while(true) {
			p = new Pelicula();
			p.setTitulo("Scary Movie"); p.setDirector("Peter Jackson");
			p.setGenero("Animacion"); p.setYear(2001);
			daoPelicula.save(p);
			
		}
		/*p = new Pelicula();
		p.setTitulo("Toy Story"); p.setDirector("Peter Jackson");
		p.setGenero("Animacion"); p.setYear(2001);
		daoPelicula.save(p);*/
		
		//List<Pelicula> list = daoPelicula.findAll();
		//System.out.println(list);
	}
}
