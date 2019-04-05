package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DaoPelicula;
import modelo.persistencia.DaoPeliculaImp;

/*
 * Esta clase va a llevar la creacion de beans de Spring
 * */
@Configuration
@ComponentScan("modelo")
public class Configuracion {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/peliculas_schema?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("password");
		return dataSource;
	}
	
	@Bean // objeto que gestione las conexiones a la bbdd y realice las consultas
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	/*@Bean("gestorPelicula")
	public GestorPelicula gestorPelicula(DaoPelicula daoPelicula) {
		GestorPelicula gp = new GestorPelicula();
		gp.setDaoPelicula(daoPelicula);
		return gp;
		
	}
	
	@Bean("daoPelicula")
	public DaoPelicula daoPelicula() {
		DaoPeliculaImp daoPelicula = new DaoPeliculaImp();
		return daoPelicula;
	}*/
}
