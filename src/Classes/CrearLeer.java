package Classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CrearLeer extends Carro{
	
	Carro c = new Carro();
	
	
	String ruta = "D:/Proyectos JAVA/Carro/hola.txt";
	String contenido = "Velocidad actual e " + c.getVelocidadActual() + "Km/h 99";
	
	public CrearLeer() {
		try {
			File file = new File(ruta);
			
			if (file.exists()) {
				
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(contenido);
				bw.close();
				
			} else {
				
				file.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getRuta() {
		return ruta;
	}
	
}
