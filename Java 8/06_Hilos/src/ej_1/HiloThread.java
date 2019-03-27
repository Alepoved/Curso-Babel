package ej_1;

//crear hilo -> extender clase thread
public class HiloThread extends Thread {

	private String nombre;
	private int numIteraciones;
	
	public HiloThread(String nombre, int numIteraciones) {
		this.nombre = nombre;
		this.numIteraciones = numIteraciones;
	}

	//run es equivalente al main
	//punto de entrada de ejecucion del hilo
	@Override
	public void run() {
		System.out.println("Arrancado el hilo "+nombre);
		
		for (int i = 0; i < numIteraciones; i++) {
			System.out.println(nombre + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(nombre+" finalizando...");
	}

	
}
