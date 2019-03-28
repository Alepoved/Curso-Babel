package JDBC.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBC.modelo.entidades.Persona;

public class DaoPersonaMySql implements DaoPersona {

	private Connection connection;
	
	//los bloques estaticos ejecutan un codigo al iniciar el programa
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boolean openConnection() {
		String url = "jdbc:mysql://localhost:3306/personas_bbdd?useUnicode=true&&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String pass = "password";
		
		try {
			connection = DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	private boolean closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	@Override
	public boolean create(Persona p) {
		if(!openConnection())
			return false;
		
		boolean alta = true;
		String query = "insert into personas (nombre,edad,peso) values (?,?,?)";//no usar p.getNombre()...Usar SIEMPRE ? (sustituye parametros)
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, p.getNombre());
			ps.setInt(2, p.getEdad());
			ps.setDouble(3, p.getPeso());
			int colUpdated = ps.executeUpdate();
			if(colUpdated == 0) alta = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return alta;
	}

	@Override
	public boolean delete(int id) {
		if(!openConnection())
			return false;
		
		boolean baja = true;
		String query = "delete from personas where id=?";//no usar p.getNombre()...Usar SIEMPRE ? (sustituye parametros)
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1,id);
			int colUpdated = ps.executeUpdate();
			if(colUpdated == 0) baja = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return baja;
	}

	@Override
	public boolean update(Persona p) {
		if(!openConnection())
			return false;
		
		boolean baja = true;
		String query = "update personas set nombre=?,edad=?,peso=? where id=?";//no usar p.getNombre()...Usar SIEMPRE ? (sustituye parametros)
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1,p.getNombre());
			ps.setInt(2,p.getEdad());
			ps.setDouble(3,p.getPeso());
			ps.setInt(4,p.getId());
			int colUpdated = ps.executeUpdate();
			if(colUpdated == 0) baja = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return baja;
	}

	@Override
	public Persona read(int id) {
		if(!openConnection())
			return null;
		
		
		String query = "select * from personas where id=?";//no usar p.getNombre()...Usar SIEMPRE ? (sustituye parametros)
		Persona p = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p = new Persona();
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setEdad(rs.getInt(3));
				p.setPeso(rs.getDouble(4));
				return p;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}

	@Override
	public List<Persona> list() {
		if(!openConnection())
			return null;
		
		
		String query = "select * from personas";//no usar p.getNombre()...Usar SIEMPRE ? (sustituye parametros)
		List<Persona> listaPersonas = null;
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			listaPersonas = new ArrayList<>();
			while(rs.next()) {
				Persona p = new Persona();
				p.setId(rs.getInt(1));
				p.setNombre(rs.getString(2));
				p.setEdad(rs.getInt(3));
				p.setPeso(rs.getDouble(4));
				listaPersonas.add(p);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaPersonas;
	}

}
