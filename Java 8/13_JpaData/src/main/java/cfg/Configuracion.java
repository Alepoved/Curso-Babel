package cfg;

import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//https://www.baeldung.com/the-persistence-layer-with-spring-and-jpa
@Configuration
@EnableJpaRepositories(basePackages= {"modelo.persistencia"})
@ComponentScan(basePackages = { "modelo","modelo.persitencia" })
@EnableTransactionManagement
public class Configuracion {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://172.10.5.5:3306/jpa?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("password");
		return ds;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean 
		entityManagerFactory(DataSource dataSource, Environment env) {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = 
			new LocalContainerEntityManagerFactoryBean();
		//Metemos el dataSource
		entityManagerFactoryBean.setDataSource(dataSource);
		//Decimosal entity manager que vamos a usar Hibernate
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		//Le decimos donde tenemos que ir a buscar las entidades
		entityManagerFactoryBean.setPackagesToScan("modelo.entidades");

		Properties jpaProperties = new Properties();
		//El dialecto son las distintas versiones de los fabricantes al sql standar
		jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		//Crea el esquema relacional de datos en nuestra BBDD
		//create-drop crea y destruye las filas al ejecutar el programa
		//update actualiza las tablas 
		jpaProperties.put("hibernate.hbm2ddl.auto", "update");//create-drop update
		//Si queremos mostrar las consulas sql que se van a ejecutar por consola
		jpaProperties.put("hibernate.show_sql", "true");
		//Si queremos que las consulas en consola que aparezcan con formato
		jpaProperties.put("hibernate.format_sql", "false");
		entityManagerFactoryBean.setJpaProperties(jpaProperties);

		return entityManagerFactoryBean;
	}
	
	@Bean //Objeto que va a gestionar las transacciones por nosotros
	JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		return transactionManager;
	}
	
}
