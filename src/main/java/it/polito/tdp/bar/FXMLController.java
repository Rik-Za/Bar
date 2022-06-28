package it.polito.tdp.bar;

import java.net.URL;
import java.util.ResourceBundle;
import it.polito.tdp.bar.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class FXMLController {

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML // URL location of the FXML file that was given to the FXMLLoader
	private URL location;

	@FXML // fx:id="txtResult"
	private TextArea txtResult; // Value injected by FXMLLoader

	private Model model;

	@FXML
	void handleSimula(ActionEvent event) {
		txtResult.clear();
		this.model.simula();
		int clientiTot = this.model.risultato().getClientiTot();
		int clientiSodd = this.model.risultato().getClientiSoddisfatti();
		int clientiInsodd = this.model.risultato().getClientiInsoddisfatti();
		txtResult.appendText("Clienti totali: "+clientiTot+"\n");
		txtResult.appendText("Clienti soddisfatti: "+clientiSodd+"\n");
		txtResult.appendText("Clienti insoddisfatti: "+clientiInsodd);

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

	}

	public void setModel(Model model) {
		this.model = model;

	}
}