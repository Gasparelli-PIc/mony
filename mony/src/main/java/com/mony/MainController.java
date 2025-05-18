package com.mony;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
    
    @FXML
    private AnchorPane rootPane;

    @FXML
    private void logout() throws IOException {
        try {
            App app = new App();
            Stage novaJanela = new Stage();
            app.start(novaJanela);

            Stage mainStage = (Stage) rootPane.getScene().getWindow();
            mainStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
