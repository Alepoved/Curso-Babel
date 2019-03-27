package sincronizaciones;

public class Silla {

	//synchronized bloquea todo el objeto a los demas hilos
	public synchronized void ocuparSilla(Obrero o) {
		System.out.println("OMG... Que cansado estoy");
		System.out.println("Soy el obrero " + o.getNombre() + " y voy a descansar");
		try {
			Thread.sleep(5000);
			System.out.println("Vuelvo al curro :(");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
