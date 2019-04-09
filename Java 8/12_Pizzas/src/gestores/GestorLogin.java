package gestores;

import entidades.Usuario;

public class GestorLogin {

	public boolean login(Usuario u) {
		if(u.getNombre().equalsIgnoreCase("")|| u.getPassword().equalsIgnoreCase(""))
			return false;
		return true;
	}
}
