package com.mony;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    // Serve para iniciar a janela
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Login"));
        stage.setMinHeight(590);
        stage.setMinWidth(800);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Entrar");
        stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("/com/mony/images/LogoMony.png")));
        stage.show();
    }

    // Serve para permitir a troca de conteudos, sem a nescecidade de criar uma janela nova 
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    //  Transforma arquivos FXML em interfaces e exibe na tela
    private static Parent loadFXML(String fxml) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/com/mony/fxml/autenticador/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    } 
}