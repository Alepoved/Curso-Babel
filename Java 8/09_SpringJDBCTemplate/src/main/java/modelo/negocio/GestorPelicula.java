package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

@Service
public class GestorPelicula {

	@Autowired
	DaoPelicula daoPelicula;
	
	public int create(Pelicula p) {
		if(!p.getTitulo().equalsIgnoreCase("")) {
			return daoPelicula.create(p);
		}
		return -1;
	}
	public int update(Pelicula p) {
		if(p.getTitulo().equalsIgnoreCase("")) {
			return daoPelicula.update(p);
		}
		return -1;
	}
	public int delete(int id) {
		return daoPelicula.delete(id);
	}
	public Pelicula read(int id) {
		return daoPelicula.read(id);
	}
	public List<Pelicula> list() {
		return daoPelicula.list();
	}
	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}
	public void setDaoPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	
}
