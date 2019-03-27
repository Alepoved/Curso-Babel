package ej_1;

public class Main {

	public static void main(String[] args) {
		
		HiloThread hilo1 = new HiloThread("Hilo1",25);
		HiloThread hilo2 = new HiloThread("Hilo2",20);
		HiloThread hilo3 = new HiloThread("Hilo3",15);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}

}
