package modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.entidades.Pelicula;
//import modelo.persistencia.DaoPelicula;
import modelo.persistencia.PeliculaDao;

@Service
public class GestorPelicula {

	@Autowired
	PeliculaDao daoPelicula;
	
	@Transactional
	public Pelicula create(Pelicula p) {
		return daoPelicula.save(p);
	}
	@Transactional
	public Pelicula update(Pelicula p) {
		return daoPelicula.save(p);
	}
	@Transactional
	public void delete(int id) {
		daoPelicula.delete(id);
	}
	
	public Pelicula read(int id) {
		return daoPelicula.findOne(id);
	}
	public List<Pelicula> list() {
		return daoPelicula.findAll();
	}
	/*public DaoPelicula getDaoPelicula() {
		
	}
	public void setDaoPelicula(DaoPelicula daoPelicula) {
		
	}*/
	
	
}
