package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidades.Videojuego;

public interface DaoVideojuego {

	boolean create(Videojuego v);
	boolean delete(int id);
	boolean update(int id,Videojuego v);
	Videojuego read(int id);
	List<Videojuego> list();
	Videojuego readByNombre(String nombre);
	double getValoraciones();
	double getPrecios();
}
