/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxsample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author p675037t
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField textInput;
    
    @FXML
    private TextArea textOutput;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        String text = textInput.getText();
        textOutput.appendText("入力:"+text+"\n");
        textOutput.appendText("文字数:"+text.length()+"\n");
        textOutput.appendText("大文字:"+text.toUpperCase()+"\n");
        textOutput.appendText("小文字:"+text.toLowerCase()+"\n");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
