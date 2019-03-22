package curso;

import java.util.Scanner;

public class SentenciasControl {

	public static void main(String[] args) {
		boolean cierto = true;
		
		int n=2;
		String dia = "Viernes";
		
		switch (dia) {
		case "Viernes":
			System.out.println("Es viernes");
			break;
		default:
			break;
		}
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		System.out.println(numero);
	}
}
