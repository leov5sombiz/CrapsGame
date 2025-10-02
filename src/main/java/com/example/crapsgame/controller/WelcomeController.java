package com.example.crapsgame.controller;

import com.example.crapsgame.model.alert.AlertBox;
import com.example.crapsgame.model.player.Player;
import com.example.crapsgame.view.GameStage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private TextField nicknameTextfield;

    @FXML
    private Label welcomeLabel;

    @FXML
    public void onHandleButtonPlay(ActionEvent event) throws IOException {
        String nickname = nicknameTextfield.getText();
        Player player = new Player(1, nickname);
        GameStage.getInstance().getGameController().setPlayer(player);
    }

    @FXML
    public void onHandleKeyTextField(KeyEvent event) {
        System.out.println(event.getText());
    }

}
