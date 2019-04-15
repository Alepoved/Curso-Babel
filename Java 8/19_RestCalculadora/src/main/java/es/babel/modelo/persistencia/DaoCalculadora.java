package es.babel.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import es.babel.modelo.entidades.Calculadora;

public interface DaoCalculadora extends JpaRepository<Calculadora,Integer> {

	
}
