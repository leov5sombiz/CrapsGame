package com.example.crapsgame.view;

import com.example.crapsgame.HelloApplication;
import com.example.crapsgame.controller.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class GameStage extends Stage{

    private GameController gameController;

    public GameStage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "game.fxml"));
        setTitle("Craps Game");
        Parent root = fxmlLoader.load();
        gameController = fxmlLoader.getController();
        Scene scene = new Scene(root);
        setScene(scene);
        getIcons().add(new Image(Objects.requireNonNull(
                HelloApplication.class.getResourceAsStream("images/dado.png")
        )));
        setResizable(false);
        show();
    }

    public static GameStage getInstance() throws IOException {
        return GameStage.GameStageHolder.INSTANCE = new GameStage();
    }

    private static class GameStageHolder{
        private static GameStage INSTANCE;
    }

    public GameController getGameController() {
        return gameController;
    }

}
