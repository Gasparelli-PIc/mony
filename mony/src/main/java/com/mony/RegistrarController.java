package com.mony;

import java.io.IOException;

import javafx.fxml.FXML;

public class RegistrarController {
    @FXML
    private void trocarLogin() throws IOException{
        App.setRoot("Login");
    }
}
