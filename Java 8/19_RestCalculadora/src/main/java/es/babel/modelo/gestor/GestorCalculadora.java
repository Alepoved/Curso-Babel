package es.babel.modelo.gestor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.babel.modelo.entidades.Calculadora;
import es.babel.modelo.persistencia.DaoCalculadora;

@Service
public class GestorCalculadora {

	@Autowired
	private DaoCalculadora daoCalculadora;

	public Calculadora create(Calculadora calculadora) {
		return daoCalculadora.save(calculadora);
	}

	public Calculadora modificar(Calculadora c) {
		return daoCalculadora.save(c);
	}

	public List<Calculadora> list() {
		return daoCalculadora.findAll();
		
	}


	
	
	
	
}
