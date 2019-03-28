package JDBC.negocio;

import java.util.List;

import JDBC.modelo.entidades.Persona;
import JDBC.persistencia.DaoPersona;
import JDBC.persistencia.DaoPersonaMySql;

public class GestorPersona {

	private DaoPersona daoPersona;
	
	public boolean create(Persona p) {
		daoPersona = new DaoPersonaMySql();
		return daoPersona.create(p);
	}
	
	public boolean delete(int id) {
		daoPersona = new DaoPersonaMySql();
		return daoPersona.delete(id);
	}
	
	public boolean update(Persona p) {
		daoPersona = new DaoPersonaMySql();
		return daoPersona.update(p);
	}
	
	public Persona read(int id) {
		daoPersona = new DaoPersonaMySql();
		return daoPersona.read(id);
	}
	public List<Persona> list() {
		daoPersona = new DaoPersonaMySql();
		return daoPersona.list();
	}
	
	
}
