package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main3 {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("fichero.txt");
			pw = new PrintWriter(fw);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pw != null) {
				pw.close();
				//etc...
			}
		}
		
		//bloques auto-closeables
		try(FileWriter fw2 = new FileWriter("fichero2.txt");
				PrintWriter pw2 = new PrintWriter(fw2);){
			pw2.println("Esto es una prueba");
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
