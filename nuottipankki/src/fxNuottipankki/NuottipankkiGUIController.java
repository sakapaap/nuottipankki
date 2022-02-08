package fxNuottipankki;

import java.net.URL;
import java.util.ResourceBundle;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


/**
 * Nuottipankin käyttöliittymän tapahtumia hoitava luokka.
 * @author sanna
 * @version 12.6.2020
 *
 */
public class NuottipankkiGUIController implements Initializable {	
	
	public void initialize(URL url, ResourceBundle bundle) {
		//      
	}
	
	/**
	 * Hakee hakuehdolla kappaletta, säveltäjää, tyylisuuntaa, maata tai soitinta.
	 */
	@FXML private void handleHakuehto() {
		Dialogs.showMessageDialog("Hakuominaisuus kehityksen alla.");
	}

	
	/**
	 * Avaa infosivun.
	 */
	@FXML private void handleInfo() {
		ModalController.showModal(NuottipankkiGUIController.class.getResource("Infosivu.fxml"), "Info", null, "");
	}
    

	/**
	 * Avaa sivun, jossa voi muokata kappaleen tietoja.
	 */
    @FXML private void handleMuokkaaKappale() {
    	ModalController.showModal(NuottipankkiGUIController.class.getResource("Muokkaussivu.fxml"), "Muokkaa", null, "");
   	} 
    
    
	/**
	 * Avaa sivun, jossa voi muokata säveltäjän tietoja.
	 */
    @FXML private void handleMuokkaaSaveltaja() {
    	ModalController.showModal(NuottipankkiGUIController.class.getResource("Saveltajasivu.fxml"), "Muokkaa", null, "");
   	}
    
    
	/**
	 * Sulkee käyttöliittymän.
	 */
    @FXML private void handleSulje() {
    	 Platform.exit();
    }	 
}