package com.mony;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AMony extends Application{
    
    private static Stage stage;
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        AMony.stage = stage;

        scene = new Scene(loadFXML("TelaBemVindo"));
        stage.setScene(scene);
        stage.setMinHeight(600);
        stage.setMinWidth(800);
        stage.setTitle("Mony");
        stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("/com/mony/images/LogoMony.png")));

        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(AMony.class.getResource("/com/mony/fxml/principal/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

    
    public static void main(String[] args){
        launch();
    }
}
