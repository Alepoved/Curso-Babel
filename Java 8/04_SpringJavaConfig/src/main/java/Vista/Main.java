package Vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.Configuracion;
import entidades.Pelicula;
import modelo.negocio.GestorPelicula;


public class Main {

	public static ApplicationContext context;
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public static void main(String[] args) {
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		p.setTitulo("Star Wars 2");
		gp.add(p);
		//System.out.println(p);
		System.out.println(gp.list());
	}
	
}
