package modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import modelo.entidades.Pelicula;

//pelicula -> tipo de dato
//Integer -> tipo de clave primaria de la tabla peliculas

public interface PeliculaDao extends JpaRepository<Pelicula, Integer>{
	
	
}
