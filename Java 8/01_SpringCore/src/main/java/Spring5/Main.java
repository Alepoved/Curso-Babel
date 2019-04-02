package Spring5;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

private static ApplicationContext context = null;
	
	static {
		context = new ClassPathXmlApplicationContext("beans5.xml");
	}
	public static void main(String[] args) {
		List<String> lista = context.getBean("listaStrings",List.class);
		System.out.println(lista);
		
	}
}
