package clases;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona();
		crearObj();
		
		p.setNombre("Ana");
		p.setAltura(1.69);
		p.setEdad(18);
		
		Persona p2 = new Persona();
		p2.setNombre("Maria");
		p2.setAltura(1.70);
		p2.setEdad(19);
		
		p=p2;
		p2.setEdad(20);
		
		System.out.println(p.getEdad());
		System.out.println(p2.getEdad());
		
		modificarEdad(p2);
		System.out.println(p.getEdad());
		
		System.out.println(p);
		
		Direccion d1 = new Direccion();
		d1.setNombreVia("Gran via");
		d1.setTipoVia("calle");
		d1.setCodigoPostal("28223");
		d1.setPais("Españita");
		
		p.setDireccion(d1);
		System.out.println(p);
}
	
	

	public static void modificarEdad(Persona p) {
		p.setEdad(77);
	}
	
	public static void crearObj() {
		Persona p2 = new Persona();
	}
}
