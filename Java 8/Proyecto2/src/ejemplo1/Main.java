package ejemplo1;


import java.util.*;

public class Main {

	public static void main(String[] args) {
		//List: interfaz de la clase lista
		List<String> listaS = new ArrayList<>();
		listaS.add("Ana");
		listaS.add("Pepe");
		listaS.add("Eduardo");
		listaS.add("Eduardo");
		
		for (String string : listaS) {
			System.out.println(string);
		}
		listaS.remove("Ana");
		System.out.println(listaS.size());
		
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Ana");
		conjunto.add("Pepe");
		conjunto.add("Eduardo");
		conjunto.add("Eduardo");
		
		for (String string : conjunto) {
			System.out.println(string);
		}
		
		Map<Integer,String> mapa = new HashMap<>();
		//wrapper son los tipos objeto de los primitivos
		Double d = new Double(2.3);
		//auto-boxing: pasar de primitivo a objetos
		Double d2 = 2.3;
		mapa.put(1, "Felix");
		mapa.put(2, "Elena");
		
		String s = mapa.get(2);
		System.out.println("Valor de la clave: "+s);
		
		
	}
}
