package modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import modelo.entidades.Coche;


@Repository
public class DaoCoches {
	
	//private static ArrayList<Coche> listaCoches = new ArrayList<>();
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private CocheDaoRowMapper rowMapper;
	
	public int altaCoche(Coche c) {
		String query = "insert into coches (matricula,marca,km,modelo) values (?,?,?,?)";
		return jdbcTemplate.update(query, c.getMatricula(),c.getMarca(),c.getKm(),c.getModelo());
	}

	public List<Coche> getListaCoches() {
		String query = "select * from coches";
		List<Coche> lista = jdbcTemplate.query(query,rowMapper);
		return lista;
	}
	
}
