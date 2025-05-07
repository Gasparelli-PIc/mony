package com.mony;

import java.io.IOException;

import javafx.fxml.FXML;

public class LoginController {   
    @FXML
    private void trocarRegistrar() throws IOException{
        App.setRoot("Registrar");
    }
}
