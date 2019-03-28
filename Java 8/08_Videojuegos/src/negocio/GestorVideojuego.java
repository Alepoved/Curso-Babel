package negocio;

import java.util.List;


import entidades.Videojuego;
import persistencia.DaoVideojuego;
import persistencia.DaoVideojuegoMySql;

public class GestorVideojuego {

	private static GestorVideojuego instance = null;
	private DaoVideojuego daoVideojuego;
	
	private GestorVideojuego() {
		super();
	}
	
	public static GestorVideojuego getInstance() {
		if(instance == null)
			instance = new GestorVideojuego();
		
		return instance;
	}
	
	public static boolean conditions(Videojuego v) {
		DaoVideojuegoMySql dao = DaoVideojuegoMySql.getInstance();
		if(v.getCompany().equalsIgnoreCase("") || !dao.readByNombre(v.getNombre()).equals(null))//nombre no se repita
			return false;
		
		return true;
	}
	
	public boolean create(Videojuego v) {
		daoVideojuego = DaoVideojuegoMySql.getInstance();
		if(!conditions(v))return false;
		return daoVideojuego.create(v);
	}
	
	public boolean delete(int id) {
		daoVideojuego = DaoVideojuegoMySql.getInstance();
		return daoVideojuego.delete(id);
	}
	
	public boolean update(int id,Videojuego v) {
		if(!conditions(v))return false;
		daoVideojuego = DaoVideojuegoMySql.getInstance();
		return daoVideojuego.update(id,v);
	}
	
	public Videojuego read(int id) {
		daoVideojuego = DaoVideojuegoMySql.getInstance();
		return daoVideojuego.read(id);
	}
	public List<Videojuego> list() {
		daoVideojuego = DaoVideojuegoMySql.getInstance();
		return daoVideojuego.list();
	}
}
