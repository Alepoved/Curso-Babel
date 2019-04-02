package Vista;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ActionMap;
import javax.swing.InputMap;

import entidades.Videojuego;
import negocio.GestorVideojuego;

public class Vista{

	private Scanner sc = null;
	private GestorVideojuego gv = null;
	
public void arrancar() {
		
		sc = new Scanner(System.in);
		gv = GestorVideojuego.getInstance();
		Videojuego v = null;
		List<Videojuego> listaV = null;
		int opcion = 0,id=-1;
		double resul = -1;
		do{
			opcion = mostrarMenu();
			switch (opcion) {
			case 1://alta
				 v = createVideojuego();
				 boolean res = gv.create(v);
				if(!res)System.err.println("No se ha podido crear el videojuego");
				break;
	
			case 2://eliminar
				id = deleteVideojuego();
				if(!gv.delete(id))System.err.println("No se ha encontrado videojuego con ese id");
				break;
				
			case 3://listar videojuegos
				listaV = gv.list();
				listVideojuegos(listaV);
				break;
	
			case 4://buscar videojuegos por nombre
				String nombre = readNombre();
				v = gv.readByNombre(nombre);
				if(v==null)System.err.println("No se ha encontrado videojuego con ese nombre\n");
				else System.out.println(v+"\n");
				System.out.println("Modificar el videojuego?? (SI/NO)");
				nombre = sc.next();
				if(nombre.equalsIgnoreCase("SI")) {
					id = v.getId();
					v = createVideojuego();
					if(!gv.update(id,v))System.err.println("No se ha encontrado modificar el videojuego");
				}
				break;
			
			case 5://buscar videojuegos por nombre
				id = readId();
				v = gv.read(id);
				if(v==null)System.err.println("No se ha encontrado videojuego con ese id\n");
				else System.out.println(v+"\n");
				break;
				
			case 6://valoraciones media
				resul = gv.getValoraciones();
				if(resul==-1)System.err.println("No se puede obtener valoraciones\n");
				else System.out.println("Valoraciones media -> "+resul+"\n");
				break;
				
			case 7://precio medio
				resul = gv.getPrecio();
				if(resul==-1)System.err.println("No se puede obtener valoraciones\n");
				else System.out.println("Precio media -> "+resul+"\n");
				break;
			}
		
		}while(opcion!=-1);
		
		System.out.println("Fin del programa");
	}


	private int readId() {
		System.out.println("Introduce el id a buscar:");
		int id = sc.nextInt();
		return id;
	}

	private String readNombre() {
		System.out.println("Introduce el nombre a buscar:");
		String nombre = sc.next();
		return nombre;
	}

	private void listVideojuegos(List<Videojuego> listaV) {
		System.out.println("Lista videojuegos -> \n");
		for (Videojuego videojuego : listaV) {
			System.out.println(videojuego.getNombre()+" | "+videojuego.getCompany()+"\n");
		}
		System.out.println("ver en detalle el listado?? (SI/NO)");
		String respuesta = sc.next();
		String aux,aux2;
		int cont = 0;
		if(respuesta.equalsIgnoreCase("SI")) {
			for (Videojuego videojuego : listaV) {
			
				if(videojuego.getValoracion()==-1)
					aux = "PENDIENTE";
				else 
					aux = new Double(videojuego.getValoracion()).toString();
				if(videojuego.getPrecio()==-1)
					aux2 = "PENDIENTE";
				else
					aux2 = new Double(videojuego.getValoracion()).toString();
				
				System.out.println(videojuego.getNombre()+" | "+videojuego.getCompany()+" | "+aux+" | "+aux2+"\n");
				cont++;
				
			}
		}
	}

	private int deleteVideojuego() {
		System.out.println("Introduzca id para eliminar:");
		int id = sc.nextInt();
		return id;
	}

	private Videojuego createVideojuego() {
		System.out.println("Introduzca nombre:");
		String nombre = sc.next();
		System.out.println("Introduzca compañia:");
		String company = sc.next();
		System.out.println("Introduzca valoracion:");
		double valoracion = sc.nextDouble();
		System.out.println("Introduzca precio:");
		double precio = sc.nextDouble();
		return new Videojuego(nombre,company,valoracion,precio);
	}

	private int mostrarMenu() {
		System.out.println("Introduzca la opcion que quiere realizar");
		System.out.println("1 - Alta videojuego");
		System.out.println("2 - Baja videojuego");
		System.out.println("3 - Listar todos videojuegos");
		System.out.println("4 - Buscar videojuego por nombre");
		System.out.println("5 - Buscar videojuego por id");
		System.out.println("6 - Valoraciones medias de videojuegos");
		System.out.println("7 - Precio medias de videojuegos");
		System.out.println("-1 - Salir del programa");
		System.out.println("---------------------------------");
		int opcion = sc.nextInt();
		return opcion;
	}

}
