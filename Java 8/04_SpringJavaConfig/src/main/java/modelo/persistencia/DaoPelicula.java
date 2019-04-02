package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import entidades.Pelicula;

@Repository //scope singleton
public class DaoPelicula {

	private List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
	
	public boolean add(Pelicula p) {
		return listaPeliculas.add(p);
	}
	
	public List<Pelicula> list() {
		return listaPeliculas;
	}
	
	
}
