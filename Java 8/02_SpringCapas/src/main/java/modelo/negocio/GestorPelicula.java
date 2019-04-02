package modelo.negocio;

import java.util.List;

import entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPelicula {

	private DaoPelicula daoPelicula;
	
	public boolean add(Pelicula p) {
		if(p.getTitulo().equalsIgnoreCase(""))
			return false;
		
		return daoPelicula.add(p);
	}
	
	public List<Pelicula> list(){
		return daoPelicula.list();
	}

	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}

	public void setDaoPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
}
