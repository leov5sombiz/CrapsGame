package com.example.crapsgame;

import com.example.crapsgame.view.GameStage;
import com.example.crapsgame.view.WelcomeStage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        WelcomeStage.getInstance();
    }
}
