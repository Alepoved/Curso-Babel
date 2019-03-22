package casas;

import java.util.ArrayList;
import java.util.List;

import clases.Direccion;
import clases.Persona;

public class Main {

	public static void main(String[] args) {
		
		Direccion d1 = new Direccion();
		d1.setNombreVia("Gran via");
		d1.setTipoVia("calle");
		d1.setCodigoPostal("28223");
		d1.setPais("España");
		
		Casa c1 = new Casa();
		c1.setDireccion(d1);
		c1.setEstaAlquilada(false);
		c1.setPrecio(600000);
		
		Persona prop = new Persona(1.70,"Pepe",45);
		
		c1.setPropietario(prop);
		Persona p1 = new Persona(1.60,"Maria",50);
		Persona p2 = new Persona(1.80,"Elena",35);
		Persona p3 = new Persona(1.90,"Raquel",40);
		List<Persona> list = new ArrayList<Persona>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		c1.setInquilinos(list);
		
		List<Habitacion> listH = new ArrayList<Habitacion>();
		Habitacion h1 = new Habitacion("doble",40);
		Habitacion h2 = new Habitacion("individual",20);
		listH.add(h1);
		listH.add(h2);
		c1.setHabitaciones(listH);
		
		System.out.println(c1);
		
		
	}
}
