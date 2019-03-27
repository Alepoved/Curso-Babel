package sincronizaciones;

public class Obrero implements Runnable{

	private String nombre;
	private int metrosIni;
	private int metrosFin;
	private Silla silla;
	
	public Obrero(String nombre, int metrosIni, int metrosFin, Silla silla) {
		this.nombre = nombre;
		this.metrosIni = metrosIni;
		this.metrosFin = metrosFin;
		this.silla = silla;
	}
	
	public void construirValla() {
		for (int i = metrosIni; i < metrosFin; i++) {
			System.out.println("Obrero " + nombre + " poniendo ladrillos en el metro " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i % 10 == 0)
				silla.ocuparSilla(this);
		}
	}

	@Override
	public void run() {
		construirValla();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
