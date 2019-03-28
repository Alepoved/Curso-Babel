package JDBC.negocio;

//Patron Singleton -> solo hay una instancia de un objeto en todo el programa
//Evita el gasto de procesamiento y de memoria al no crear varios objetos
//Se busca tener siempre acceso al objeto desde cualquier parte de la aplicacion
public class ObjetoSingleton {

	private static ObjetoSingleton instance = null;
	private String nombre;
	
	private ObjetoSingleton() {//constructor privado para evitar new() de la instancia
		super();
	}
	
	public static ObjetoSingleton getInstance() {
		if(instance == null)
			instance = new ObjetoSingleton();
		
		return instance;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
