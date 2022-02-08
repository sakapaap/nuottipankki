package fxNuottipankki;

import java.net.URL;
import java.util.ResourceBundle;

import fi.jyu.mit.fxgui.Dialogs;
import fi.jyu.mit.fxgui.ModalController;
import fi.jyu.mit.fxgui.ModalControllerInterface;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;


/**
 * Nuottipankin infosivun k‰yttˆliittym‰‰ hoitava luokka. Infosivulta p‰‰see tilastoihin.
 * @author sanna
 * @version 12.6.2020
 *
 */
public class InfoGUIController implements Initializable, ModalControllerInterface<String> {	
	@FXML private Node buttonClose;  
	
	public void initialize(URL url, ResourceBundle bundle) {	    
	}

	
   	/**
   	 * Sulkee ikkunan.    
   	 */
    @FXML private void handleSulje() {
        ModalController.closeStage(buttonClose);
    }

    
   	/**
   	 * N‰ytt‰‰ tilastot.    
   	 */
    @FXML private void handleTilastot() {
    	ModalController.showModal(NuottipankkiGUIController.class.getResource("Tilastot.fxml"), "Tilastot", null, "");
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
}