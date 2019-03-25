package herencia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Directivo directivos[] = new Directivo[10];
	public static Jefe jefes[] = new Jefe[10];
	public static Trabajadores trabajadores[] = new Trabajadores[10];
	
	public static ArrayList<Empleado> lista = new ArrayList<>();

	public static void main(String[] args) {
		
		
		while(true) {
			menu();
		}
	}
	
	public static void menu() {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("0-Alta, 1-Listar, 2-Salir");
			opcion = sc.nextInt();
			
		}while(opcion<0 && opcion>3);
		
		switch(opcion) {
		case 0: alta();break;
		case 1: listar();break;
		case 2: {
			Scanner sc3 = new Scanner(System.in);
			String nombre = sc3.nextLine();
			baja(nombre);
			
		};break;
		}
	}

	private static void baja(String nombre) {
		boolean encontrado = false;int i = 0;
		while(!encontrado){
			if(lista.get(i).nombre == nombre)encontrado=true;
			i++;
		}
		lista.remove(i-1);
	}

	private static void listar() {
		/*System.out.println("----------");
		for (int i =0 ; i<Trabajadores.numEmpleados;i++) {
			System.out.println(trabajadores[i].toString());
		}
		System.out.println("----------");
		for (int i =0 ; i<Jefe.numJefes;i++) {
			System.out.println(jefes[i].toString());
		}
		for (int i =0 ; i<Directivo.numDirectivos;i++) {
			System.out.println(directivos[i].toString());
		}*/
		
		for (Empleado elem : lista) {
			System.out.println(elem.toString());
		}
		
	}

	private static void alta() {
		int tipo;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("0-Directivo, 1-Jefe, 2-Trabajador");
			tipo = sc.nextInt();
			
		}while(tipo<0 && tipo>2);
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Nombre:");
		String nombre = sc2.nextLine();
		System.out.println("Salario=base");
		double salario = sc2.nextDouble();
		
		
		if(tipo == 0) {
			directivos[Directivo.numDirectivos] = new Directivo(nombre,salario); 
			Directivo.numDirectivos++;
			lista.add(new Directivo(nombre,salario));
		}
		else if (tipo == 1) {
			System.out.println("Incentivo:");
			double incentivo = sc2.nextDouble();
			jefes[Jefe.numJefes] = new Jefe(nombre,salario,incentivo);
			Jefe.numJefes++;
			lista.add( new Jefe(nombre,salario,incentivo));
		}
		else {
			trabajadores[Trabajadores.numEmpleados++] = new Trabajadores(nombre,salario);
			Trabajadores.numEmpleados++;
			lista.add(new Trabajadores(nombre,salario));
		}
		
	}
	
	/*Trabajadores trabajadores[] = new Trabajadores[2];
	for (int i = 0; i < 2; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de trabajador");
		String nombre = sc.nextLine();
		System.out.println("Salario=base");
		double salario = sc.nextDouble();
		trabajadores[i] = new Trabajadores(nombre,salario);
	}
	
	System.out.println("----------");
	for (Trabajadores t : trabajadores) {
		System.out.println(t.toString());
	}
	
	Jefe jefes[] = new Jefe[2];
	for (int i = 0; i < 2; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de jefe");
		String nombre = sc.nextLine();
		System.out.println("Salario=base+incetivo");
		double salario = sc.nextDouble();
		jefes[i] = new Jefe(nombre,salario);
	}

	System.out.println("----------");
	for (Jefe jefe : jefes) {
		System.out.println(jefe.toString());
	}
	
	Directivo directivos[] = new Directivo[2];
	for (int i = 0; i < 2; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre de directivo");
		String nombre = sc.nextLine();
		System.out.println("Salario=base+incentivo*numEmpleados");
		double salario = sc.nextDouble();
		directivos[i] = new Directivo(nombre,salario);
	}
	
	for (Directivo d : directivos) {
		System.out.println(d.toString());
	}*/

}
