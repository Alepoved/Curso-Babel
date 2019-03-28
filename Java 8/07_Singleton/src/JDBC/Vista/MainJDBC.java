package JDBC.Vista;

import JDBC.modelo.entidades.Persona;
import JDBC.negocio.GestorPersona;

public class MainJDBC {

	public static void main(String[] args) {
		
		GestorPersona gp = new GestorPersona();
		/*Persona p = new Persona("Homer",40,557);
		gp.create(p);
		p = new Persona("Marge",40,557);
		gp.create(p);
		p = new Persona("Lisa",40,557);
		gp.create(p);*/
		
		/*Persona p = new Persona("CambiarNombre",40,557);
		p.setNombre("Maggie");
		gp.update(p);*/
		
		System.out.println(gp.read(1));
		/*p = new Persona("Homer",40,557);
		gp.create(p);*/
		
		System.out.println("Lista personas ->");
		System.out.println(gp.list());
		/*gp.delete(1);
		gp.delete(2);
		gp.delete(3);*/
		
		
		
	}
}
