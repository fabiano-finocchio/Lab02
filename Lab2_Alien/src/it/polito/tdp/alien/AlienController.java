/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */
//txtResult.appendText(d.translateWord(txtWord.getAccessibleText()));
package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienDictionary d = new AlienDictionary();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doTranslate(ActionEvent event) {
    	txtResult.appendText(d.translateWord(txtWord.getAccessibleText()));
    }
    @FXML
    void doReset (ActionEvent event) {
    	txtResult.clear();
    }

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}