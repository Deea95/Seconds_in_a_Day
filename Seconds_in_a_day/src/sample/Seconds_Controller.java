package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Seconds_Controller implements Initializable {

    // Declararea variabilelor:

    @FXML
    private TextField txtZile;

    @FXML
    private Label lblSecunde;


    @FXML
    private void lblSecunde (MouseEvent ev){
        lblSecunde.setOnMouseClicked(e->{
            lblSecunde.setText("" + Integer.parseInt(txtZile.getText()) *24*60*60);
        });
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) { }
}
