package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

@Service
public class GestorPelicula {

	@Autowired
	@Qualifier("daoPelicula")
	private DaoPelicula daoPelicula;
	
	public boolean add(Pelicula p) {
		if(p.getTitulo().equalsIgnoreCase(""))
			return false;
		
		return daoPelicula.add(p);
	}
	
	public List<Pelicula> list(){
		return daoPelicula.list();
	}

	
}
