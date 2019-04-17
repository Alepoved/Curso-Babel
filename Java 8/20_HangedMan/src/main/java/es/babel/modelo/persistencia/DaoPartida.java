package es.babel.modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import es.babel.modelo.entidades.Partida;

public interface DaoPartida extends JpaRepository<Partida,Integer> {

	public List<Partida> findByCategoria(String categoria);
	public Partida findByPalabra(String palabra);
}
