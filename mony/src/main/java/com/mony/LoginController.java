package com.mony;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginController {   
    
    @FXML
    private StackPane rootPane;

    @FXML
    private void trocarRegistrar() throws IOException{
        App.setRoot("Registrar");
    }

    @FXML
    private void logar() throws IOException {
        try {

            AMony mony = new AMony();
            Stage novaJanela = new Stage();
            mony.start(novaJanela);

            Stage loginStage = (Stage) rootPane.getScene().getWindow();
            loginStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
