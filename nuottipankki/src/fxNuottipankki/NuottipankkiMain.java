package fxNuottipankki;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


/**
 * Pääohjelma, joka käynnistää nuottipankin.
 * 
 * @author sanna
 * @version 10.6.2020
 */
public class NuottipankkiMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("NuottipankkiGUIView.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("nuottipankki.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * Käynnistää nuottipankin etusivun.
	 * @param args komentorivin parametrit?
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
