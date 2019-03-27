package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce dos numero para dividir:");
		try {
			int dividendo = sc.nextInt();
			int divisor = sc.nextInt();
			int res = dividendo/divisor;
			System.out.println("Resultado -> "+res);
		} catch (InputMismatchException e) {
			System.err.println("Valor no numerico");
		}catch (ArithmeticException e) {
			System.err.println("El divisor no puede ser 0");
		}finally {//siempre se ejecuta
			
		}
	}
}
