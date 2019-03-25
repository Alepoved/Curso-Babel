package clases;

public class Main {

	public static void main(String[] args) { //al ser un metodo estatico no puedes acceder con this
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
		
		p.setNumeroPersona(1);
		System.out.println("Numero de persona: "+p.getNumeroPersona());
		System.out.println(p);
		
		Main main = new Main();
		main.saludar();
}
	
	public void saludar() {
		System.out.println("Hola");
	}
	
	

	public static void modificarEdad(Persona p) {
		p.setEdad(77);
	}
	
	public static void crearObj() {
		Persona p2 = new Persona();
	}
}
