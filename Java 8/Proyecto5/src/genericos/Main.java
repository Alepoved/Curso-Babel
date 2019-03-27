package genericos;

public class Main {

	public static void main(String[] args) {
		
		AlmacenObj almacen = new AlmacenObj();
		almacen.setValor("Esto es un string :)");
		almacen.setValor(5);
		
		Integer num = (Integer) almacen.getValor();
		
		Almacen<String> al = new Almacen<>();
		al.setValor("El aliento de mi gato huele a comida de gato");
		System.out.println(al.getValor());
	}

}
