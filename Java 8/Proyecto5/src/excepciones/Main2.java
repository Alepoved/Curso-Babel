package excepciones;

public class Main2 {

	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria(1200);
		try {
			System.out.println("Dinero cuenta -> "+cb.sacarDinero(1000));
		} catch (SaldoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Dinero cuenta -> "+cb.sacarDinero(500));
		} catch (SaldoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
