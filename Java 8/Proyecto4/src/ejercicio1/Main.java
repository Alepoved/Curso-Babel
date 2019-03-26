package ejercicio1;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Persona> lista = new LinkedList<>();
		Persona p = new Persona();
		p.setNombre("Homer Simpson");
		p.setEdad(35);
		p.setPeso(65.7);
		lista.add(p);
		
		p = new Persona();
		p.setNombre("Marge Simpson");
		p.setEdad(35);
		p.setPeso(58.7);
		lista.add(p);
		
		p = new Persona();
		p.setNombre("Bart Simpson");
		p.setEdad(10);
		p.setPeso(45.2);
		lista.add(p);
		
		Persona p2 = new Persona();
		p2.setNombre("Bart Simpson");
		p2.setEdad(10);
		p2.setPeso(45.2);
		
		System.out.println("Lista -> "+lista);
		
		if(p.equals(p2))
			System.out.println("P y P2 son iguales");
		
		Collections.sort(lista);
		System.out.println("Lista ordenada(nombre)-> "+lista);
		
		Collections.sort(lista,new CmpPersonaEdad());
		
		Collections.sort(lista,new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		
		
	}
}
