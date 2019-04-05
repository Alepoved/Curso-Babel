package modelo.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import modelo.entidades.Pelicula;

//Esta clase simplifica la conversion de ResultSet a objetos

@Component
public class PeliculaDaoRowMapper implements RowMapper<Pelicula> {

	public Pelicula mapRow(ResultSet rs, int rowNum) throws SQLException {
		Pelicula p = new Pelicula();
		p.setId(rs.getInt("id"));
		p.setTitulo(rs.getString("titulo"));
		p.setDirector(rs.getString("director"));
		p.setGenero(rs.getString("genero"));
		p.setYear(rs.getInt("year"));
		return p;
	}

	
}
