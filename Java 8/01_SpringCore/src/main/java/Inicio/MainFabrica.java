package Inicio;

public class MainFabrica {

	public static void main(String[] args) {
		String mode = args[0];
		Imprimir i = FabricaImprimir.crear(mode);
		i.imprimir("En que año estamos??");
		/*if(mode.equals("1")) {
			ImprimirFichero imf = new ImprimirFichero();
			imf.imprimir("En que año estamos??");
		}else {
			ImprimirPantalla imp = new ImprimirPantalla();
			imp.imprimir("Cuanto es 1 + 1 ??");
		}*/
	}
}
