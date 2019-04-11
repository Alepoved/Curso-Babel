package es.babel.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.babel.modelo.entidades.Pelicula;
//import modelo.persistencia.DaoPelicula;
import es.babel.modelo.persitencia.PeliculaDao;
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
		daoPelicula.deleteById(id);
	}
	
	public Optional<Pelicula> read(int id) {//es necesario devolver un optional
		return daoPelicula.findById(id);
	}
	public List<Pelicula> list() {
		return daoPelicula.findAll();
	}
	/*public DaoPelicula getDaoPelicula() {
		
	}
	public void setDaoPelicula(DaoPelicula daoPelicula) {
		
	}*/
	
	
}
