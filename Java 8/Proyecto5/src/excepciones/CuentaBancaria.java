package excepciones;

public class CuentaBancaria {

	private double saldo;

	public CuentaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacarDinero(double cantidad) throws SaldoException {
		if(saldo < cantidad) {
			throw new SaldoException("El saldo es insuficiente");
		}
		saldo -= cantidad;
		return saldo;
	}
}
