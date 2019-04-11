package es.babel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import es.babel.modelo.entidades.Pelicula;
import es.babel.modelo.negocio.GestorPelicula;

/*
 * @Configuration-> esta clase esta preparada para llevar beans de spring 
 * 
 * @ComponentScan-> busca anotaciones de spring desde un package
 * 
 * @EnabledAutoConfiguration-> spring arranca la app, metiendo en el contenedor todos los beans
 * que necesite para que funcione. Le decimos que va a ser una app jpa(contiene dataSource)
 * Spring creara el objeto automaticamente
 * */
@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class DemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		
		Pelicula p1 = context.getBean("pelicula",Pelicula.class);
		p1.setTitulo("Mi gusanito :)"); p1.setDirector("Nolan");
		p1.setGenero("Miedo"); p1.setYear(2000);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		gp.create(p1);
		
		gp.create(context.getBean("peliculaSingleton",Pelicula.class));
		
		
		//System.out.println(gp.read(1));
		System.out.println(gp.list());
		
	}

}
