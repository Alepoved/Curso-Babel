package curso;

public class Funciones {

	public static void main(String[] args) {
		saludar();
		sumar(11,3);
	}
	
	//Firma metodo java:
	//1.Nombre metodo
	//2.Numero de parametros entrada
	//3.Tipo de parametros entrada
	public static void saludar() {
		System.out.println("Hola mundo");
	}
	
	public static int sumar(int n1,int n2) {
		return n1+n2;
	}

	public static int sumar(int ...numeros) {
		int res = 0;
		for(int i: numeros) {
			res += i;
		}
		return res;
	}
}
