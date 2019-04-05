package Main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;

public class Main {

	private static ApplicationContext context;
	
	/*@Autowired
	private GestorPelicula gp = null;*/
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	public static void main(String[] args) {
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("Inception");
		p.setDirector("Nolan");
		p.setGenero("thriller");
		p.setYear(2015);
		
		//gp.create(p);
		
		p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("Star Wars");
		p.setDirector("Lucas");
		p.setGenero("science-fic");
		p.setYear(2016);
		
		//gp.create(p);
		
		p = context.getBean("pelicula",Pelicula.class);
		p.setTitulo("Pokemon");
		p.setDirector("Ash");
		p.setGenero("accion");
		p.setYear(2017);
		
		//gp.create(p);
		
		/*p.setId(1);
		p.setTitulo("Origen");*/
		
		gp.update(p);
		Pelicula p2 = gp.read(1);
		System.out.println(p2);
		System.out.println("Lista -> ");
		System.out.println(gp.list());
	}
}
