package es.babel.modelo.gestor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.babel.modelo.entidades.Historia;
import es.babel.modelo.persistencia.DaoHistoria;

@Service
public class GestorHistoria {

	@Autowired
	private DaoHistoria daoHistoria;
	
	public Historia getHistoria() {
		Historia h =  daoHistoria.getHistoria();
		h.setTexto(h.getTexto()+h.getNombre()+"y un buen dia, el joven padawan se convirtio en todo un maestro jedi.");
		return h;
	}
}
