package modelo.persistencia;

import java.util.List;

import modelo.entidades.Pelicula;

public interface DaoPelicula {

	int create(Pelicula p);
	int update(Pelicula p);
	int delete(int id);
	Pelicula read(int id);
	List<Pelicula> list();
}
