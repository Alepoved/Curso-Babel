package es.babel.modelo.gestor;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.babel.modelo.entidades.Partida;
import es.babel.modelo.persistencia.DaoPartida;

@Service
public class GestorPartida {

	@Autowired
	private DaoPartida daoPartida;
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void create(Partida p) {
		daoPartida.save(p);
	}
	
	public List<Partida> readByCategoria(String categoria) {
		
		return daoPartida.findByCategoria(categoria);
	}
	
	@Transactional
	public List<String> readAllCategorias() {
		em.createQuery("UPDATE palabras set vidas=11").executeUpdate();
		List<String> list = em.createQuery("SELECT distinct(categoria) FROM palabras").getResultList();
		return list;
	}

	@Transactional
	public Partida intento(Partida partida) {
		Partida p = daoPartida.findByPalabra(partida.getPalabra());
		p.setVidas(p.getVidas()-1);
		//return daoPartida.findById(p.getId()).get();
		Query q = em.createQuery("UPDATE palabras set vidas= :newVida where id= :newId");
		q.setParameter("newId", p.getId());
		q.setParameter("newVida", p.getVidas());
		int a = q.executeUpdate();
		return p;
	}

	
}
