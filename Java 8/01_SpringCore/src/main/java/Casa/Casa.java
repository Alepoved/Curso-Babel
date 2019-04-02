package Casa;

import java.util.Arrays;
import java.util.List;

public class Casa {

	private double precio;
	private Direccion direccion;
	private Persona propietario;
	boolean estaAlquilada;
	private List<Habitacion> habitaciones;
	private List<Persona> inquilinos;
	
	public Casa() {}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public boolean isEstaAlquilada() {
		return estaAlquilada;
	}
	public void setEstaAlquilada(boolean estaAlquilada) {
		this.estaAlquilada = estaAlquilada;
	}
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> listH) {
		this.habitaciones = listH;
	}
	public List<Persona> getInquilinos() {
		return inquilinos;
	}
	public void setInquilinos(List<Persona> list) {
		this.inquilinos = list;
	}

	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", direccion=" + direccion + ", propietario=" + propietario
				+ ", estaAlquilada=" + estaAlquilada + ", habitaciones=" + habitaciones + ", inquilinos=" + inquilinos
				+ "]";
	}

	

	
	
}
