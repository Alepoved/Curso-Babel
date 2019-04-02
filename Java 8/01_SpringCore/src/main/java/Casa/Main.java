package Casa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

private static ApplicationContext context = null;
	
	static {
		context = new ClassPathXmlApplicationContext("beansCasa.xml");
	}
	public static void main(String[] args) {
		Casa casa = context.getBean("casa",Casa.class);
		System.out.println(casa);
	}
}
