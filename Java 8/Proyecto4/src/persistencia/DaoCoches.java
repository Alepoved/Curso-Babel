package persistencia;

import java.util.ArrayList;

import modelo.entidades.Coche;

public class DaoCoches {
	
	private static ArrayList<Coche> listaCoches = new ArrayList<>();
	
	public int altaCoche(Coche c) {
		listaCoches.add(c);
		return 0;
	}

	public ArrayList<Coche> getListaCoches() {
		return listaCoches;
	}
	
}
