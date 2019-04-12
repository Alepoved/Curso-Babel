package es.babel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.babel.modelo.entidades.Historia;
import es.babel.modelo.gestor.GestorHistoria;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		GestorHistoria gp = context.getBean("gestorHistoria",GestorHistoria.class);
		System.out.println(gp.getHistoria());
		
	}

}
