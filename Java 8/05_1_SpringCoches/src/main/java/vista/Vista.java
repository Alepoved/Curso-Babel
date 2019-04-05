package vista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cmp.CmpKm;
import cmp.CmpMarca;
import cmp.CmpMatricula;
import config.Configuracion;
import modelo.entidades.Coche;
import modelo.negocio.GestorCoches;


public class Vista {
	
	private Scanner sc = null;
	private GestorCoches ge = null;
	public static ApplicationContext context;
	
	
	static {
		context = new AnnotationConfigApplicationContext(Configuracion.class);
	}
	
	public void arrancar() {
		sc = new Scanner(System.in);
		//ge = new GestorCoches();
		ge = context.getBean("gestorCoches",GestorCoches.class);
		Coche c = null;
		List<Coche> listaCoches = null;
		int opcion = 0;
		do{
			opcion = mostrarMenu();
			switch (opcion) {
			case 1://alta
				 c = crearCoche();
				 int res = ge.alta(c);
				 if(res == -1)
						System.out.println("!!Matricula tiene que tener 7 caracteres");
				 else if(res == -2)
					 	System.out.println("!!Matricula ya registrada");
				break;
	
			case 2://listar
				listaCoches = ge.getListaCoches();
				mostrarListaCoches(listaCoches);
				break;
				
			case 3://listar matricula
				listaCoches = ge.getListaCoches();
				ordenarMatricula(listaCoches);
				break;
				
			case 4://listar marca
				listaCoches = ge.getListaCoches();
				ordenarMarca(listaCoches);
				break;
				
			case 5://listar km
				listaCoches = ge.getListaCoches();
				ordenarKm(listaCoches);
				break;
			}
			
			
			
		}while(opcion!=-1);
		
		System.out.println("Fin del programa");
	}

	private void ordenarKm(List<Coche> listaCoches) {
		//Collections.sort(listaCoches, new CmpKm());
		CmpKm cmpKm = context.getBean("cpmKm",CmpKm.class);//getBean=getInstance. Es singleton por defecto
		Collections.sort(listaCoches, cmpKm);
		System.out.println("Ordanada km -> ");
		for (Coche coche : listaCoches) {
			System.out.println(coche);
		}
	}

	private void ordenarMarca(List<Coche> listaCoches) {
		CmpMarca cmpMarca = context.getBean("cpmMarca",CmpMarca.class);
		//Collections.sort(listaCoches, new CmpMarca());
		Collections.sort(listaCoches, cmpMarca);
		System.out.println("Ordanada marcas -> ");
		for (Coche coche : listaCoches) {
			System.out.println(coche);
		}
	}

	private void ordenarMatricula(List<Coche> listaCoches) {
		CmpMatricula cmpMatricula = context.getBean("cpmMatricula",CmpMatricula.class);
		//Collections.sort(listaCoches, new CmpMatricula());
		Collections.sort(listaCoches, cmpMatricula);
		System.out.println("Ordanada matriculas -> ");
		for (Coche coche : listaCoches) {
			System.out.println(coche);
		}
	}

	private void mostrarListaCoches(List<Coche> listaCoches) {
		for (Coche coche : listaCoches) {
			System.out.println(coche);
		}		
	}

	private Coche crearCoche() {

		System.out.println("Introduzca matricula:");
		String matricula = sc.next();
		System.out.println("Introduzca marca:");
		String marca = sc.next();
		System.out.println("Introduzca modelo:");
		String modelo = sc.next();
		System.out.println("Introduzca km:");
		double km = sc.nextDouble();
		//return new Coche(matricula,marca,modelo,km);
		Coche c = context.getBean("coche",Coche.class);
		c.setMatricula(matricula);c.setMarca(marca);
		c.setModelo(modelo);c.setKm(km);
		return c;
	}

	
	private int mostrarMenu() {
		System.out.println("Introduzca la opcion que quiere realizar");
		System.out.println("1 - Alta coche");
		System.out.println("2 - Listar coches");
		System.out.println("3 - Ordenar por matricula");
		System.out.println("4 - Ordenar por marca");
		System.out.println("5 - Ordenar por km");
		System.out.println("-1 - Salir del programa");
		int opcion = sc.nextInt();
		return opcion;
	}
}
