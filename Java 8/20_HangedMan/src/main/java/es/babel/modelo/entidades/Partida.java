package es.babel.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Entity(name="palabras")
@Table(name="palabras")
@XmlRootElement
@Component
public class Partida {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String palabra;
	private String categoria;
	private int vidas;
	
	
	public Partida() {}
	
	public Partida(String palabra, String categoria) {
		this.palabra = palabra;
		this.categoria = categoria;
		this.vidas = 5;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public String toString() {
		return "Partida [id=" + id + ", palabra=" + palabra + ", categoria=" + categoria + ", vidas=" + vidas + "]";
	}
	
	
	
}
