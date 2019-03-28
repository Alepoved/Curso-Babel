package JDBC.persistencia;

import java.util.List;

import JDBC.modelo.entidades.Persona;

public interface DaoPersona {

	boolean create(Persona p);
	boolean delete(int id);
	boolean update(Persona p);
	Persona read(int id);
	List<Persona> list();
}
