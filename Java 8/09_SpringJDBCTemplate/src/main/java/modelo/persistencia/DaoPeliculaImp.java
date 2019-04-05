package modelo.persistencia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.entidades.Pelicula;

@Repository
public class DaoPeliculaImp implements DaoPelicula{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PeliculaDaoRowMapper rowMapper;
	
	public int create(Pelicula p) {
		String query = "insert into peliculas (titulo,director,genero,year) values (?,?,?,?)";
		return jdbcTemplate.update(query,p.getTitulo(),p.getDirector(),p.getGenero(),p.getYear());
	}

	public int update(Pelicula p) {
		String query = "update peliculas set titulo=?,director=?,genero=?,year=? where id=?";
		return jdbcTemplate.update(query,p.getTitulo(),p.getDirector(),p.getGenero(),p.getYear(),p.getId());
	}

	public int delete(int id) {
		String query = "delete from peliculas where id=?";
		return jdbcTemplate.update(query,id);
	}

	public Pelicula read(int id) {
		String query = "select * from peliculas where id=?";
		Pelicula p = jdbcTemplate.queryForObject(query,rowMapper,id);
		return p;
	
	}

	public List<Pelicula> list() {
		String query = "select * from peliculas";
		List<Pelicula> lista = jdbcTemplate.query(query,rowMapper);
		return lista;
	}

}
