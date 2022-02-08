package fxNuottipankki;

import java.net.URL;
import java.util.ResourceBundle;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;


/**
 * Kappaleiden muokkaussivun käyttöliittymää hoitava luokka.
 * @author sanna
 * @version 12.6.2020
 *
 */
public class MuokkausGUIController implements Initializable, ModalControllerInterface<String> {	
	@FXML private Node buttonClose;
	
	public void initialize(URL url, ResourceBundle bundle) {
		//      
	}

	
	/**
   	 * Poistaa kappaleen tiedot nuottipankista.    
   	 */
    @FXML private void handlePoista() {
    	poista(); 
    }

	
   	/**
   	 * Sulkee ikkunan.    
   	 */
    @FXML private void handleSulje() {
    	ModalController.closeStage(buttonClose);
    }

    
    /**
   	 * Tallentaa tekstikenttiin tehdyt muutokset.    
   	 */
    @FXML private void handleTallenna() {
    	tallenna();
    }
    
    
    /**
     * Ei ole tehty.
     */
	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		return null;
	}

	
    /** 
     * Ei ole tehty
     */
	@Override
	public void handleShown() {
		// TODO Auto-generated method stub
		
	}

	
    /** 
     * Ei ole tehty
     */
	@Override
	public void setDefault(String arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	/**
   	 * Metodi kappaleen poistamiseksi, tähän tulee varmistus kyllä/ei.    
   	 */
	@FXML private void poista() {
	    boolean vastaus = Dialogs.showQuestionDialog("Tietojen poisto", "Poistetaanko tiedot?", "Kyllä", "Ei");
		if ( vastaus ) return;
		return;
	}
	
	
	/**
   	 * Metodi kappaleen tallentamiseksi.  
   	 */
    @FXML private void tallenna() {
        Dialogs.showMessageDialog("Tallennus on kehityksen alla.");
    }
}