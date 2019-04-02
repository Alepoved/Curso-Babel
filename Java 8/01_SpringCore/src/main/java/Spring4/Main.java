package Spring4;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

private static ApplicationContext context = null;
	
	static {
		context = new ClassPathXmlApplicationContext("beans4.xml");
	}
	public static void main(String[] args) {
		Coche coche = context.getBean("coche",Coche.class);
		System.out.println(coche);
	}
}
