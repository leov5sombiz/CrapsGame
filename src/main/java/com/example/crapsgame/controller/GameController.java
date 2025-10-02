package com.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class GameController {
    @FXML
    private TextField nicknameTextfield;

    @FXML
    private Label welcomeLabel;

    @FXML
    public void onHandleButtonPlay(ActionEvent event) {
        String nickname = nicknameTextfield.getText();
        welcomeLabel.setText("Bienvenido, "+ nickname + "!");
    }

    @FXML
    public void onHandleKeyTextField(KeyEvent event) {
        System.out.println(event.getText());
    }

}
