package JDBC.negocio;

public class MainSingleton {

	public static void main(String[] args) {
		ObjetoSingleton os = ObjetoSingleton.getInstance();
		os.setNombre("Beatriz");
		imprimirNombre();
	}

	private static void imprimirNombre() {//no se pasa os como parametro
		System.out.println(ObjetoSingleton.getInstance().getNombre());
		//podemos acceder al objeto en cualquier momento con la instancia
	}
}
