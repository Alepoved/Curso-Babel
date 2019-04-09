package entidades;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Saludos {

	private List<String> lista = new ArrayList<String>();

	public Saludos() {
	}

	public Saludos(List<String> lista) {
		this.lista = lista;
	}

	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Saludos [lista=" + lista + "]";
	}
	
	
}
