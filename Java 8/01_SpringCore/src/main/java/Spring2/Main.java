package Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context = null;
	
	static {
		context = new ClassPathXmlApplicationContext("beans2.xml");
	}
	public static void main(String[] args) {
		Imprimir im = context.getBean("imprimible",Imprimir.class);
		im.imprimir("Me gusta quemar cosas");
	}
}
