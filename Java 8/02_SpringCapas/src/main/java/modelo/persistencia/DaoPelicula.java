package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import entidades.Pelicula;

public class DaoPelicula {

	private List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
	
	public boolean add(Pelicula p) {
		return listaPeliculas.add(p);
	}
	
	public List<Pelicula> list() {
		return listaPeliculas;
	}
	
	
}
