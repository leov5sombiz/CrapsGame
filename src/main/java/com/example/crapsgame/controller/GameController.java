package com.example.crapsgame.controller;

import com.example.crapsgame.model.alert.AlertBox;
import com.example.crapsgame.model.player.Player;
import com.example.crapsgame.view.GameStage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class GameController {
    private Player player;

    @FXML
    void onHandleButtonPlay(ActionEvent event) {
        String title = "Información el Juego";
        String header = "Bienvenida";
        String content = "Bienvenido " + player.getNickname() + ", en este juego podrás jugar de la sig. manera";
        AlertBox alertBox = new AlertBox();
        alertBox.showAlert(title, header, content);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
