package Spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Mensaje mensajeNoGestionado = new Mensaje();//objeto no gestionado por string
		Mensaje mensaje1 = context.getBean("mensaje1",Mensaje.class);
		mensaje1.setId(123);
		mensaje1.setContenido("Mira este contenido");
		mensaje1.setFirma("Alejandro P");
		
		System.out.println(mensaje1);
		funcion(context);
	}
	
	private static void funcion(ApplicationContext context) {
		Mensaje m1 = context.getBean("mensaje1",Mensaje.class);
		System.out.println(m1);
	}
}
