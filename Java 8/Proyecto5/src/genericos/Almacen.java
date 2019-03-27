package genericos;

public class Almacen<T> {

	private T valor;
	
	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Almacen [valor=" + valor + "]";
	}

}
