package com.example.crapsgame.view;

import com.example.crapsgame.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class WelcomeStage extends Stage {

    public WelcomeStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "nickname-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        setTitle("Hello!");
        setScene(scene);
        getIcons().add(new Image(Objects.requireNonNull(
                HelloApplication.class.getResourceAsStream("images/dado.png")
        )));

        setResizable(false);
        show();
    }

    public static WelcomeStage getInstance() throws IOException {
        if (WelcomeStageHolder.INSTANCE == null) {
            return WelcomeStageHolder.INSTANCE = new WelcomeStage();
        } else  {
            return WelcomeStageHolder.INSTANCE;
        }
    }

    private static class WelcomeStageHolder{
        private static WelcomeStage INSTANCE;
    }

}
