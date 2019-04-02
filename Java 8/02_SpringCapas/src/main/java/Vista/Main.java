package Vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entidades.Pelicula;
import modelo.negocio.GestorPelicula;


public class Main {

	public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public static void main(String[] args) {
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		gp.add(p);
		System.out.println(p);
	}
	
}
