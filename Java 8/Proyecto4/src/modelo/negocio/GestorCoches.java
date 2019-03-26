package modelo.negocio;

import java.util.ArrayList;

import modelo.entidades.Coche;
import persistencia.DaoCoches;

public class GestorCoches {
	
	private static ArrayList<String> listaAux = new ArrayList<>();
	
	public int alta(Coche c){
		
		if(c.getMatricula().length()!=7)return -1;
		else if(listaAux.contains(c.getMatricula()))return -2;
		
		listaAux.add(c.getMatricula());
		return new DaoCoches().altaCoche(c);
	}

	public ArrayList<Coche> getListaCoches() {
		return new DaoCoches().getListaCoches();
	}
	

}
