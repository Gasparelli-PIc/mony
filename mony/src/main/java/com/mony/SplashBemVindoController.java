package com.mony;

import javafx.animation.FadeTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class SplashBemVindoController {
    
    @FXML
    private AnchorPane rootPane;

    public void initialize(){
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(1.5), rootPane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);

        PauseTransition pause = new PauseTransition(Duration.seconds(1.5));

        FadeTransition fadeOut = new FadeTransition(Duration.seconds(1.5), rootPane);
        fadeOut.setFromValue(1);
        fadeOut.setToValue(0);

        SequentialTransition sequence = new SequentialTransition(fadeIn, pause, fadeOut);
        sequence.setOnFinished(e -> {
            try {
                AMony.setRoot("main");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        sequence.play();
    }
}
