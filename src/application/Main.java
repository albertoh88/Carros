package application;
	
import java.io.File;
import java.util.Scanner;

import Classes.Carro;
import Classes.CrearLeer;
import Classes.fusca;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		
		Carro c = new fusca();
		CrearLeer cl = new CrearLeer();
		
		
		c.acelerar();
		System.out.println("A velocidad es " + c.getVelocidadActual() + "Km/h");
		c.acelerar();
		System.out.println("A velocidad es " + c.getVelocidadActual() + "Km/h");
		c.acelerar();
		System.out.println("A velocidad es " + c.getVelocidadActual() + "Km/h");
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		System.out.println("A velocidad es " + c.getVelocidadActual() + "Km/h");
		
		
		
		try {
			Scanner input = new Scanner(new File(cl.getRuta()));
			
			while (input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	
	}
}
