package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import entidades.Videojuego;

public class DaoVideojuegoMySql implements DaoVideojuego {

	private Connection connection;
	private static DaoVideojuegoMySql instance = null;
	
	private DaoVideojuegoMySql() {
		super();
	}
	
	public static DaoVideojuegoMySql getInstance() {
		if(instance == null)
			instance = new DaoVideojuegoMySql();
		
		return instance;
	}
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean openConnection() {
		String url = "jdbc:mysql://localhost:3306/personas_bbdd?useUnicode=true&&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String user = "root";
		String pass = "password";
		
		try {
			DriverManager.getConnection(url);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean create(Videojuego v) {
		boolean exito = true;
		
		String qwery = "insert into videojuegos (nombre,company,valoracion,precio) values (?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(qwery);
			ps.setString(1, v.getNombre());
			ps.setString(2, v.getCompany());
			ps.setDouble(3, v.getValoracion());
			int colUpdated = ps.executeUpdate();
			if(colUpdated == 0) exito = false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return exito;
	}

	@Override
	public boolean delete(int id) {
		boolean exito = true;
		
		String qwery = "delete from videojuegos where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(qwery);
			ps.setInt(1,id);
			int colUpdated = ps.executeUpdate();
			if(colUpdated == 0) exito = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exito;
		
	}

	@Override
	public boolean update(int id,Videojuego v) {
		boolean exito = true;
		
		String qwery = "update videojuegos set nombre=?,company=?,valoracion=?,precio=? where id=?  where id=?";
		try {
			PreparedStatement ps = connection.prepareStatement(qwery);
			ps.setString(1,v.getNombre());
			ps.setString(2,v.getCompany());
			ps.setDouble(3,v.getValoracion());
			ps.setDouble(4,v.getPrecio());
			/*ps.setDouble(4,CONSEGUIR ID);*/
			int colUpdated = ps.executeUpdate();
			if(colUpdated == 0) exito = false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exito;
	}

	@Override
	public Videojuego read(int id) {
		String qwery = "select * from videojuegos where id=?";
		Videojuego v = null;
		try {
			PreparedStatement ps = connection.prepareStatement(qwery);
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				v = new Videojuego();
				v.setId(rs.getInt(1));
				v.setNombre(rs.getString(2));
				v.setCompany(rs.getString(3));
				v.setValoracion(rs.getDouble(4));
				v.setPrecio(rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}

	@Override
	public List<Videojuego> list() {
		String qwery = "select * from videojuegos";
		Videojuego v = null;
		List<Videojuego> lista = null;
		try {
			PreparedStatement ps = connection.prepareStatement(qwery);
			ResultSet rs = ps.executeQuery();
			lista = new ArrayList<>();
			if(rs.next()) {
				v = new Videojuego();
				v.setId(rs.getInt(1));
				v.setNombre(rs.getString(2));
				v.setCompany(rs.getString(3));
				v.setValoracion(rs.getDouble(4));
				v.setPrecio(rs.getDouble(5));
				return lista;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Videojuego readByNombre(String nombre) {
		String qwery = "select * from videojuegos where nombre=?";
		Videojuego v = null;
		try {
			PreparedStatement ps = connection.prepareStatement(qwery);
			ps.setString(1,nombre);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				v = new Videojuego();
				v.setId(rs.getInt(1));
				v.setNombre(rs.getString(2));
				v.setCompany(rs.getString(3));
				v.setValoracion(rs.getDouble(4));
				v.setPrecio(rs.getDouble(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;
	}

}
