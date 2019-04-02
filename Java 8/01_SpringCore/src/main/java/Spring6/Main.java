package Spring6;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context = null;
	
	static {
		context = new ClassPathXmlApplicationContext("beans6.xml");
	}
	public static void main(String[] args) {
		Persona p = context.getBean("persona",Persona.class);
		System.out.println(p);
	}
}
