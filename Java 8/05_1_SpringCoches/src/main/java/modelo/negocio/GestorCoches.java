package modelo.negocio;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import modelo.entidades.Coche;
import persistencia.DaoCoches;

@Service
public class GestorCoches {
	
	private static ArrayList<String> listaAux = new ArrayList<>();
	@Autowired
	@Qualifier("daoCoches")
	private DaoCoches daoCoches;
	
	public int alta(Coche c){
		
		if(c.getMatricula().length()!=7)return -1;
		else if(listaAux.contains(c.getMatricula()))return -2;
		
		listaAux.add(c.getMatricula());
		return daoCoches.altaCoche(c);
		//return new DaoCoches().altaCoche(c);
		
	}

	public ArrayList<Coche> getListaCoches() {
		//return new DaoCoches().getListaCoches();
		return daoCoches.getListaCoches();
	}
	

}
