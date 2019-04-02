package Spring3;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context = null;
	
	static {
		context = new ClassPathXmlApplicationContext("beans3.xml");
	}
	public static void main(String[] args) {
		//cada vez que pida una persona sera un new
		//el ciclo de vida de p1,p2,p3 depende de nosotros
		Persona p1 = context.getBean("personaBean",Persona.class);
		Persona p2 = context.getBean("personaBean",Persona.class);
		Persona p3 = context.getBean("personaBean",Persona.class);
		
		List listaPersonas = context.getBean("listaPersonas",List.class);
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		listaPersonas.add(p3);
		
		Persona carlos = context.getBean("carlos",Persona.class);
		System.out.println(carlos);
	}
}
