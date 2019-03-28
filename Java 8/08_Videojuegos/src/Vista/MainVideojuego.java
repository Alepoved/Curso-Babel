package Vista;

import entidades.Videojuego;
import negocio.GestorVideojuego;

public class MainVideojuego {

	public static void main(String[] args) {
		GestorVideojuego gv = GestorVideojuego.getInstance();
		Videojuego v1 = new Videojuego("game1","company1",3.5,60);
		Videojuego v2 = new Videojuego("game2","company1",5,45);
		Videojuego v3 = new Videojuego("game3","company2",3,50);
		
		gv.create(v1);
		
		System.out.println(gv.list());
	}
}
