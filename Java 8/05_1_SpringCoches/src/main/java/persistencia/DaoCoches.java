package persistencia;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import modelo.entidades.Coche;

@Repository
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
