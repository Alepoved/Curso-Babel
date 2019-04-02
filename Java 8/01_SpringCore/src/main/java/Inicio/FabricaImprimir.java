package Inicio;

public class FabricaImprimir {

	public static Imprimir crear(String tipo) {
		switch (tipo) {
		case "fichero":
			ImprimirFichero imf = new ImprimirFichero();
			return imf;
			
		case "pantalla":
			ImprimirPantalla imp = new ImprimirPantalla();
			return imp;

		default:
			
		}
		return null;
	}
}
