package com.mony;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainController {
    
    @FXML
    private AnchorPane rootPane;
    @FXML
    private AnchorPane scenaPaneFX;


    public void setContent(String fxmlFile) {
        try {
            AnchorPane newContent = FXMLLoader.load(getClass().getResource(fxmlFile));
            scenaPaneFX.getChildren().setAll(newContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


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

    @FXML
    private void visaoGeral() throws IOException {
        try {
            setContent("/com/mony/fxml/principal/VisaoGeral.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void transacoes() throws IOException {
        try {
            setContent("/com/mony/fxml/principal/Transacoes.fxml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
